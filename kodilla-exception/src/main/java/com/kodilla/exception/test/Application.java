package com.kodilla.exception.test;

public class Application {
    public static void main(String[] args) {
        Flight warLodz = new Flight("CRA", "WAR");
        Flight craLon = new Flight("LON", "CRA");
        Flight warBer = new Flight("BERLIN", "WARSAW");

        FlightSearch flightSearch = new FlightSearch();

        try {
            boolean findWarLodz = flightSearch.findFlight(warLodz);
            System.out.println("Flight WARSAW - CRACOW: " + findWarLodz);
        } catch (RouteNotFoundException e) {
            System.out.println("Please check airport name.");
        }

        try {
            boolean findCraLon = flightSearch.findFlight(craLon);
            System.out.println("Flight CRACOW - LONDON: " + findCraLon);
        } catch (RouteNotFoundException e) {
            System.out.println("Please check airport name.");
        }

        try {
            boolean findWarBer = flightSearch.findFlight(warBer);
            System.out.println("Flight WARSAW - BERLIN: " + findWarBer);
        } catch (RouteNotFoundException e) {
            System.out.println("Please check airport name.");
        }

    }
}
