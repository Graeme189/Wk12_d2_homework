package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 8.40);
        visitor1 = new Visitor(17, 150, 50);
        visitor2 = new Visitor(11, 150, 70);
        visitor3 = new Visitor(17, 130, 50);
        visitor4 = new Visitor(17, 210, 50);
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
    public void canVisitRollerCoasterAge() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void cannotVisitRollerCoasterAge() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void cannotVisitRollerCoasterHeight() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void setDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.001);
    }

    @Test
    public void chargeDefaultPrice(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor3), 0.001);

    }

    @Test
    public void chargeDoublePrice(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor4), 0.001);
    }
}
