package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 3);
        visitor = new Visitor(10, 15.0, 15.0);
        visitor2 = new Visitor(25, 15.5, 200.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void isAgeRestricted(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
        assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void hasRating(){
        assertEquals(3, tobaccoStall.getRating());
    }
}
