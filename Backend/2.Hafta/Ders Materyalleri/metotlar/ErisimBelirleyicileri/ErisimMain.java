package ErisimBelirleyicileri;

public class ErisimMain {

    public static void main(String[] args) {

   Ogrenci ogrenci = new Ogrenci("Erkek");

    ogrenci.id=111;
    ogrenci.isim="Emirşah";
    ogrenci.soyisim ="Yıldız";

    System.out.println("Öğrencinin  Bilgileri");
        System.out.println("İD : " +ogrenci.id);
        System.out.println("İsim : " +ogrenci.isim);
        System.out.println("Soyisim : " +ogrenci.soyisim);
        ogrenci.getCinsiyet();
        ogrenci.setCinsiyet("kız");




    }
}
