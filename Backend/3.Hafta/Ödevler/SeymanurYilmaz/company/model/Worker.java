package company.model;

public class Worker extends Employee{
    private double salary; // Sabit maaş


    public Worker(String name, String surname, int id,
                  int workYear, double salary) {
        super(name, surname, id, workYear);
        this.salary = salary;
    }

    // Maaş direkt döndürülür
    @Override
    public double calculateSalary() {
        return salary;
    }

    // Bir çalışanı ekrana yazdırırken hangi çalışan türüne ait olduğunu belli eden metot
    @Override
    public String toString() {
        return "[ÇALIŞAN] " + super.toString();

    }
}
