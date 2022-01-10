package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isOldEnough(Visitor visitor) {
        return visitor.getAge() > 12;
    }

    public boolean isTallEnough(Visitor visitor) {
        return visitor.getHeight() > 1.45;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (isOldEnough(visitor) && isTallEnough(visitor)) {
            return true;
        }
        return false;
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2.0) {
            return defaultPrice() * 2;
        }
        return defaultPrice();
    }
}
