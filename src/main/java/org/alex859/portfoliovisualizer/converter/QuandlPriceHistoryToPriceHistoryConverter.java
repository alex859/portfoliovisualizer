package org.alex859.portfoliovisualizer.converter;

import org.alex859.portfoliovisualizer.model.Price;
import org.alex859.portfoliovisualizer.model.PriceHistory;
import org.alex859.portfoliovisualizer.model.generated.quandl.QuandlPriceHistory;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class QuandlPriceHistoryToPriceHistoryConverter implements Converter<QuandlPriceHistory, PriceHistory>
{
    private static final Logger LOG = LoggerFactory.getLogger(QuandlPriceHistoryToPriceHistoryConverter.class);

    private static final String SEPARATOR = "_";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_DATE;

    @Override
    public PriceHistory convert(final QuandlPriceHistory source)
    {
        Assert.notNull(source, "Source price history cannot be null");

        final PriceHistory priceHistory = new PriceHistory();
        final String symbol = getSymbol(source.getCode());
        priceHistory.setSymbol(symbol);
        priceHistory.setFrom(LocalDate.from(FORMATTER.parse(source.getFromDate())));
        priceHistory.setTo(LocalDate.from(FORMATTER.parse(source.getToDate())));

        priceHistory.setPrices(source.getData().stream()
            .map(objects -> getPrice(objects, symbol))
                .collect(Collectors.toList()));

        return priceHistory;
    }

    private Price getPrice(final List<Object> objects, final String symbol)
    {
        Assert.isTrue(CollectionUtils.size(objects) == 6, "Price representation has to have 6 elements");

        final Price price = new Price();
        price.setSymbol(symbol);
        price.setDateTime(LocalDate.from(FORMATTER.parse((String) objects.get(0))).atTime(0, 0));
        price.setPrice((Double) objects.get(4));

        return price;
    }

    private String getSymbol(final String code)
    {
        Assert.hasText(code, "Code cannot be empty");

        return code.split(SEPARATOR)[1];
    }
}
