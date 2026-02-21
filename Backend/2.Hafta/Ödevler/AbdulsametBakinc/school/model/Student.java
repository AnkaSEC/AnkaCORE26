package school.model;

public class Student {
    // Değişken belirleme
    private String name;
    private int number;
    private int note1;
    private int note2;
    private int note3;

    //this kullanımı
    public Student(String name, int number, int note1, int note2, int note3) {
        this.name = name;
        this.number = number;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
    }

    // ### Metotlar ###

    // Ortalama Hesaplama
    public double calculateAverage() {
        return (double) (note1 + note2 + note3) / 3;
    }


    // Öğrencinin geçti/kaldı durumu
    public String getStatus() {
        if (calculateAverage() >= 50) {
            return "Geçti";
        } else {
            return "Kaldı";
        }
    }

    // --- Getter methodları ---
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
