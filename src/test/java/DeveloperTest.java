import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jeff", "JK39809870L", 45000.00);
    }

    @Test
    public void developerHasAName(){
        assertEquals("Jeff", developer.getName());
    }

    @Test
    public void developerHasNINO(){
        assertEquals("JK39809870L", developer.getNINO());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(45000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(400.00);
        assertEquals(45400.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(450.00, developer.payBonus(), 0.01);
    }

}
