public class CabinCrewMember extends Person {

    private String name;
    private String announcement;

    CabinCrewMember(String name,String announcement){
        super(name);
        this.announcement = announcement;
    }

    public String getName(){
        return name;
    }

    public String getAnnouncement(){
        return announcement;
    }



}
