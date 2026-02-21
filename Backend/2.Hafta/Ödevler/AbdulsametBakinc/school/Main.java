package school;

import school.service.StudentService;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();

        // Menü Döngüsü (while=true)
        while (true) {
            service.showMenu();                     // Menüyü gösterme
            int secim = scanner.nextInt();
            scanner.nextLine();                     // Scanner buffer silme

            // Menü Seçimleri (switch/case)
            switch (secim) {
                case 1:
                    System.out.print("Öğrenci Adı: ");
                    String name = scanner.nextLine();

                    System.out.print("Numarası: ");
                    int number = scanner.nextInt();

                    System.out.print("1. Not: ");
                    int not1 = scanner.nextInt();

                    System.out.print("2. Not: ");
                    int not2 = scanner.nextInt();

                    System.out.print("3. Not: ");
                    int not3 = scanner.nextInt();

                    service.addStudent(name, number, not1, not2, not3);
                    break;

                case 2:
                    service.listStudents();
                    break;

                case 3:
                    service.findBestStudent();
                    break;

                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return; // Main metodunu sonlandırır

                default:
                    System.out.println("Yanlış seçim.");
                    continue; // Döngü başına dönme
            }
        }
    }
}