package org.alex859.portfoliovisualizer.util;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureUtil
{
    public static <T> CompletableFuture<List<T>> joinCompletableFuture(final List<CompletableFuture<T>> futures)
    {
        return CompletableFuture
                .allOf(futures.toArray(new CompletableFuture[futures.size()]))
                .thenApplyAsync(v -> futures.stream()
                        .map(CompletableFuture::join)
                        .collect(Collectors.toList()));
    }
}
