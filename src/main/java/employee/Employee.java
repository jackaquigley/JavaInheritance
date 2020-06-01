package employee;

public abstract class Employee {

    String name;
    String nationalInsurance;

    public Employee(String name, String nationalInsurance){
        this.name = name;
        this.nationalInsurance = nationalInsurance;
    }

    public String getName(){
        return this.name;
    }

    public String getNationalInsurance(){
        return this.nationalInsurance;
    }

}
