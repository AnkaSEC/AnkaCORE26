package Metodlar;

public class Overloading {


       /*

      TANIM : Aynı isimde birden fazla metod tanımlamaktır. Farklı parametre sayısı veya farklı
      parametre tiplerine sahip olmalıdır.

       */

    public static void main(String[] args) {


        Overloading overloading = new Overloading();
       int sonuc1=  overloading.topla(10,20);
        int sonuc2=     overloading.topla(30,40,50);
        double sonuc3=    overloading.topla(60.0,70.0);

        System.out.println("sonuc 1 : "+ sonuc1);
        System.out.println("sonuc 2 : "+ sonuc2);
        System.out.println("sonuc 3 : "+ sonuc3);




    }
        // 1. Metod - iki int
        public int topla(int a, int b) {
            return a + b;
        }
        // 2. Metod - üç int (farklı parametre sayısı)
        public int topla(int a, int b, int c) {
            return a + b + c;
        }
        // 3. Metod - iki double (farklı parametre tipi)
        public double topla(double a, double b) {
            return a + b;
        }

}

