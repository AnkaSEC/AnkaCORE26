package company.model;

public class Manager extends Employee{
    private double baseSalary;
    private double bonus;

    public Manager(String name, String surname, int ID, int workYear,
                   double baseSalary, double bonus) {
        super(name, surname, ID, workYear);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }


    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        return "[MÜDÜR] " + super.toString();
    }


}
