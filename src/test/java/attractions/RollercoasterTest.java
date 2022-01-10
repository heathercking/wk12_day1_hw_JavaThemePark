package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(19, 1.5, 40.0);
        visitor2 = new Visitor(11, 1.2, 40.0);
        visitor3 = new Visitor(19, 2.1, 40.0);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canCheckIfVisitorIsAllowedTrue() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void canCheckIfVisitorIsAllowedFalse() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canChargePeopleOver200cmDoublePrice() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor3), 0.0);
    }

    @Test
    public void canNotChargePeopleUnder200cmDoublePrice() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor2), 0.0);
    }
}
