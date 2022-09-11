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

    public String flightNumber(){
        return flightNumber;
    }

    public String destination(){
        return destination;
    }

    public String departureAirport(){
        return departureAirport;
    }

    public String departureTime(){
        return departureTime;
    }





}
