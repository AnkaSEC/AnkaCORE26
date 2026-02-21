package school;
import school.model.Student;
import school.service.StudentService;

import java.util.Scanner;

// Programı başlatacağımız sınıf
// Kullanıcıdan input alarak gerekli metotları çalıştırır
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();
        boolean running = true; // Programın çalışmaya devam edip etmeyeceğini kontrol eder



        // Tabloyu gösteren kısım. Kullanıcı burdan istediği işlemi seçer
        while (running) {

            service.showMenu();
            int secim = scanner.nextInt();
            scanner.nextLine();


            switch (secim) {
                case 1:
                    System.out.print("Eklenecek öğrenciyi adını giriniz: ");
                    String name = scanner.nextLine();

                    System.out.print("Eklenecek öğrenci numarasını giriniz: ");
                    int number = scanner.nextInt();

                    System.out.print("Ekenecek öğrencinin 1. notu: ");
                    int note1 = scanner.nextInt();

                    System.out.print("Ekenecek öğrencinin 2. notu: ");
                    int note2 = scanner.nextInt();

                    System.out.print("Ekenecek öğrencinin 3. notu: ");
                    int note3 = scanner.nextInt();

                    Student student = new Student(name, number, note1, note2, note3);
                    service.addStudent(student);

                    System.out.println("Öğrenci başarıyla eklendi.");
                    break;

                case 2:

                    service.listStudent();
                    break;

                case 3:
                    Student best = service.findBestStudent();
                    if (best != null) {
                        System.out.println(
                                "En Başarılı Öğrenci: " +
                                        best.getName() +
                                        " | Ortalama: " +
                                        best.calculateAverage()
                        );
                    } else {
                        System.out.println("Henüz öğrenci yok.");
                    }
                    break;
                case 4:

                    running = false;
                    System.out.println("Çıkış yapıldı.");
                    break;

                default:
                    System.out.println("Geçersiz seçim!");
            }
        }

        scanner.close();
    }
}
