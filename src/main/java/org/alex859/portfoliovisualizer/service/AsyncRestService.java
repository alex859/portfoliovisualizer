package org.alex859.portfoliovisualizer.service;

import java.util.concurrent.CompletableFuture;

public interface AsyncRestService
{
    <T> CompletableFuture<T> get(String url, Class<T> clazz);
}
