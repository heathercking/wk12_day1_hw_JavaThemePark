package attractions;

import behaviours.IReviewed;
import themePark.ThemePark;

public abstract class Attraction extends ThemePark {
//    private String name;
//    private int rating;
    private int visitCount;

//    public Attraction(String name, int rating, String name1, int rating1, int visitCount) {
//        super(name, rating);
//        this.name = name1;
//        this.rating = rating1;
//        this.visitCount = visitCount;
//    }


    public Attraction(String name, int rating, int visitCount) {
        super(name, rating);
        this.visitCount = visitCount;
    }

//    public String getName() {
//        return name;
//    }
//
//    public int getRating() {
//        return rating;
//    }

    public int getVisitCount() {
        return visitCount;
    }
}
