package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    private final Map<String, Boolean> airportMap;

    public FlightSearch() {
        this.airportMap = addNewAirport();
    }
    private Map<String, Boolean> addNewAirport() {
        Map<String, Boolean> airportList = new HashMap<>();
        airportList.put("WAR", true);
        airportList.put("LODZ", true);
        airportList.put("CRA", false);
        airportList.put("LON", false);
        airportList.put("BER", true);

        return airportList;
    }

    private boolean findAirport(String airportName) throws RouteNotFoundException{
        if (airportMap.containsKey(airportName)) {
            return airportMap.get(airportName);
        }else{
            throw new RouteNotFoundException("Airport does not exist! Please, choose another");
        }
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }

}
