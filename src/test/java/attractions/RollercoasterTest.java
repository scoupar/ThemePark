package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.nio.channels.AsynchronousServerSocketChannel;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(10, 140.0, 5.0);
        visitor2 = new Visitor(15, 210.0, 5.0);

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
    public void isHeightAndAgeRestricted(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void hasPriceForTallPeople(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.0);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.0);
    }
}
