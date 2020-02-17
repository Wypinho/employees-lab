import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Jeff", "JK39809870L", 40000.00, "DevOps", 500000.00);
    }

    @Test
    public void directorHasAName(){
        assertEquals("Jeff", director.getName());
    }

    @Test
    public void directorHasNINO(){
        assertEquals("JK39809870L", director.getNINO());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(40000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(400.00);
        assertEquals(40400.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400.00, director.payBonus(), 0.01);
    }

    @Test
    public void directorHasDept(){
        assertEquals("DevOps", director.getDeptName());
    }

    @Test
    public void directorHasBudget(){
        assertEquals(500000.00, director.getBudget(), 0.01);
    }
}
