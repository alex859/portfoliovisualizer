package org.alex859.portfoliovisualizer.converter;

import org.alex859.portfoliovisualizer.model.CurrentPrice;
import org.alex859.portfoliovisualizer.model.generated.google.FinanceCurrentPrice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.Assert;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinanceCurrentPriceToCurrentPriceConverter implements Converter<FinanceCurrentPrice, CurrentPrice>
{
    private static final Logger LOG = LoggerFactory.getLogger(FinanceCurrentPriceToCurrentPriceConverter.class);

    private final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ISO_DATE_TIME;
    private final ThreadLocal<NumberFormat> NUMBER_FORMATTER_THREAD_LOCAL = ThreadLocal.withInitial(() -> NumberFormat
            .getNumberInstance(Locale.ENGLISH));
    private final Pattern pattern = Pattern.compile("^([A-Za-z]+).*");

    @Override
    public CurrentPrice convert(final FinanceCurrentPrice financeCurrentPrice)
    {
        Assert.notNull(financeCurrentPrice, "Current input price cannot be null");

        final CurrentPrice currentPrice = new CurrentPrice();

        Assert.hasText(financeCurrentPrice.getL(), "Price cannot be empty");
        currentPrice.setPrice(parse(financeCurrentPrice.getL()));

        Assert.hasText(financeCurrentPrice.getC(), "Change cannot be empty");
        currentPrice.setChange(parse(financeCurrentPrice.getC()));

        currentPrice.setChangePercentage(financeCurrentPrice.getCp());
        currentPrice.setDateTime(LocalDateTime.from(DATE_TIME_FORMATTER.parse(financeCurrentPrice.getLtDts())));
        currentPrice.setSymbol(financeCurrentPrice.getT());
        currentPrice.setCurrency(getCurrency(financeCurrentPrice.getLCur()));

        return currentPrice;
    }

    private String getCurrency(final String str)
    {
        Assert.hasText(str, "Input price with currency currency cannot be empty");

        final Matcher matcher = pattern.matcher(str);
        if (matcher.matches())
        {
            return matcher.group(1);
        }

        return null;
    }

    private Double parse(final String str)
    {
        try
        {
            return NUMBER_FORMATTER_THREAD_LOCAL.get().parse(str).doubleValue();
        }
        catch (ParseException e)
        {
            final String message = String.format("Error parsing string [%s]", str);
            LOG.error(message, e);
            throw new IllegalArgumentException(message, e);
        }
    }

}
