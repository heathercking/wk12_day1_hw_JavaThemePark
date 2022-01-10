package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating, int visitCount) {
        super(name, rating, visitCount);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() <= 15;
    }
}
