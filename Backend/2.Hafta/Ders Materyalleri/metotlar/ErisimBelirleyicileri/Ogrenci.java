package ErisimBelirleyicileri;

public class Ogrenci {
    public  int id;
    public  String isim;
    public  String soyisim;
    private  String cinsiyet;

    // Constructor (Yapıcı Metot)
    public Ogrenci(String Pcinsiyet) {

        cinsiyet = Pcinsiyet;
    }




    public String getCinsiyet() {
        System.out.println("cinsiyet = "+ cinsiyet);
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
        System.out.println("cinsiyet = "+ cinsiyet);

    }
}
