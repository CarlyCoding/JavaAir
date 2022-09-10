public class Pilot extends Person{

    private String name;
    private Rank rank;
    private String licenseNumber;

    private String flyPlane;

    public Pilot(String name, Rank rank, String licenseNumber, String flyPlane){
        super(name);
        this.rank = rank;
        this.licenseNumber = licenseNumber;
        this.flyPlane = flyPlane;
    }

    public String getName(){
        return name;
    }

    public Rank getRank(){
        return rank;
    }

    public String getLicenseNumber(){
        return licenseNumber;
    }

    public String getFlyPlane(){
        return flyPlane;
    }
}
