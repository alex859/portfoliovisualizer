package org.alex859.portfoliovisualizer.model;

import com.google.common.base.MoreObjects;

import java.time.LocalDate;
import java.util.List;

public class PriceHistory
{
    private LocalDate from;
    private LocalDate to;
    private List<Price> prices;
    private String symbol;

    public LocalDate getFrom()
    {
        return from;
    }

    public void setFrom(final LocalDate from)
    {
        this.from = from;
    }

    public LocalDate getTo()
    {
        return to;
    }

    public void setTo(final LocalDate to)
    {
        this.to = to;
    }

    public List<Price> getPrices()
    {
        return prices;
    }

    public void setPrices(final List<Price> prices)
    {
        this.prices = prices;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public void setSymbol(final String symbol)
    {
        this.symbol = symbol;
    }

    @Override
    public String toString()
    {
        return MoreObjects.toStringHelper(this)
                .add("from", from)
                .add("to", to)
                .add("prices", prices)
                .add("symbol", symbol)
                .toString();
    }
}
