package com.kodilla.good.patterns.LOT;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LotTestSuite {
    private static LotService lotService;
    private static FlightDb flightDbMock;
    private static Set<FlightsScheddule> availableFlights;

    @BeforeClass
    public static void beforeClass() {
        flightDbMock = mock(FlightDb.class);
        lotService = new LotService(flightDbMock);
        availableFlights = new HashSet<>();
        availableFlights.add(new FlightsScheddule("LON", "SIN"));
        availableFlights.add(new FlightsScheddule("SIN", "GDA"));
        availableFlights.add(new FlightsScheddule("LON", "LA"));
        availableFlights.add(new FlightsScheddule("GDA", "LA"));
        availableFlights.add(new FlightsScheddule("SIN", "LA"));
        availableFlights.add(new FlightsScheddule("LON", "GDA"));
    }

    @Test
    public void testAvailableFlightsFrom() {
        //Given
        String departureAirport = "LON";
        Set<FlightsScheddule> expected = new HashSet<>();
        expected.add(new FlightsScheddule("LON", "SIN"));
        expected.add(new FlightsScheddule("LON", "LA"));
        expected.add(new FlightsScheddule("LON", "GDA"));
        //When
        when( flightDbMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<FlightsScheddule> result = lotService.availableFlightsFrom(departureAirport);
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNoAvailableFlightsFrom() {
        //Given
        String departureAirport = "LA";
        Set<FlightsScheddule> expected = new HashSet<>();
        //When
        when( flightDbMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<FlightsScheddule> result = lotService.availableFlightsFrom(departureAirport);
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testAvailableFlightsTo() {
        //Given
        String arrivalAirport = "LA";
        Set<FlightsScheddule> expected = new HashSet<>();
        expected.add(new FlightsScheddule("LON", "LA"));
        boolean add = expected.add( new FlightsScheddule( "GDA", "LA" ) );
        expected.add(new FlightsScheddule("SIN", "LA"));
        //When
        when( flightDbMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<FlightsScheddule> result = lotService.availableFlightsTo(arrivalAirport);
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNoAvailableFlightsToTest() {
        //Given
        String arrivalAirport = "LON";
        Set<FlightsScheddule> expected = new HashSet<>();
        //When
        when( flightDbMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<FlightsScheddule> result = lotService.availableFlightsTo(arrivalAirport);
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testAvailableConnectingFlightsTest() {
        //Given
        String departureAirport = "LON";
        String arrivalAirport = "LA";
        Set<List<FlightsScheddule>> expected = new HashSet<>();

        List<FlightsScheddule> lonSinLa = new ArrayList<>();
        lonSinLa.add(new FlightsScheddule("LON", "SIN"));
        lonSinLa.add(new FlightsScheddule("SIN", "LA"));

        expected.add(lonSinLa);

        List<FlightsScheddule> lonGdaLa = new ArrayList<>();
        lonGdaLa.add(new FlightsScheddule("LON", "GDA"));
        lonGdaLa.add(new FlightsScheddule("GDA", "LA"));

        expected.add(lonGdaLa);
        //When
        when( flightDbMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<List<FlightsScheddule>> result = lotService.availableConnectingFlights(departureAirport, arrivalAirport);
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNoAvailableConnectingFlightsTest() {
        //Given
        String departureAirport = "LA";
        String arrivalAirport = "GDA";
        Set<List<FlightsScheddule>> expected = new HashSet<>();

        //When
        when( flightDbMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<List<FlightsScheddule>> result = lotService.availableConnectingFlights(departureAirport, arrivalAirport);
        //Then
        Assert.assertEquals(expected, result);
    }
}

