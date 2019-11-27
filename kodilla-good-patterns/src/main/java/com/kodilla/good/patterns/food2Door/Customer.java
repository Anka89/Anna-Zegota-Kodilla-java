package com.kodilla.good.patterns.food2Door;

public class Customer {
    private String name;
    private String surname;
    private String ID;

    public Customer(String ID, String name, String surname) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (!getSurname().equals( customer.getSurname() ) && (!getName().equals( customer.getName() ))) {
            return false;
        }
        return getID().equals( customer.getID() );
    }

    @Override
    public int hashCode() {
        return getID().hashCode();
    }
}
