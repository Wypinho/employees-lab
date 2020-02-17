import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jeff", "JK39809870L", 35000.00);
    }

    @Test
    public void databaseAdminHasAName(){
        assertEquals("Jeff", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNINO(){
        assertEquals("JK39809870L", databaseAdmin.getNINO());
    }

    @Test
    public void databaseAdminHasSalary(){
        assertEquals(35000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(400.00);
        assertEquals(35400.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350.00, databaseAdmin.payBonus(), 0.01);
    }
}
