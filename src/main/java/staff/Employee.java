package staff;

public abstract class Employee {
    private String name;
    private String NINO;
    protected double salary;

    public Employee(String name, String NINO, double salary){
        this.name = name;
        this.NINO = NINO;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        }
    }

    public String getNINO() {
        return NINO;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double salaryIncrease){
        if (salaryIncrease > 0) {
            this.salary += salaryIncrease;
        }
    }

    public double payBonus(){
        return this.salary / 100;
    }
}
