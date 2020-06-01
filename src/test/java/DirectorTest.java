import org.junit.Before;
import org.junit.Test;
import staff.manager.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Sam", "ACD2222", 85000);
    }

    @Test
    public void directorHasName(){
        assertEquals("Sam", director.getName());
    }

}
