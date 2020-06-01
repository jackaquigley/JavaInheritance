package staff.manager;

public class Director extends Manager {
    private double budget;

    public Director(String name, String nationalInsurance, double salary, double budget) {
        super(name, nationalInsurance, salary);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }
}
