package org.alex859.portfoliovisualizer.model;

import com.google.common.base.MoreObjects;

import java.time.LocalDateTime;

public class Price
{
    private String symbol;
    private Double price;
    private String currency;
    private LocalDateTime dateTime;

    public String getSymbol()
    {
        return symbol;
    }

    public void setSymbol(final String symbol)
    {
        this.symbol = symbol;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(final Double price)
    {
        this.price = price;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(final String currency)
    {
        this.currency = currency;
    }

    public LocalDateTime getDateTime()
    {
        return dateTime;
    }

    public void setDateTime(final LocalDateTime dateTime)
    {
        this.dateTime = dateTime;
    }

    @Override
    public String toString()
    {
        return MoreObjects.toStringHelper(this)
                .add("symbol", symbol)
                .add("price", price)
                .add("currency", currency)
                .add("dateTime", dateTime)
                .toString();
    }
}
