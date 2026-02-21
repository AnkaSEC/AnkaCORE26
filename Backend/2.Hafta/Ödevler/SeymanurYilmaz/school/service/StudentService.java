package school.service;
import school.model.Student;

// Öğrencilerle ilgili işlemleri yöneten servis sınıfı.

public class StudentService {

    Student[] students = new Student[100]; // Dizinin boyutunu gösterir
    int count=0; // Dizide kaç öğrencinin olduğunu tutar

    // Diziye öğrenci ekleyen metot
    public void addStudent(Student s) {

        if (count < students.length) {
            students[count] = s;
            count++;
        } else {
            System.out.println("Öğrenci listesi dolu!");
        }

    }

    // Dizideki bütün kayıtlı öğrencileri listeler
    public void listStudent() {

        for (Student s : students) {
            if (s != null) {
                System.out.println("İsim : " + s.getName() + " | Numara : " + s.getNumber() +
                        " | Notlar : " + s.getNote1() + " , " + s.getNote2() + " , " + s.getNote3()
                + " | Ortalama : " + s.calculateAverage() + " | Durum : " + s.getStatus());
            }
        }

    }


    // Dizide dolaşarak notu en yüksek olan öğrenciyi bulur
    public Student findBestStudent() {

        Student bestStudent = students[0];
        for (int i = 1; i < count; i++) {

            if (students[i].calculateAverage() >
                    bestStudent.calculateAverage()) {

                bestStudent = students[i];
            }
        }
        return bestStudent;

    }

    // Kullanıcının seçim yapacağı tabloyu ekrana yazdırır
    public void showMenu() {

        System.out.println("---- ÖĞRENCİ NOT SİSTEMİ ----");
        System.out.println("1 - Öğrenci Ekle");
        System.out.println("2 - Öğrencileri Listele");
        System.out.println("3 - En Başarılı Öğrenciyi Göster");
        System.out.println("4 - Çıkış");
        System.out.print("Seçiminiz: ");

    }


}
