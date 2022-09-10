public class Passenger {

    private String name;
    private int bags;

    public Passenger(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Passenger(int bags){
        this.bags = bags;
    }

    public int getBags(){
        return bags;
    }
}
