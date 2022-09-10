public enum Plane {

    EMBRAER_145(49,20000),

    AIRBUS_A350(300,275000),

    BOEING_777(317,340400);

    private int capacity;
    private int totalWeight;

    Plane(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getTotalWeight(){
        return totalWeight;
    }

}
