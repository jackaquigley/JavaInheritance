import manager.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Jack", "ABC2231");
    }

    @Test
    public void managerHasName(){
        assertEquals("Jack", manager.getName());
    }

    @Test
    public void managerHasNationalInsurance(){
        assertEquals("ABC2231", manager.getNationalInsurance());
    }

}
