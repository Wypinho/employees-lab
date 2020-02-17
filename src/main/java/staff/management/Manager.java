package staff.management;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, String NINO, double salary, String deptName){
        super(name, NINO, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
