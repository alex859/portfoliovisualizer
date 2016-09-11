package org.alex859.portfoliovisualizer.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.alex859.portfoliovisualizer.converter.httpmessage.GoogleCurrentPriceMessageConverter;
import org.alex859.portfoliovisualizer.service.AsyncRestService;
import org.alex859.portfoliovisualizer.service.CurrentPriceProvider;
import org.alex859.portfoliovisualizer.service.PriceHistoryProvider;
import org.alex859.portfoliovisualizer.service.impl.DefaultAsyncRestService;
import org.alex859.portfoliovisualizer.service.impl.GoogleCurrentPriceProvider;
import org.alex859.portfoliovisualizer.service.impl.QuandlPriceHistoryProvider;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ServiceConfig
{
    @Bean
    public RestTemplate restTemplate(final RestTemplateBuilder builder,
                                     final ObjectMapper objectMapper)
    {
        final RestTemplate restTemplate = builder.build();
        restTemplate.getMessageConverters().add(0, new GoogleCurrentPriceMessageConverter(objectMapper));
        return restTemplate;
    }

    @Bean
    public AsyncRestService asyncRestService(final RestTemplate restTemplate)
    {
        return new DefaultAsyncRestService(restTemplate);
    }

    @Bean
    @ConfigurationProperties(prefix = "google-current-price")
    public CurrentPriceProvider googleCurrentPriceProvider(final AsyncRestService asyncRestService,
                                                           final ConversionService conversionService)
    {
        return new GoogleCurrentPriceProvider(asyncRestService, conversionService);
    }

    @Bean
    @ConfigurationProperties(prefix = "quandl-price-history")
    public PriceHistoryProvider quandlPriceHistoryProvider(final AsyncRestService asyncRestService,
                                                           final ConversionService conversionService)
    {
        return new QuandlPriceHistoryProvider(asyncRestService, conversionService);
    }
}
