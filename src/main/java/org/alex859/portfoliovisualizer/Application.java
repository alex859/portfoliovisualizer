package org.alex859.portfoliovisualizer;

import org.alex859.portfoliovisualizer.model.CurrentPrice;
import org.alex859.portfoliovisualizer.model.PriceHistory;
import org.alex859.portfoliovisualizer.model.Ticker;
import org.alex859.portfoliovisualizer.service.CurrentPriceProvider;
import org.alex859.portfoliovisualizer.service.PriceHistoryProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner
{

    @Autowired
    private CurrentPriceProvider currentPriceProvider;

    @Autowired
    private PriceHistoryProvider priceHistoryProvider;

    public static void main(final String[] args)
    {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(final String... args) throws Exception
    {
        final Ticker ticker1 = getTicker("BKG");
        final Ticker ticker2 = getTicker("TEF");
        final Ticker ticker3 = getTicker("SGP");
        final Collection<CurrentPrice> currentPrices = currentPriceProvider.get(ticker1, ticker2, ticker3).get();
        currentPrices.forEach(System.out::println);

        final List<PriceHistory> priceHistories = priceHistoryProvider.get(ticker1, ticker2, ticker3).get();
        priceHistories.forEach(System.out::println);
    }

    private Ticker getTicker(final String symbol)
    {
        final Ticker ticker = new Ticker();
        ticker.setMarket("LON");
        ticker.setSymbol(symbol);
        return ticker;
    }

}