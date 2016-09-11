package org.alex859.portfoliovisualizer.converter;

import org.alex859.portfoliovisualizer.model.CurrentPrice;
import org.alex859.portfoliovisualizer.model.generated.google.FinanceCurrentPrice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class FinanceCurrentPriceToCurrentPriceConverterTest
{
    private static final LocalDateTime DATE_NOW = LocalDateTime.now();
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ISO_DATE_TIME;
    private static final String DATE = DATE_TIME_FORMATTER.format(DATE_NOW);
    private static final String LAST_TRADE_PRICE = "1,234.54";
    private static final Double LAST_TRADE_PRICE_VALUE = 1234.54;
    private static final String CHANGE = "-52.98";
    private static final Double CHANGE_VALUE = -52.98;
    private static final String CHANGE_PERCENT = "-2.98";
    private static final String CURRENCY = "GBX";
    private static final String TICKER = "BKG";

    @InjectMocks
    private FinanceCurrentPriceToCurrentPriceConverter converter;

    @Test
    public void given_goodFinanceCurrentPrice_aCorrectCurrentPriceIsReturned()
    {
        final CurrentPrice currentPrice = converter.convert(getFinanceCurrentPrice());

        assertNotNull(currentPrice);
        assertEquals(TICKER, currentPrice.getSymbol());
        assertEquals(DATE_NOW, currentPrice.getDateTime());
        assertEquals(LAST_TRADE_PRICE_VALUE, currentPrice.getPrice());
        assertEquals(CHANGE_VALUE, currentPrice.getChange());
        assertEquals(CHANGE_PERCENT, currentPrice.getChangePercentage());
        assertEquals(CURRENCY, currentPrice.getCurrency());
    }


    private FinanceCurrentPrice getFinanceCurrentPrice()
    {
        return new FinanceCurrentPrice()
                .withLtDts(DATE)
                .withL(LAST_TRADE_PRICE)
                .withC(CHANGE)
                .withCp(CHANGE_PERCENT)
                .withLCur(CURRENCY + LAST_TRADE_PRICE)
                .withT(TICKER);
    }
}