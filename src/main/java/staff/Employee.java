package staff;

public abstract class Employee {

    String name;
    String nationalInsurance;
    double salary;

    public Employee(String name, String nationalInsurance, double salary){
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getNationalInsurance(){
        return this.nationalInsurance;
    }

    public double getSalary(){
        return this.salary;
    }

    public void changeSalary(double salaryIncrease){
        this.salary += salaryIncrease;
    }

    public double getBonus(){
        return this.salary / 100;
    }

}
