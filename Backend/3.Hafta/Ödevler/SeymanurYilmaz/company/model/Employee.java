package company.model;

import company.Payable;

public abstract class Employee implements Payable {

    // Ortak özellikler
    private String name;
    private String surname;
    private int ID;
    private int workYear;

    // Constructor
    public Employee(String name, String surname, int ID, int workYear) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.workYear = workYear;
    }

    // Her sınıfın kendi maaş hesaplamasını yapacak metot
    public abstract double calculateSalary();

    // Sabit şirket adı
    public final String companyName = "Global Tech";

    // Getter ve Setter metotları
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getID() {
        return ID;
    }

    public int getWorkYear() {
        return workYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setWorkYear(int workYear) {
        this.workYear = workYear;
    }

    // Çalışan bilgilerini yazdırmak için kullanılan metot
    @Override
    public String toString() {
        return String.format(" %s | ID: %d | Ad: %s %s | Yıl: %d | Maaş: %.2f TL",
               companyName, ID, name, surname, workYear, calculateSalary());
    }
}
