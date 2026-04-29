# Kütüphane Yönetim Sistemi (Backend Projesi)
Bu proje, bir kütüphanenin kitap, yazar, kategori ve ödünç alma süreçlerini yönetmek için Java Spring Boot kullanılarak geliştirilmiş bir RESTful API çalışmasıdır.

## Proje İçeriği ve Yapısı
Proje klasörü şu bileşenlerden oluşmaktadır:
library-management: Spring Boot kaynak kodları, konfigürasyon dosyaları ve bağımlılık yönetimi (pom.xml).
veritabani_yedek.sql: Projenin veritabanı şemasını ve test verilerini içeren PostgreSQL dump dosyası.
Test_Kanitlari: API endpoint'lerinin test edildiğini gösteren Postman ekran görüntüleri.

### Kullanılan Teknolojiler
Java 17
Spring Boot (Data JPA, Web)
PostgreSQL (Veritabanı)
Maven (Bağımlılık Yönetimi)
Postman (API Testleri)

#### Uygulanan İş Kuralları
Proje kapsamında aşağıdaki mantıksal kontroller (Business Rules) kodlanmıştır:
Stok Kontrolü: Mevcut kopyası (Available Copies) olmayan kitaplar ödünç verilemez.
Kullanıcı Durumu: Sadece active durumda olan kullanıcılar kitap ödünç alabilir.
İade Süreci: Kitap iade edildiğinde stok otomatik olarak artırılır.
Benzersiz Kayıt: Aynı isimde kategori veya aynı ISBN'de kitap eklenmesi engellenmiştir.

##### Kurulum ve Çalıştırma
veritabani_yedek.sql dosyasını PostgreSQL arayüzü (pgAdmin vb.) üzerinden library_db isimli bir veritabanına Restore/Import edin.
src/main/resources/application.properties dosyasındaki veritabanı kullanıcı adı ve şifresini yerel ayarlarınıza göre güncelleyin.
Projeyi IntelliJ IDEA veya terminal üzerinden ./mvnw spring-boot:run komutuyla başlatın.
API varsayılan olarak http://localhost:8080 portunda çalışacaktır.

🧪 API Testleri Hakkında Not
Postman masaüstü/web sürümündeki teknik dışa aktarma kısıtlamaları nedeniyle .json koleksiyon dosyası yerine, tüm senaryoların (Başarılı kayıt, Stok hatası, Pasif kullanıcı hatası vb.) doğrulandığı ekran görüntüleri Test_Kanitlari klasörüne detaylı olarak eklenmiştir.
