package org.alex859.portfoliovisualizer.service.impl;

import org.alex859.portfoliovisualizer.model.Price;
import org.alex859.portfoliovisualizer.model.PriceHistory;
import org.alex859.portfoliovisualizer.model.Ticker;
import org.alex859.portfoliovisualizer.model.generated.quandl.QuandlPriceHistory;
import org.alex859.portfoliovisualizer.properties.IntegrationProperties;
import org.alex859.portfoliovisualizer.service.AsyncRestService;
import org.alex859.portfoliovisualizer.service.PriceHistoryProvider;
import org.alex859.portfoliovisualizer.util.CompletableFutureUtil;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.ConversionService;
import org.springframework.util.Assert;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuandlPriceHistoryProvider implements PriceHistoryProvider
{
    private static final Logger LOG = LoggerFactory.getLogger(QuandlPriceHistoryProvider.class);
    private static final String SEPARATOR = "_";

    private final AsyncRestService asyncRestService;
    private final ConversionService conversionService;

    private IntegrationProperties properties;

    public QuandlPriceHistoryProvider(final AsyncRestService asyncRestService, final ConversionService conversionService)
    {
        this.asyncRestService = asyncRestService;
        this.conversionService = conversionService;
    }

    @Override
    public CompletableFuture<List<PriceHistory>> get(final Ticker... tickers)
    {
        Assert.isTrue(ArrayUtils.isNotEmpty(tickers), "At least one ticker");

        final List<CompletableFuture<PriceHistory>> futures = Stream.of(tickers)
                .map(this::getQuery)
                .map(properties.getEndpoint()::concat)
                .map(this::getHistoryFromRemoteService)
                .collect(Collectors.toList());

        return CompletableFutureUtil.joinCompletableFuture(futures);
    }

    private String getQuery(final Ticker ticker)
    {
        return String.join(SEPARATOR, ticker.getMarket(), ticker.getSymbol());
    }

    private CompletableFuture<PriceHistory> getHistoryFromRemoteService(final String url)
    {
        return asyncRestService.get(url, QuandlPriceHistory.class)
                .thenApplyAsync(this::convert);
    }

    private PriceHistory convert(final QuandlPriceHistory quandlPriceHistory)
    {
        return conversionService.convert(quandlPriceHistory, PriceHistory.class);
    }

    private Price convertToPrice(final List<Object> objects)
    {
        return conversionService.convert(objects, Price.class);
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
