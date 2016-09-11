package org.alex859.portfoliovisualizer.service.impl;

import org.alex859.portfoliovisualizer.service.AsyncRestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

public class DefaultAsyncRestService implements AsyncRestService
{
    private static final Logger LOG = LoggerFactory.getLogger(DefaultAsyncRestService.class);

    private final RestTemplate restTemplate;

    @Autowired
    public DefaultAsyncRestService(final RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    @Override
    public <T> CompletableFuture<T> get(final String url, final Class<T> clazz)
    {
        LOG.debug("Requesting resource [{}]", url);
        return CompletableFuture
                .supplyAsync(() -> restTemplate.getForEntity(url, clazz))
                .thenApplyAsync(this::readResponse);
    }

    private <T> T readResponse(final ResponseEntity<T> response)
    {
        if (HttpStatus.OK.equals(response.getStatusCode()))
        {
            return response.getBody();
        }

        // TODO deal with errors..maybe retry
        LOG.error("Error requesting something");
        throw new RuntimeException("Error");
    }
}
