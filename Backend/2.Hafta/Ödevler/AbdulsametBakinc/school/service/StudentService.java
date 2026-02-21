package school.service;


import school.model.Student;

public class StudentService {
    private Student[] students = new Student[100];
    private int count = 0; // Şu anki öğrenci sayısı

    // Menüyü gösterme
    public void showMenu() {
        System.out.println("\n--- Öğrenci Bilgi Sistemi ---");
        System.out.println("1 - Öğrenci Ekle");
        System.out.println("2 - Öğrencileri Listele");
        System.out.println("3 - En Başarılı Öğrenciyi Göster");
        System.out.println("4 - Çıkış");
        System.out.print("Seçiminiz: ");
    }

    // Öğrenci Ekleme Metodu
    public void addStudent(String name, int number, int note1, int note2, int note3) {
        if (count < students.length) {
            Student newStudent = new Student(name, number, note1, note2, note3);
            students[count] = newStudent;
            count++;
            System.out.println("Öğrenci eklendi.");
        } else {
            System.out.println("100 öğrenci sayısı aşıldı!");
        }
    }

    // Öğrencileri Listeleme
    public void listStudents() {
        if (count == 0) {
            System.out.println("Listelenecek öğrenci yok.");
            return;
        }

        System.out.println("\n--- Öğrenci Listesi ---");
        // foreach döngüsü: Dizinin tamamını döner
        for (Student s : students) {
            // Dizi 100'lük ama hepsi dolu olmayabilir, null kontrolü şart
            if (s != null) {
                System.out.println("Ad: " + s.getName() +
                        " | No: " + s.getNumber() +
                        " | Ort: " + String.format("%.2f", s.calculateAverage()) +
                        " | Durum: " + s.getStatus());
            }
        }
    }

    // En Başarılı Öğrenciyi Bulma
    public void findBestStudent() {
        if (count == 0) {
            System.out.println("Kayıtlı öğrenci yok.");
            return;
        }

        Student bestStudent = students[0];

        // Klasik for döngüsü ile tarama
        for (int i = 1; i < count; i++) {
            if (students[i].calculateAverage() > bestStudent.calculateAverage()) {
                bestStudent = students[i];
            }
        }

        System.out.println("\nEn Başarılı Öğrenci: " + bestStudent.getName());
        System.out.println("Ortalama: " + bestStudent.calculateAverage());
    }

}
