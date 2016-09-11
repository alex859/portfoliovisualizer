package org.alex859.portfoliovisualizer.service;

import org.alex859.portfoliovisualizer.model.CurrentPrice;
import org.alex859.portfoliovisualizer.model.Ticker;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public interface CurrentPriceProvider
{
    CompletableFuture<Collection<CurrentPrice>> get(Ticker... tickers);
}
