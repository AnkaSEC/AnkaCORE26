package company.service;

import company.model.Employee;

public class EmployeeService {


    private Employee[] employees = new Employee[100];
    private int count = 0; // Eklenen personel sayısı

    // Personel ekleme
    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
            System.out.println(" Personel eklendi.");
        } else {
            System.out.println(" Kapasite dolu!");
        }
    }

    // Tüm personelleri listeleme metotu
    public void listEmployees() {
        System.out.println("\n--- PERSONEL LİSTESİ ---");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // En yüksek maaşı bulup gösteren metot
    public void showHighestSalary() {
        if (count == 0) {
            System.out.println("Hiç personel yok.");
            return;
        }

        Employee max = employees[0];

        for (int i = 1; i < count; i++) {
            if (employees[i].calculateSalary() > max.calculateSalary()) {
                max = employees[i];
            }
        }

        System.out.println("\n En Yüksek Maaşlı Personel:");
        System.out.println(max);
    }

    public void showMenu() {
        System.out.println("\n--- MENÜ ---");
        System.out.println("1 - Çalışan Ekle");
        System.out.println("2 - Müdür Ekle");
        System.out.println("3 - Stajyer Ekle");
        System.out.println("4 - Personelleri Listele");
        System.out.println("5 - En Yüksek Maaşı Göster");
        System.out.println("6 - Çıkış");
        System.out.print("Seçiminiz: ");
    }
}
