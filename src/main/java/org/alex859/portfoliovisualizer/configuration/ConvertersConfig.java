package org.alex859.portfoliovisualizer.configuration;

import org.alex859.portfoliovisualizer.converter.FinanceCurrentPriceToCurrentPriceConverter;
import org.alex859.portfoliovisualizer.converter.QuandlPriceHistoryToPriceHistoryConverter;
import org.alex859.portfoliovisualizer.model.CurrentPrice;
import org.alex859.portfoliovisualizer.model.PriceHistory;
import org.alex859.portfoliovisualizer.model.generated.google.FinanceCurrentPrice;
import org.alex859.portfoliovisualizer.model.generated.quandl.QuandlPriceHistory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.Set;

@Configuration
public class ConvertersConfig
{
    @Bean
    public ConversionService conversionService(final Set<Converter> converters)
    {
        final DefaultConversionService conversionService = new DefaultConversionService();
        converters.forEach(conversionService::addConverter);

        return conversionService;
    }

    @Bean
    public Converter<FinanceCurrentPrice, CurrentPrice> financeCurrentPriceToCurrentPriceConverter()
    {
        return new FinanceCurrentPriceToCurrentPriceConverter();
    }

    @Bean
    public Converter<QuandlPriceHistory, PriceHistory> quandlPriceHistoryPriceHistoryConverter()
    {
        return new QuandlPriceHistoryToPriceHistoryConverter();
    }
}
