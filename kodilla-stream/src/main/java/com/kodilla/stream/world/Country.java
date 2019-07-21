package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal peopleQuantity;
    private final String countryName;

    public Country(final BigDecimal peopleQuantity,final String countryName) {
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }


    public String getCountryName() {
        return countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return countryName.equals(country.countryName);
    }


}
