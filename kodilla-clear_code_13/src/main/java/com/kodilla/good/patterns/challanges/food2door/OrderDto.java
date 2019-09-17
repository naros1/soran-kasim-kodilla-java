package com.kodilla.good.patterns.challanges.food2door;

public class OrderDto {
    private String name;
    private String suraname;
    private boolean isOrdered;

    public OrderDto(final String name,final String suraname,final boolean isOrdered) {
        this.name = name;
        this.suraname = suraname;
        this.isOrdered = isOrdered;
    }

    public String getName() {
        return name;
    }

    public String getSuraname() {
        return suraname;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
