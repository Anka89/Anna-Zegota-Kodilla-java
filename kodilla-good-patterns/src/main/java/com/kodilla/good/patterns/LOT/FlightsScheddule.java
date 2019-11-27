package com.kodilla.good.patterns.LOT;

public class FlightsScheddule {
        private String departureAirport;
        private String arrivalAirport;

        public FlightsScheddule(String departureAirport, String arrivalAirport) {
            this.departureAirport = departureAirport;
            this.arrivalAirport = arrivalAirport;
        }

        public String getDepartureAirport() {
            return departureAirport;
        }

        public String getArrivalAirport() {
            return arrivalAirport;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FlightsScheddule flight = (FlightsScheddule) o;

            if (!getDepartureAirport().equals(flight.getDepartureAirport())) return false;
            return getArrivalAirport().equals(flight.getArrivalAirport());
        }

        @Override
        public int hashCode() {
            int result = getDepartureAirport().hashCode();
            result = 31 * result + getArrivalAirport().hashCode();
            return result;
        }
}
