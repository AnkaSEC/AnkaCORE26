package company.model;

public class Intern extends Employee{
    private double dailyWage;
    private int workedDays;

    public Intern(String name, String surname, int ID, int workYear,
                  double dailyWage, int workedDays) {
        super(name, surname, ID, workYear);
        this.dailyWage = dailyWage;
        this.workedDays = workedDays;
    }


    @Override
    public double calculateSalary() {
        return dailyWage * workedDays;
    }

    @Override
    public String toString() {
        return "[STAJYER] " + super.toString();
    }


}
