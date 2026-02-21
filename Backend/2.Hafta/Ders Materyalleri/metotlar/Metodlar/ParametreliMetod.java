package Metodlar;






public class ParametreliMetod {

    public static void main(String[] args) {

        // TODO PARAMETRELİ METODLARI ÇAGIRMA

        ParametreliMetod metodParametreli = new ParametreliMetod();

        metodParametreli.selamla("Emirşah");

        metodParametreli.kareAl(5);

        metodParametreli.topla(3,5);

        int CarpimSonucu=   metodParametreli.carp(4,5);

    //    System.out.println("Carpim Sonucu: " + CarpimSonucu);
    }



    // TODO PARAMETRELİ METODLARI ÇAGIRMA

    public  void selamla(String isim) {
        System.out.println("Merhaba " + isim);

    }


    public void kareAl(int sayi) {
        System.out.println("Karesi: " + (sayi * sayi));
    }

    public   int  topla(int a, int b) {
        int sonuc = a+b;



        return sonuc;
    }

    public   int carp(int a, int b) {
        return a * b;
    }


}

