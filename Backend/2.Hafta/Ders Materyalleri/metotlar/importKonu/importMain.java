package importKonu;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import Metodlar.ParametreliMetod;
//import java.util.*;


public class importMain {

    public static void main(String[] args) {

        //   kendi paketindeki classı kullanırlken paketi import etmek gerekir ( örn: package importKonu;)

        Bilgi bilgi= new Bilgi();
        bilgi.goster();

//   başka paketteki classı kullanırken import etmek gerekir
        ParametreliMetod metod = new ParametreliMetod();


         System.out.println("Toplam : " + metod.topla(60,20));


    //  java  paketlerini tek tek import etme

        Scanner s;
        Random r;
        Data d;
        List<String> b;

        // todo NOT : Tüm paketleri import etmek için (*) işaretini kullanmak gerekir (örn :java.util.*)




    }
}
