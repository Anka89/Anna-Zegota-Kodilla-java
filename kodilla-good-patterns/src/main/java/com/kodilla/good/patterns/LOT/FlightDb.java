package com.kodilla.good.patterns.LOT;

import java.util.Set;

public class FlightDb {
        private Set<FlightsScheddule> availableFlights;

        public FlightDb(Set<FlightsScheddule> availableFlights) {
            this.availableFlights = availableFlights;
        }

        public Set<FlightsScheddule> getAvailableFlights() {
            return availableFlights;
        }
}
