package fourthweek;

public class File {

//    File Sınıfı: Dosya sistemi ile temel işlemler
//    FileInputStream/FileOutputStream: Byte tabanlı dosya okuma/yazma
//    FileReader/FileWriter: Karakter tabanlı dosya işlemleri

//    public static void main(String[] args) {
//        // Dosyaya yazma (FileWriter)
//        try (FileWriter fw = new FileWriter("C:\\Users\\test\\notlar.txt")) {
//            fw.write("Java Programlama\n");
//            fw.write("Dosya İşlemleri\n");
//            fw.write("FileWriter ve FileReader");
//            System.out.println("Dosyaya yazma başarılı.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Dosyadan okuma (FileReader)
//        try (FileReader fr = new FileReader("C:\\Users\\test\\notlar.txt")) {
//            int karakter;
//            System.out.println("\nDosya içeriği:");
//            while ((karakter = fr.read()) != -1) {
//                System.out.print((char) karakter);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


//    BufferedReader/BufferedWriter: Tampon kullanarak performanslı işlemler

//    public static void main(String[] args) {
//        // BufferedWriter ile yazma
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\test\\ogrenciler.txt"))) {
//            bw.write("Ahmet Yılmaz");
//            bw.newLine(); // Satır atlama
//            bw.write("Ayşe Demir");
//            bw.newLine();
//            bw.write("Mehmet Kaya");
//            System.out.println("Öğrenciler kaydedildi.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // BufferedReader ile okuma
//        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\test\\ogrenciler.txt"))) {
//            String satir;
//            System.out.println("\nÖğrenci listesi:");
//            while ((satir = br.readLine()) != null) {
//                System.out.println(satir);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


//    StringBuilder/StringBuffer: String manipülasyonu ve performans farkları

//    public static void main(String[] args) {
//        // StringBuilder örneği (hızlı, thread-safe değil)
//        StringBuilder sb = new StringBuilder("Merhaba");
//
//        sb.append(" Dünya");
//        sb.insert(7, "Java ");
//        sb.replace(0, 7, "Selam");
//        sb.delete(5, 10);
//
//        System.out.println("StringBuilder sonuç: " + sb.toString());
//        System.out.println("Uzunluk: " + sb.length());
//        System.out.println("Kapasite: " + sb.capacity());
//
//        // StringBuffer örneği (thread-safe, yavaş)
//        StringBuffer sbf = new StringBuffer("Java");
//
//        sbf.append(" Programlama");
//        sbf.reverse(); // Ters çevirme
//
//        System.out.println("\nStringBuffer sonuç: " + sbf.toString());
//
//        // Performans karşılaştırması
//        long baslangic, bitis;
//
//        // StringBuilder performansı
//        baslangic = System.currentTimeMillis();
//        StringBuilder sb1 = new StringBuilder();
//        for (int i = 0; i < 100000; i++) {
//            sb1.append("a");
//        }
//        bitis = System.currentTimeMillis();
//        System.out.println("\nStringBuilder süresi: " + (bitis - baslangic) + " ms");
//
//        // StringBuffer performansı
//        baslangic = System.currentTimeMillis();
//        StringBuffer sbf1 = new StringBuffer();
//        for (int i = 0; i < 100000; i++) {
//            sbf1.append("a");
//        }
//        bitis = System.currentTimeMillis();
//        System.out.println("StringBuffer süresi: " + (bitis - baslangic) + " ms");
//    }


//    Math Sınıfı: Matematiksel işlemler ve hazır metodlar

//    public static void main(String[] args) {
//        // Temel matematik işlemleri
//        System.out.println("Math Sınıfı Örnekleri:");
//        System.out.println("PI sayısı: " + Math.PI);
//        System.out.println("E sayısı: " + Math.E);
//
//        // Mutlak değer
//        System.out.println("|-5| = " + Math.abs(-5));
//
//        // Üs alma
//        System.out.println("2^3 = " + Math.pow(2, 3));
//
//        // Karekök
//        System.out.println("√16 = " + Math.sqrt(16));
//
//        // Maksimum ve minimum
//        System.out.println("Max(10, 20) = " + Math.max(10, 20));
//        System.out.println("Min(10, 20) = " + Math.min(10, 20));
//
//        // Yuvarlama işlemleri
//        double sayi = 5.67;
//        System.out.println("Yuvarlama (round): " + Math.round(sayi));
//        System.out.println("Aşağı yuvarlama (floor): " + Math.floor(sayi));
//        System.out.println("Yukarı yuvarlama (ceil): " + Math.ceil(sayi));
//
//        // Trigonometrik işlemler
//        System.out.println("sin(90°) = " + Math.sin(Math.toRadians(90)));
//        System.out.println("cos(0°) = " + Math.cos(0));
//
//        // Rastgele sayı üretme
//        System.out.println("Rastgele sayı: " + Math.random());
//        System.out.println("1-10 arası rastgele: " + (int)(Math.random() * 10 + 1));
//    }



//    Date Sınıfı: Tarih/zaman işlemleri ve formatlama

//    public static void main(String[] args) {
//        // Current date and time
//        Date simdi = new Date();
//        System.out.println("Şu anki tarih: " + simdi);
//
//        // Tarih formatlama
//        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf3 = new SimpleDateFormat("dd MMMM yyyy EEEE");
//
//        System.out.println("Gün/Ay/Yıl: " + sdf1.format(simdi));
//        System.out.println("Saat:Dakika:Saniye: " + sdf2.format(simdi));
//        System.out.println("Detaylı tarih: " + sdf3.format(simdi));
//
//        // Calendar sınıfı ile tarih işlemleri
//        Calendar cal = Calendar.getInstance();
//
//        // Tarih bilgilerini alma
//        System.out.println("\nCalendar ile:");
//        System.out.println("Yıl: " + cal.get(Calendar.YEAR));
//        System.out.println("Ay: " + (cal.get(Calendar.MONTH) + 1)); // 0'dan başlar
//        System.out.println("Gün: " + cal.get(Calendar.DAY_OF_MONTH));
//        System.out.println("Saat: " + cal.get(Calendar.HOUR_OF_DAY));
//        System.out.println("Dakika: " + cal.get(Calendar.MINUTE));
//
//        // Tarih ekleme/çıkarma
//        cal.add(Calendar.DAY_OF_MONTH, 7); // 7 gün sonra
//        System.out.println("7 gün sonra: " + sdf1.format(cal.getTime()));
//
//        cal.add(Calendar.MONTH, -1); // 1 ay önce
//        System.out.println("1 ay önce: " + sdf1.format(cal.getTime()));
//
//        // İki tarih karşılaştırma
//        Date tarih1 = new Date();
//        Date tarih2 = new Date(System.currentTimeMillis() + 86400000); // 1 gün sonra
//
//        if (tarih1.before(tarih2)) {
//            System.out.println("\ntarih1, tarih2'den önce");
//        }
//
//        System.out.println("Tarih farkı (ms): " + (tarih2.getTime() - tarih1.getTime()));
//        System.out.println("Tarih farkı (gün): " +
//                (tarih2.getTime() - tarih1.getTime()) / (1000 * 60 * 60 * 24));
//    }

}
