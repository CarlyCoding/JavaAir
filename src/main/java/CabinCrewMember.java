public enum CabinCrewMember {

    FLIGHT_ATTENDANT("Kelly", "The menu choice today is chicken or beef"),

    PURSER("Erin", "Cabin Crew seats for landing"),

    FIRST_OFFICER("Dwight", "Please stay seated while the seatbelt sign is on!"),

    CAPTAIN("Pamela", "We will be landing at Wilkes- Barre International in approx 10 minutes");

    private String name;
    private String announcement;

    CabinCrewMember(String name, String announcement){
        this.name = name;
        this.announcement = announcement;
    }

    public String getName(){
        return name;
    }

    public String getAnnouncement(){
        return announcement;
    }



}
