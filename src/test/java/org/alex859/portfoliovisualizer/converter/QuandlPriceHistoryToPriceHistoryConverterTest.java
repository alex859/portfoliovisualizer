package org.alex859.portfoliovisualizer.converter;

import org.alex859.portfoliovisualizer.model.Price;
import org.alex859.portfoliovisualizer.model.PriceHistory;
import org.alex859.portfoliovisualizer.model.generated.quandl.QuandlPriceHistory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class QuandlPriceHistoryToPriceHistoryConverterTest
{
    private static final String SYMBOL = "BKG";
    private static final String CODE = "LON_BKG";
    private static final String FROM_DATE = "1999-01-04";
    private static final LocalDate FROM_DATE_VALUE = LocalDate.of(1999, 1, 4);
    private static final String TO_DATE = "2000-01-04";
    private static final LocalDate TO_DATE_VALUE = LocalDate.of(2000, 1, 4);
    private static final Object[] PRICE1 = new Object[]{"2016-09-08", 2702.0, 2765.0, 2698.0, 2724.0, 574309.0};
    private static final LocalDate PRICE_1_DATE = LocalDate.of(2016, 9, 8);
    private static final Object[] PRICE2 = new Object[]{"2016-09-02", 2784.0, 2784.0, 2637.0, 2749.0, 1362098.0};
    private static final LocalDate PRICE_2_DATE = LocalDate.of(2016, 9, 2);

    @InjectMocks
    private QuandlPriceHistoryToPriceHistoryConverter converter;

    @Test
    public void convert() throws Exception
    {
        final PriceHistory result = converter.convert(getQuandlPriceHistory());

        assertNotNull(result);
        assertEquals(SYMBOL, result.getSymbol());
        assertEquals(FROM_DATE_VALUE, result.getFrom());
        assertEquals(TO_DATE_VALUE, result.getTo());
        assertNotNull(result.getPrices());
        assertEquals(2, result.getPrices().size());

        // TODO refactor
        final Price price1 = result.getPrices().get(0);
        assertNotNull(price1);
        assertEquals(PRICE_1_DATE, price1.getDateTime().toLocalDate());
        assertEquals(PRICE1[4], price1.getPrice());

        final Price price2 = result.getPrices().get(1);
        assertNotNull(price2);
        assertEquals(PRICE_2_DATE, price2.getDateTime().toLocalDate());
        assertEquals(PRICE2[4], price2.getPrice());
    }

    private QuandlPriceHistory getQuandlPriceHistory()
    {
        final QuandlPriceHistory quandlPriceHistory = new QuandlPriceHistory();
        quandlPriceHistory.setCode(CODE);
        quandlPriceHistory.setFromDate(FROM_DATE);
        quandlPriceHistory.setToDate(TO_DATE);
        quandlPriceHistory.setData(Arrays.asList(Arrays.asList(PRICE1), Arrays.asList(PRICE2)));

        return quandlPriceHistory;
    }

}