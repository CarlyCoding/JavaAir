import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Flight_Test {

    Flight flight;

    Passenger passenger1;


    @Before
    public void setUp() {
        flight = new Flight(
                Plane.EMBRAER_145,
                new Pilot("Kelly", Rank.CAPTAIN, "BN5R4", "Cabin crew seats for landing"),
                new CabinCrewMember("Jennifer", "Chicken or Beef", Rank.PURSER),
                "LER345",
                "LSI", "EDI", "3PM");
        flight.bookPassengerOnFlight(new Passenger("Carly Officer", 2));
        flight.bookPassengerOnFlight(new Passenger("Steven Officer", 1));
        flight.bookPassengerOnFlight(new Passenger("Bella Officer", 3));
        passenger1 = new Passenger("Ryan Howard", 4);
    }

    @Test
    public void hasDestination() {
        assertEquals("LSI", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("3PM", flight.getDepartureTime());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("LER345", flight.getFlightNumber());
    }

    @Test
    public void pilotCanMakeAnnouncement(){
        assertEquals("Cabin crew seats for landing", flight.getPilotAnnouncement());
    }

    @Test
    public void cabinCrewCanMakeAnnouncement(){
        assertEquals("Chicken or Beef", flight.getCabinCrewAnnouncement());
    }

    @Test
    public void hasAvailableSeats(){
        assertEquals(46, flight.getAvailableSeats());
    }


    @Test
    public void canBookPassengerOnFlight(){
        flight.bookPassengerOnFlight(passenger1);
        assertEquals(45, flight.getAvailableSeats());
    }

    public void cantBookPassengersOnFlight(){

    }
}