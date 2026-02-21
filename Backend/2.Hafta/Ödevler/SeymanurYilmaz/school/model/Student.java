package school.model;

// Öğrenci bilgilerini ve notlarını tutan temel model sınıfımız
public class Student {

    // Verilerin dışardan kontrolsüzce değişimini engellemek için private olarak tanımladım
    private String name;
    private int number;
    private int note1;
    private int note2;
    private int note3;


    // Student nesnesi oluşturulurken gerekli tüm bilgileri zorunlu kılan constructor
    // Böylece eksik veya hatalı nesne oluşması engellenir
    public Student(String name, int number, int note1, int note2, int note3) {
        this.name = name;
        this.number = number;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
    }

    // private alanlara belirli erişime izin veren kısım
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getNote1() {
        return note1;
    }

    public int getNote2() {
        return note2;
    }

    public int getNote3() {
        return note3;
    }

    // Bu metot ortalama hesaplar. double dönmesinin sebebi de küsürata izin vermek içindir
    public double calculateAverage() {
        return (note1 + note2 + note3)/3.0;
    }

    // öğrencinin ortalamaya göre geçip geçmediğini gösteren metot
    public String getStatus() {
        if (calculateAverage() >= 50) {
            return "Geçti";
        } else {
            return "Kaldı";
        }
    }


}
