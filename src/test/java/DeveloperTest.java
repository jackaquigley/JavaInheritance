import org.junit.Before;
import org.junit.Test;
import staff.techstaff.*;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Bob", "FCS2131", 40000);
    }

    @Test
    public void developerHasName(){
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void developerHasNationalInsurance(){
        assertEquals("FCS2131", developer.getNationalInsurance());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(40000, developer.getSalary(), 0.1);
    }

}

