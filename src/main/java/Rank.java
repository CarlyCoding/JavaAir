public enum Rank {
    FLIGHT_ATTENDANT(4),

    PURSER(3),

    FIRST_OFFICER(2),

    CAPTAIN(1);

    private int rank;

    Rank(int rank){
        this.rank = rank;
    }

    public int getRank(){
        return rank;
    }
}
