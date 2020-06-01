import manager.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Jack");
    }

    @Test
    public void managerHasName(){
        assertEquals("Jack", manager.getName());
    }

}
