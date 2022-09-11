import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Flight_Test {

    Flight flight;


    @Before
    public void setUp(){
        flight = new Flight(Plane.EMBRAER_145,"LER345","LSI","EDI","3PM");
        flight.addCabinCrewMembers(new CabinCrewMember("Jennifer","Chicken or Beef",Rank.PURSER));
        flight.addPilot(new Pilot("Kelly",Rank.CAPTAIN,"BN5R4", "Cabin crew seats for landing"));
        flight.addPassengers(new Passenger("Carly Officer",2));
        flight.addPassengers(new Passenger("Steven Officer",1));
        flight.addPassengers(new Passenger("Bella Officer",3));
    }

    @Test
    public void hasDestination(){
        assertEquals("LSI", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("3PM", flight.getDepartureTime());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("LER345", flight.getFlightNumber());
    }

//            has departure time
//


//    @Test
//    public void canAddPassengers(){
//        ArrayList<Passenger> passengers = new ArrayList<~>();
//        passengers.add(new Passenger("Carly Officer", 2));
////        Need a size of list checkins here.
//    }
}
