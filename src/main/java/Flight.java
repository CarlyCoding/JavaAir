import java.util.ArrayList;
import java.util.HashMap;

public class Flight {

    private ArrayList<Passenger> passengers;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Pilot> pilots;
    private Plane plane;
    private Pilot pilot;
    private CabinCrewMember cabinCrewMember;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;



    public Flight(Plane plane, Pilot pilot,CabinCrewMember cabinCrewMember, String flightNumber, String destination, String departureAirport, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.pilots = new ArrayList<Pilot>();
        this.plane = plane;
        this.pilot = pilot;
        this.cabinCrewMember = cabinCrewMember;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }



    public void addCabinCrewMembers(CabinCrewMember cabinCrewMember){
        this.cabinCrewMembers.add(cabinCrewMember);
    }


    public int getAvailableSeats(){
        return this.plane.getCapacity() - this.passengers.size();
    }

    public void bookPassengerOnFlight(Passenger passenger){
        if (getAvailableSeats() > 0)
            this.passengers.add(passenger);
    }

    //    This is the "pilot announcement" signifying the pilot flying the plane
    public String getPilotAnnouncement(){
        return this.pilot.getFlyPlane();
    }


//    This is the cabin crew message to the passengers
    public String getCabinCrewAnnouncement(){
        return this.cabinCrewMember.getAnnouncement();
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
