import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jeff", "JK39809870L", 40000.00, "DevOps");
    }

    @Test
    public void managerHasAName(){
        assertEquals("Jeff", manager.getName());
    }

    @Test
    public void managerNameCanBeChanged(){
        manager.setName("Steve");
        assertEquals("Steve", manager.getName());
    }

    @Test
    public void managerNameCantBeNull(){
        manager.setName("");
        assertEquals("Jeff", manager.getName());
    }

    @Test
    public void managerHasNINO(){
        assertEquals("JK39809870L", manager.getNINO());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(40000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(400.00);
        assertEquals(40400.00, manager.getSalary(), 0.01);
    }

    @Test
    public void cantDecreaseSalary(){
        manager.raiseSalary(-400.00);
        assertEquals(40000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400.00, manager.payBonus(), 0.01);
    }

    @Test
    public void managerHasDept(){
        assertEquals("DevOps", manager.getDeptName());
    }
}
