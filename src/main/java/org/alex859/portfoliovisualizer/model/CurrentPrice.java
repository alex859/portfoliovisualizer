package org.alex859.portfoliovisualizer.model;

import com.google.common.base.MoreObjects;

public class CurrentPrice extends Price
{
    private Double change;
    private String changePercentage;

    public Double getChange()
    {
        return change;
    }

    public void setChange(final Double change)
    {
        this.change = change;
    }

    public String getChangePercentage()
    {
        return changePercentage;
    }

    public void setChangePercentage(final String changePercentage)
    {
        this.changePercentage = changePercentage;
    }

    @Override
    public String toString()
    {
        return MoreObjects.toStringHelper(this)
                .add("change", change)
                .add("changePercentage", changePercentage)
                .toString();
    }
}
