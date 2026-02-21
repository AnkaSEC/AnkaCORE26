package Metodlar.ornek;


import java.util.Scanner;

public class Menu {



    static void main(String[] args) {

        calistir();
    }
    public  static void calistir() {



        Scanner oku = new Scanner(System.in);

        DortIslem hesap = new DortIslem();

        System.out.print("Birinci sayı: ");
        int s1 = oku.nextInt();

        System.out.print("İkinci sayı: ");
        int s2 = oku.nextInt();

        System.out.println("\nYapmak istediğin işlemi seç:");
        System.out.println("1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");

        int secim = oku.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Sonuç: " + hesap.topla(s1, s2));
                break;

            case 2:
                System.out.println("Sonuç: " + hesap.cikar(s1, s2));
                break;

            case 3:
                System.out.println("Sonuç: " + hesap.carp(s1, s2));
                break;

            case 4:
                System.out.println("Sonuç: " + hesap.bol(s1, s2));
                break;

            default:
                System.out.println("Hatalı seçim yaptın!");
        }
    }


    // todo import konusunda anlatılacak
    public  static void staticCagir(){
        System.out.println("Merhaba ben static örnek");
    }

}

