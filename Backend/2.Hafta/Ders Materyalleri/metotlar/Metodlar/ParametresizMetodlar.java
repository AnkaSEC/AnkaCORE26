package Metodlar;

public class ParametresizMetodlar {


    public static void main(String[] args) {

        // TODO  METODLARI ÇAGIRMA

        //  Nese oluşturma
        ParametresizMetodlar metodlar = new ParametresizMetodlar();

        // selemla metodunu çağırdık:
        metodlar.selamla();

        // gelenMesaj metodunu çağırdık:
        String gelenMesaj= metodlar.mesajGetir();
        System.out.println("Gelen  mesaj : " + gelenMesaj);

        //   sayiGetir metodunu çağırdık:
        int sonuc = metodlar.sayiGetir();
        System.out.println("Gelen sayı: " + sonuc);

        // metod  static olduğu için  nesne oluşturmadan direkt class ismi ile erişip metodu çağırdık
        ParametresizMetodlar.bilgileriGoster();
    }



    // TODO  METODLARI TANIMLAMA

    // Void Metod tanımlama

public void selamla() {


     System.out.println("Arkadaşlar sunuma Hoş Geldiniz!");

     // todo void = geri değer döndürmez demektir.
 }

    // String Metod tanımlama
  public String mesajGetir() {   // parametre yok

        return "Merhaba Dünya!";
    }

    // İnt Metod tanımlama
   public int sayiGetir() {

        return 10;
    }

    // static ile tanımlama
  public static void bilgileriGoster() {

        System.out.println("Benim Adım Emirşah");

    }








}



