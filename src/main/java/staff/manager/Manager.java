package staff.manager;

import staff.Employee;

public class Manager extends Employee {

    private String departmentName;

    public Manager(String name, String nationalInsurance, double salary, String departmentName) {
        super(name, nationalInsurance, salary);
        this.departmentName = "Finance";
    }

    public String getDepartmentName(){
        return this.departmentName;
    }

}
