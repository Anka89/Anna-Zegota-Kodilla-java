package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent southAmerica = new Continent("South America");
        Continent australia = new Continent("Australia");
        Continent asia = new Continent("Asia");

        Country poland = new Country("Poland",new BigDecimal("123456789"));
        Country ukraine = new Country("Ukraine",new BigDecimal("123456789"));
        Country australiaCountry = new Country("Australia",new BigDecimal("123456789"));
        Country argentina = new Country("Argentina",new BigDecimal("123456789"));
        Country brazil = new Country("Brazil",new BigDecimal("123456789"));
        Country japan = new Country("Japan",new BigDecimal("123456789"));

        world.addContinent(europe);
        world.addContinent(southAmerica);
        world.addContinent(australia);
        world.addContinent(asia);


        europe.addCountry(poland);
        europe.addCountry(ukraine);;

        asia.addCountry(japan);

        southAmerica.addCountry(argentina);
        southAmerica.addCountry(brazil);

        australia.addCountry(australiaCountry);


        //When

        BigDecimal peopleQty = world.getPeopleQuantity();

        //Then
        BigDecimal peopleExpectedQty = new BigDecimal("740740734");
        Assert.assertEquals(peopleExpectedQty, peopleQty);
    }
}