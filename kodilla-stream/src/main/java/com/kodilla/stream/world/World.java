package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> worldConrinents = new ArrayList<>();


    public void addContinent(Continent continent) {
        worldConrinents.add(continent);
    }

    public boolean removeContinent(Continent continent) {
        return worldConrinents.remove(continent);
    }

    public BigDecimal getPeopleQuantity(){

        BigDecimal totalQuantity = worldConrinents.stream()
                .flatMap(continent -> continent.getCountryOnContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum, current) -> sum.add(current));
        return totalQuantity;

    }




}
