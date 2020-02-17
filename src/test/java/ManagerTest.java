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
}
