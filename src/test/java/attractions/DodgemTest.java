package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5, 0);
        visitor = new Visitor(11, 1.5, 40.0);
        visitor2 = new Visitor(13, 1.5, 40.0);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canChargePeopleUnder12HalfPrice() {
        assertEquals(2.25, dodgems.priceFor(visitor), 0.0);
    }

    @Test
    public void canNotChargePeopleOver12HalfPrice() {
        assertEquals(4.50, dodgems.priceFor(visitor2), 0.0);
    }
}
