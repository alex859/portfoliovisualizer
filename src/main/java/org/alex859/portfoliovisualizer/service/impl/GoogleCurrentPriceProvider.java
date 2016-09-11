package org.alex859.portfoliovisualizer.service.impl;

import org.alex859.portfoliovisualizer.model.CurrentPrice;
import org.alex859.portfoliovisualizer.model.Ticker;
import org.alex859.portfoliovisualizer.model.generated.google.FinanceCurrentPrice;
import org.alex859.portfoliovisualizer.properties.IntegrationProperties;
import org.alex859.portfoliovisualizer.service.AsyncRestService;
import org.alex859.portfoliovisualizer.service.CurrentPriceProvider;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.ConversionService;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GoogleCurrentPriceProvider implements CurrentPriceProvider
{
    private static final Logger LOG = LoggerFactory.getLogger(GoogleCurrentPriceProvider.class);

    private static final String PARAM_SEPARATOR = ",";
    private static final String TICKER_SEPARATOR = ":";

    private final AsyncRestService asyncRestService;
    private final ConversionService conversionService;
    private IntegrationProperties properties;

    public GoogleCurrentPriceProvider(final AsyncRestService asyncRestService, final ConversionService conversionService)
    {
        this.asyncRestService = asyncRestService;
        this.conversionService = conversionService;
    }

    @Override
    public CompletableFuture<Collection<CurrentPrice>> get(final Ticker... tickers)
    {
        Assert.isTrue(ArrayUtils.isNotEmpty(tickers), "At least one ticker");

        final String queryParam = Stream.of(tickers)
                .map(ticker -> String.join(TICKER_SEPARATOR, ticker.getMarket(), ticker.getSymbol()))
                .collect(Collectors.joining(PARAM_SEPARATOR));

        return asyncRestService.get(getUrl(queryParam), FinanceCurrentPrice[].class)
                .thenApplyAsync(this::convert);
    }

    private String getUrl(final String queryParam)
    {
        return properties.getEndpoint() + queryParam;
    }

    private Collection<CurrentPrice> convert(final FinanceCurrentPrice[] financeCurrentPrices)
    {
        return Arrays.stream(financeCurrentPrices)
                .map(financeCurrentPrice -> conversionService.convert(financeCurrentPrice, CurrentPrice.class))
                .collect(Collectors.toList());
    }

    public IntegrationProperties getProperties()
    {
        return properties;
    }

    public void setProperties(final IntegrationProperties properties)
    {
        this.properties = properties;
    }
}
