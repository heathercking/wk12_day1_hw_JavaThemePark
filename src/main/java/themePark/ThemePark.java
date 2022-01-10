package themePark;

import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

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

    public void visit(Attraction attraction, Visitor visitor) {
        attraction.incrementVisitCount();
        visitor.visitedAttraction(attraction);
    }


}
