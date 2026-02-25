package company;

import company.service.EmployeeService;
import java.util.Scanner;
import company.model.*;


public class Main {
    public static void main(String[] args) {

        // Sistem açılış mesajı
        Worker temp = new Worker("Sistem", "Mesajı", 0, 0, 0);
        System.out.println("=== " + temp.companyName + " Personel Yönetim Sistemine Hoşgeldiniz ===");

        Scanner input = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {
            service.showMenu();
            int choice = input.nextInt();

            switch (choice) {
                // Çalışan ekleme
                case 1 -> {
                    System.out.print("Ad: ");
                    String name = input.next();
                    System.out.print("Soyad: ");
                    String surname = input.next();
                    System.out.print("ID: ");
                    int id = input.nextInt();
                    System.out.print("Çalışma yılı: ");
                    int year = input.nextInt();
                    System.out.print("Maaş: ");
                    double salary = input.nextDouble();

                    // Normal çalışan → Employee’ın concrete hali
                    Employee emp = new Worker(name, surname, id, year, salary); // Polymorphism
                    service.addEmployee(emp);
                }

                // Müdür ekleme
                case 2 -> {
                    System.out.print("Ad: ");
                    String name = input.next();
                    System.out.print("Soyad: ");
                    String surname = input.next();
                    System.out.print("ID: ");
                    int id = input.nextInt();
                    System.out.print("Çalışma yılı: ");
                    int year = input.nextInt();
                    System.out.print("Temel Maaş: ");
                    double base = input.nextDouble();
                    System.out.print("Bonus: ");
                    double bonus = input.nextDouble();

                    service.addEmployee(new Manager(name, surname, id, year, base, bonus)); // Polymorphism
                }

                // Stajyer ekleme
                case 3 -> {
                    System.out.print("Ad: ");
                    String name = input.next();
                    System.out.print("Soyad: ");
                    String surname = input.next();
                    System.out.print("ID: ");
                    int id = input.nextInt();
                    System.out.print("Çalışma yılı: ");
                    int year = input.nextInt();
                    System.out.print("Günlük Ücret: ");
                    double wage = input.nextDouble();
                    System.out.print("Gün Sayısı: ");
                    int days = input.nextInt();

                    service.addEmployee(new Intern(name, surname, id, year, wage, days)); // Polymorphism
                }

                case 4 -> service.listEmployees();  // Listeleme

                case 5 -> service.showHighestSalary(); // En yüksek maaş

                case 6 -> { // Çıkış
                    System.out.println("Programdan çıkılıyor...");
                    return;
                }

                default -> System.out.println("Geçersiz seçim!");
            }
        }
    }
}

