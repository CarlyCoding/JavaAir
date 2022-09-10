public class CabinCrewMember extends Person {

    private String name;
    private String announcement;

    private Rank rank;

    CabinCrewMember(String name,String announcement, Rank rank){
        super(name);
        this.announcement = announcement;
        this.rank = rank;
    }

    public String getName(){
        return name;
    }

    public String getAnnouncement(){
        return announcement;
    }

    public Rank getRank(){
        return rank;
    }



}
