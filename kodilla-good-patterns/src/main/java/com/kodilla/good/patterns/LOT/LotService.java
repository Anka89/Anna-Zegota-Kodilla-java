package com.kodilla.good.patterns.LOT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LotService {
    private FlightDb flightDb;

    public LotService(FlightDb flightDb) {
        this.flightDb = flightDb;
    }

    public Set<FlightsScheddule> availableFlightsFrom(String departureAirport) {
        return flightDb.getAvailableFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect( Collectors.toSet());
    }

    public Set<FlightsScheddule> availableFlightsTo(String arrivalAirport) {
        return flightDb.getAvailableFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<List<FlightsScheddule>> availableConnectingFlights(String departureAirport, String arrivalAirport) {
        Set<List<FlightsScheddule>> setOfFlights = new HashSet<>();

        flightDb.getAvailableFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .forEach(flight -> {
                    List <FlightsScheddule> connection = flightDb.getAvailableFlights().stream()
                            .filter(fl -> (flight.getArrivalAirport().equals(fl.getDepartureAirport()) && fl.getArrivalAirport().equals(arrivalAirport)))
                            .collect(Collectors.toList());

                    if (connection.size() > 0) {
                        List<FlightsScheddule> flightsRoute = new ArrayList<>();
                        flightsRoute.add(flight);
                        flightsRoute.addAll(connection);
                        setOfFlights.add(flightsRoute);
                    }
                });
        return setOfFlights;
    }
}
