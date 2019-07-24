package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;


public final class Continent {
    private final String Name;
    private final List<Country> countries = new ArrayList<>();


    public Continent(final String continentName) {
        this.Name = continentName;
    }

    public void addCountry(Country country){
        countries.add(country);
    }

    public boolean removeCountry(Country country){
        return countries.remove(country);
    }

    public List<Country> getCountriesOnContinent() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return Name.equals(continent.Name);
    }


}
