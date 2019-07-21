package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;


public final class Continent {
    private final String continentName;
    private final List<Country> countryOnContinent = new ArrayList<>();


    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country){
        countryOnContinent.add(country);
    }

    public boolean removeCountry(Country country){
        return countryOnContinent.remove(country);
    }

    public List<Country> getCountryOnContinent() {
        return countryOnContinent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return continentName.equals(continent.continentName);
    }


}
