package themepark;

import attractions.Attraction;
import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import themePark.ThemePark;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void before() {
        themePark = new ThemePark("Alton Towers", 5);
        dodgems = new Dodgems("Bumper Cars", 5, 0);
        visitor = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void canIncrementAttractionVisitCount() {
        themePark.visit(dodgems, visitor);
        assertEquals(1, dodgems.getVisitCount());
    }

    @Test
    public void canAddAttractionToVisitorsList() {
        themePark.visit(dodgems, visitor);
        assertEquals(1, visitor.visitedAttractionsCount());
    }



}
