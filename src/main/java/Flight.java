import java.util.ArrayList;
import java.util.HashMap;

public class Flight {

    private ArrayList<Passenger> passengers;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Pilot> pilots;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.pilots = new ArrayList<Pilot>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

//    Get the number of seats available on the plane.
//    Book a passenger, if the seat number is viable.

    public void addPilot(Pilot pilot){
        this.pilots.add(pilot);
    }

    public void addCabinCrewMembers(CabinCrewMember cabinCrewMember){
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public void addPassengers(Passenger passenger){
        this.passengers.add(passenger);
    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public String getDestination(){
        return destination;
    }

    public String getDepartureAirport(){
        return departureAirport;
    }

    public String getDepartureTime(){
        return departureTime;
    }





}
