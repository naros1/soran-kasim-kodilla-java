package com.kodilla.stream.world;


import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country country1 = new Country(new BigDecimal("123456789"), "country1");
        Country country2 = new Country(new BigDecimal("123456789"), "country2");
        Country country3 = new Country(new BigDecimal("123456789"), "country3");
        Country country4 = new Country(new BigDecimal("123456789"), "country4");
        Country country5 = new Country(new BigDecimal("123456789"), "country5");
        Country country6 = new Country(new BigDecimal("123456789"), "country6");
        Country country7 = new Country(new BigDecimal("123456789"), "country7");
        Country country8 = new Country(new BigDecimal("123456789"), "country8");
        Country country9 = new Country(new BigDecimal("123456789"), "country9");
        Continent continent1 = new Continent("Continent1");
        Continent continent2 = new Continent("Continent2");
        Continent continent3 = new Continent("Continent3");
        World world = new World();

        //When
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent2.addCountry(country4);
        continent2.addCountry(country5);
        continent2.addCountry(country6);
        continent2.addCountry(country7);
        continent3.addCountry(country8);
        continent3.addCountry(country9);
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        //Then
        BigDecimal expectedQuantity = new BigDecimal("1111111101");
        Assert.assertEquals(expectedQuantity, world.getPeopleQuantity());
    }
}
