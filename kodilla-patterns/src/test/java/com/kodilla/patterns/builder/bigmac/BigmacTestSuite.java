package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bicmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Bułka z sezamem")
                .burgers(10)
                .ingredients("ser cheddar")
                .sauce("BBQ + Majonez")
                .ingredients("sałata")
                .ingredients("czerwona cebula")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);

    }
}
