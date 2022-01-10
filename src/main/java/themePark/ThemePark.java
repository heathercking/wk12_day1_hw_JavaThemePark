package themePark;

import behaviours.IReviewed;

public class ThemePark implements IReviewed {

    private String name;
    private int rating;

    public ThemePark(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

}
