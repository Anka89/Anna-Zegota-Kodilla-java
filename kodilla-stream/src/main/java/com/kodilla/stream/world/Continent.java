package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Continent {
   private final String continentName;
   private final Set<Country> countriesOnContinent = new HashSet<Country>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getListOfCountriesOnContinent() {
        return countriesOnContinent;
    }

    public boolean addCountry (Country country){
        return countriesOnContinent.add(country);
    }
}