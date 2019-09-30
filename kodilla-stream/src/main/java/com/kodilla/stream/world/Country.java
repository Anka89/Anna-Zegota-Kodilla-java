package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class Country {

        private final String countryName;
        private final BigDecimal peopleQty;
        private final Set<Country> countries = new HashSet<>();

        public Country(final String countryName, final BigDecimal peopleQty) {
            this.countryName = countryName;
            this.peopleQty = peopleQty;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Country country = (Country) o;

            return countryName.equals(country.countryName);
        }

        @Override
        public int hashCode() {
            return countryName.hashCode();
        }

        public BigDecimal getPeopleQuantity(){
            return peopleQty;
        }

    public Set<Country> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", peopleQty=" + peopleQty +
                '}';
    }
}