package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;


    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5, 4.50);
        visitor1 = new Visitor(17, 150, 50);
        visitor2 = new Visitor(11, 150, 70);
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
    public void checkDefaultPrice() {
        assertEquals(4.50, dodgems.priceFor(visitor1), 0.001);
    }

    @Test
    public void checkPriceForUnder12(){
        assertEquals(2.25, dodgems.priceFor(visitor2), 0.001);
    }
}
