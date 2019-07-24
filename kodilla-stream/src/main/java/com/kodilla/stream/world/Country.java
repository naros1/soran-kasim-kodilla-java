package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal peoplesCount;
    private final String name;

    public Country(final BigDecimal peopleQuantity,final String countryName) {
        this.peoplesCount = peopleQuantity;
        this.name = countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peoplesCount;
    }


    public String getCountryName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return name.equals(country.name);
    }


}
