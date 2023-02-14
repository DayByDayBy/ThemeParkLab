package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor shortOldVisitor;
    Visitor TallYoungVisitor;
    ArrayList<Attraction> visitedAttractions;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(23, 2.4, 300);
        shortOldVisitor = new Visitor(23, 1.2, 300);
        TallYoungVisitor = new Visitor(11, 1.7, 300);
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
    public void doTallPeoplePayMore() { assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.0);}

    @Test
    public void canShortOldPeopleRide(){assertEquals(false, rollerCoaster.isOldEnoughAndTallEnough(shortOldVisitor));

    }
    @Test
    public void canTallYoungPeopleRide(){assertEquals(false, rollerCoaster.isOldEnoughAndTallEnough(TallYoungVisitor));
    }
}