package stalls;

import behaviours.IReviewed;
import themePark.ThemePark;

public abstract class Stall extends ThemePark {

//    private String name;
    private String ownerName;
    private ParkingSpot parkingSpot;
//    private int rating;


    public Stall(String name, int rating, String ownerName, ParkingSpot parkingSpot) {
        super(name, rating);
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

//    public String getName() {
//        return name;
//    }

    public String getOwnerName() {
        return ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

//    public int getRating() {
//        return rating;
//    }
}
