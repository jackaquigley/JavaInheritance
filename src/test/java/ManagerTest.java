import org.junit.Before;
import org.junit.Test;
import staff.manager.*;

import static org.junit.Assert.assertEquals;


public class ManagerTest {

    private Manager manager;

    @Before
    public void setUp(){
        manager = new Manager ("Jack", "ABC2231", 22000, "Finance");
    }

    @Test
    public void managerHasName(){
        assertEquals("Jack", manager.getName());
    }

    @Test
    public void managerHasNationalInsurance(){
        assertEquals("ABC2231", manager.getNationalInsurance());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(22000.0, manager.getSalary(), 0.1);
    }

    @Test
    public void managerCanGetBonus(){
        assertEquals(220.0, manager.getBonus(), 0.1);
    }

    @Test
    public void managerCanChangeSalary(){
        manager.changeSalary(2200.0);
       assertEquals(24200.0, manager.getSalary(), 0.1);
    }

    @Test
    public void managerHasDepartmentName(){
        assertEquals("Finance", manager.getDepartmentName());
    }


}
