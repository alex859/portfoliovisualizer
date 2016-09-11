package org.alex859.portfoliovisualizer.service;

import org.alex859.portfoliovisualizer.model.PriceHistory;
import org.alex859.portfoliovisualizer.model.Ticker;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface PriceHistoryProvider
{
    CompletableFuture<List<PriceHistory>> get(Ticker... tickers);
}
