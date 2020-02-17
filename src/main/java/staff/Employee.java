package staff;

public abstract class Employee {
    private String name;
    private String NINO;
    private double salary;

    public Employee(String name, String NINO, double salary){
        this.name = name;
        this.NINO = NINO;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINO() {
        return NINO;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double salaryIncrease){
        this.salary += salaryIncrease;
    }

    public double payBonus(){
        return this.salary / 100;
    }
}
