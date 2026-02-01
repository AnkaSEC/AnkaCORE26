# Siber Güvenlik Mühendisliği Eğitimi - 2026

**"Balık verme, tutmayı öğret."**

Bu repo, Siber Güvenlik Mühendisliği eğitim programının ödev teslim ve kaynak yönetim merkezidir. Amacımız sadece araç kullanan operatörler değil, sistemin mimarisini anlayan mühendisler yetiştirmektir.

---

## 📅 HAFTA 1: Dijital Savaş Alanı ve CTI (Tehdit İstihbaratı)

**Durum:** 🟢 Aktif
**Son Teslim:** Cuma 23:59

### 🚀 Görev Özeti
Bu hafta bilgisayarın çalışma mantığından (Transistör/OSI) başlayıp, modern savunma hatlarına (EDR/XDR) uzanan bir yolculuğa çıkıyoruz. Haftanın görevi ise gerçek bir CTI (Tehdit İstihbaratı) analizi yapmaktır.

---

### 📝 Görev 1: Gölge Analist Raporu (Proje Ödevi)

Aşağıdaki başlıkları içeren, kendi cümlelerinizle yazılmış, teknik ve kurumsal bir dille hazırlanmış bir **PDF Raporu** hazırlamanız gerekmektedir.

> **Uyarı:** Copy-Paste veya direkt Yapay Zeka çıktısı kabul edilmeyecektir. Analiz ve yorum yeteneğiniz değerlendirilecektir.

#### **Bölüm A: Savunma Mimarisi ve Teknoloji Entegrasyonu**

Bir kurumun siber güvenlik altyapısını kuran "Baş Mühendis" olduğunuzu varsayın. Aşağıdaki teknoloji gruplarını, **tanımlarını yazmadan**, bir saldırı senaryosu içindeki **görevlerini ve birbirleriyle olan ilişkilerini** anlatacak şekilde raporlayın.

Amacımız "Nedir?" sorusuna cevap vermek değil, "Neden buna ihtiyacımız var ve nerede konumlanır?" mantığını kavramaktır.

**1. Ağ ve Çevre Güvenliği (Sınır Hattı)**
Saldırgan henüz ağa girmeye çalışırken onu karşılayan teknolojileri kurgulayın:
* **Firewall & IDS/IPS:** Kapıdaki kilit (Firewall) ile harekete duyarlı alarm (IDS/IPS) arasındaki farkı ve iş birliğini açıklayın. Biri engellerken diğeri neden sadece izler?
* **NDR (Network Detection and Response):** Trafik şifreli olsa bile veya Firewall atlatılsa bile, NDR ağ içindeki anormallikleri (Örn: Yan ağa sıçrama) nasıl yakalar?

**2. Uç Nokta Savunması (Son Kale)**
Saldırgan ağı aşıp bir laptopa veya sunucuya (Endpoint) ulaştığında devreye giren mekanizmayı analiz edin:
* **Antivirüs vs EDR:** Klasik bir Antivirüs imza tabanlı çalışırken, EDR (Endpoint Detection and Response) davranışsal olarak nasıl fark yaratır? "Dosyasız saldırıları" (Fileless Malware) hangisi yakalar?

**3. Operasyon Merkezi ve Görünürlük (Beyin Takımı)**
Toplanan tüm bu verilerin işlendiği merkezi yapıyı özetleyin:
* **SOC & SIEM:** Firewall, EDR ve Sunuculardan gelen binlerce log (kayıt), SIEM üzerinde nasıl anlamlı bir alarma dönüşür? SOC analisti bu ekranda ne görür?
* **SOAR:** Tespit edilen bir tehdide (Örn: Phishing maili) insan müdahalesi olmadan otomatik cevap vermek (IP engellemek, kullanıcıyı izole etmek) için SOAR nasıl kullanılır?

**4. Genişletilmiş ve Yönetilen Hizmetler (Büyük Resim)**
Güvenlik mimarisini bir adım öteye taşıyan modern kavramları konumlandırın:
* **XDR (Extended Detection and Response):** EDR sadece bilgisayara, NDR sadece ağa bakarken; XDR bu ikisini ve daha fazlasını (E-mail, Cloud) nasıl birleştirir?
* **MDR (Managed Detection and Response):** Şirketin kendi SOC ekibi yoksa veya yetersizse, MDR hizmeti bu boşluğu insan kaynağı ve uzmanlık olarak nasıl doldurur?

> **İpucu:** Raporunuzda bu terimleri bir "Futbol Takımı" veya "Kale Savunması" analojisi kullanarak anlatmanız, mantığı kavradığınızı göstermenin en iyi yoludur.

#### **Bölüm B: Teknik Sözlük ve Kavram Avı**

Bir mühendis, karmaşık kavramları basitçe açıklayabilen kişidir. Aşağıdaki terimleri **"Nedir?"** ve **"Neden Önemlidir?"** sorularını kapsayacak şekilde, **kendi cümlelerinizle (Maksimum 2 cümle)** açıklayın.

> **Örnek:**
> **Yanlış:** Firewall, ağ güvenliğini sağlayan cihazdır.
> **Doğru:** Firewall, ağa giren ve çıkan paketleri belirlenen kurallara göre süzen, istenmeyen trafiği engelleyen bir kapı kontrol mekanizmasıdır.

**1. Temel Yapıtaşları ve Ağ**
* [cite_start]**Transistör & Bilgisayar:** En temelden başlarsak; transistörlerin açılıp kapanması (0-1) ile modern işletim sistemlerinin çalışması arasındaki bağı nasıl kurarsınız? [cite: 2, 3]
* [cite_start]**OSI vs TCP/IP:** OSI modeli teorik bir referans iken, TCP/IP neden günümüz internetinin pratik temelidir? [cite: 4, 5]
* [cite_start]**Kriptografi:** Veriyi şifrelemek neden sadece gizlilik için değil, aynı zamanda veri bütünlüğü (integrity) için de önemlidir? [cite: 14]

**2. Saldırı Vektörleri (Offensive Terminology)**
* **Sosyal Mühendislik & Phishing:** Bir sistemi hacklemek yerine insanı hacklemek (Social Engineering) neden daha kolaydır? [cite_start]Phishing ve E-mail Spoofing arasındaki teknik fark nedir? [cite: 8, 9, 23]
* [cite_start]**Malware Dünyası:** Genel bir terim olan Malware ile özel bir tehdit olan Ransomware (Fidye Yazılımı) arasındaki fark nedir? [cite: 10, 11]
* [cite_start]**Zero-Day (Sıfır Gün):** Bir zafiyetin "Zero-Day" olarak adlandırılması, savunma tarafı için neden bir kabustur? [cite: 16]

**3. Savunma Mekanizmaları (Defensive Terminology)**
* [cite_start]**Yama (Patch) Yönetimi:** Güvenlik güncellemelerini (Patch) zamanında yapmamak ile Güvenlik Açığı (Vulnerability) oluşması arasında nasıl bir ilişki vardır? [cite: 7, 12, 18]
* **Kimlik ve Erişim:** Parola neden yetmez? [cite_start]İki Faktörlü Kimlik Doğrulama (2FA) güvenliği matematiksel olarak nasıl artırır? [cite: 6]
* **Tünelleme ve Gizlilik:** VPN (Sanal Özel Ağ) kullanmak bizi internette tamamen görünmez yapar mı, yoksa sadece tünel mi oluşturur? [cite_start]SSL/TLS protokolü bu tünelin neresindedir? [cite: 19, 21]

**4. Standartlar ve Süreçler**
* **Zafiyet Taraması:** Ağ zafiyet taraması yapmak ile Sızma Testi (Pentest) yapmak arasındaki temel fark nedir? (Biri otomatik, biri manuel mi?)[cite_start]. [cite: 15, 35]
* **Regülasyonlar:** ISO 27001, NIST veya GDPR gibi standartlar teknik birer araç mıdır, yoksa bir yönetim anlayışı mıdır? [cite_start]Bir mühendis neden bunları bilmelidir? [cite: 22, 47]

#### **Bölüm C: CTI ve İstihbarat Odaklı Vaka Analizi**

**Senaryo:**
[cite_start]SOC ekibindeki nöbetiniz sırasında, sorumluluğunuzdaki kritik bir sunucunun `45.128.232.67` IP adresi ile şüpheli bir trafik oluşturduğunu tespit ettiniz[cite: 25].

**🚨 Kritik Kural (OpSec):** Şüpheli IP adresiyle ASLA doğrudan etkileşime girmeyin (Ping atmayın, tarayıcıda açmayın). [cite_start]Bu, saldırganı uyarabilir[cite: 27].

Bu bölümde, bir "Operatör" gibi sadece tuşlara basmak yerine, bir "Analist" gibi veriyi yorumlamanız beklenmektedir.

---

**1. Adım: Pasif İstihbarat Toplama (CTI)**
[cite_start]Sadece **Pasif CTI Kaynaklarını** (VirusTotal, AbuseIPDB, Cisco Talos, AlienVault OTX vb.) kullanarak bu IP adresini araştırın[cite: 26]. Aşağıdaki soruları verilerle destekleyerek yanıtlayın:

* **Kimlik Tespiti:** Bu IP adresi hangi ülkeye ve hangi organizasyona (ISP/ASN) aittir?
* [cite_start]**Sicil Kaydı:** Bu IP daha önce hangi saldırı türleriyle (Brute Force, Phishing, Port Scan vb.) veya hangi zararlı yazılım aileleriyle (Malware Families) ilişkilendirilmiş?[cite: 10, 24].
* **Zaman Çizelgesi:** Bu IP ile ilgili raporlamalar yeni mi (son 24 saat), yoksa eski bir tehdit mi?

---

**2. Adım: Terminoloji ve Yapılandırma (Applied Concepts)**
Bulduğunuz verileri teknik terminolojiye dökün. Aşağıdaki kavramları **bu vaka üzerinden** açıklayın (Tanım kopyalamak yasak):

* **IOC (Indicator of Compromise):** Bu senaryodaki "IOC" tam olarak nedir? Sadece IP adresi midir, yoksa URL veya dosya hash'i de olabilir mi? [cite_start]Bu vakadaki IOC verisini teknik bir formatta yazın[cite: 65].
* **CTI (Cyber Threat Intelligence):** Sadece "IP adresi Rusya'da" demek bir **Veri (Data)**'dir. Bunu **İstihbarat (Intelligence)**'a dönüştüren şey nedir? [cite_start]Bu IP'nin şirketiniz için neden tehdit oluşturduğunu "Bağlam" (Context) katarak açıklayın[cite: 24, 48].
* **MISP (Malware Information Sharing Platform):** Diyelim ki bu IP'nin yeni bir Fidye Yazılımı (Ransomware) yaydığını keşfettiniz. [cite_start]Bu bilgiyi MISP gibi bir platformda paylaşmak, diğer kurumların savunmasına (Mavi Takım) nasıl yardımcı olur?[cite: 66].

---

**3. Adım: Karar ve Aksiyon (Actionable Intelligence)**
[cite_start]Topladığınız istihbarat sonucunda bir karar vermeniz gerekiyor[cite: 26]. Yöneticinize sunacağınız kısa sonuç paragrafını yazın:

* **Karar:** `[Engelle / İzle / Serbest Bırak]`
* **Gerekçe:** "VirusTotal skoru X olduğu için..." gibi basit değil, "Bu IP, Cobalt Strike C2 sunucusu olarak bilindiği ve sunucumuzla iletişim kurmaya çalıştığı için..." şeklinde teknik bir gerekçe sunun.

#### **Bölüm D: Kriz Yönetimi ve Olay Müdahale Refleksleri**

Bir siber güvenlik mühendisi, sistemler çalışırken değil, çöktüğünde belli olur. Bu bölümde teknik bilginizi, süreç yönetimi ve kriz iletişimi ile birleştirmeniz beklenmektedir.

Aşağıdaki senaryoları "Ben olsaydım şöyle yapardım" diyerek adım adım, gerekçeleriyle birlikte açıklayın.

**1. Senaryo: Fidye Yazılımı (Ransomware) Kıyameti**
Şirketin finans departmanından bir kullanıcı aradı ve "Ekranımda kırmızı bir kilit resmi var, dosyalarım açılmıyor" dedi. [cite_start]Bu bir fidye yazılımı saldırısıdır[cite: 11, 39].
* **Acil Müdahale:** Panik yapmadan atacağınız **ilk 3 teknik adım** nedir? (İpucu: Fişi çekmek veri kaybına yol açabilir mi? Ağı izole etmek daha mı mantıklı?) [cite_start][cite: 39, 40].
* **Analiz:** Bu zararlının sisteme nasıl girdiğini bulmak için hangi loglara bakarsınız?

**2. Senaryo: Oltalama (Phishing) Dedektifliği**
[cite_start]CEO'dan geldiği iddia edilen "Acil Fatura Ödemesi" konulu şüpheli bir e-posta inceliyorsunuz[cite: 9, 43].
* [cite_start]**Teknik İnceleme:** E-postanın sahte olduğunu kanıtlamak için hangi teknik parametrelere (Header analizi, Gönderici IP, URL yapısı vb.) bakarsınız?[cite: 23, 43].
* [cite_start]**Önlem:** Bu saldırının diğer çalışanlara ulaşmasını engellemek için hangi güvenlik cihazında (Email Gateway, Firewall vb.) kural yazarsınız?[cite: 43, 44].

**3. Süreç ve İletişim: "Mavi Takım" Ruhu**
Siber olaylara müdahale sadece teknik bir iş değildir, bir süreçtir.
* [cite_start]**Standartlar:** Olay müdahale sürecinizi (Hazırlık -> Tespit -> Sınırlama -> Temizleme -> Kurtarma) hangi uluslararası standarda (Örn: NIST veya ISO 27001) dayandırırsınız?[cite: 22, 46, 47].
* **Kriz İletişimi:** Saldırı devam ederken yönetim sizden sürekli bilgi istiyor ve ortam çok gergin. [cite_start]Ekip içindeki paniği önlemek ve yönetimi doğru bilgilendirmek için nasıl bir iletişim stratejisi izlersiniz? [cite: 50-53].

**4. Vizyon: Güncel Kalma Sanatı**
Siber tehditler her gün değişiyor (Zero-Day, yeni exploitler).
* [cite_start]Kendinizi güncel tutmak için takip ettiğiniz 3 somut kaynak (Web sitesi, Twitter hesabı, CVE veritabanı vb.) nedir?[cite: 55, 56].



---

### 📤 Nasıl Teslim Ederim? (Fork & Pull Request)

Ödevinizi **PDF** formatında max. 5-6 sayfa hazırladıktan sonra aşağıdaki adımları izleyerek profesyonel bir şekilde teslim edin.

**Dosya Adı Formatı:** `Ad_Soyad_Odev1.pdf` (Örn: `Ali_Yilmaz_Odev1.pdf`)

1.  **Fork:** Bu repoyu sağ üstteki "Fork" butonuna basarak kendi GitHub profilinize kopyalayın.
2.  **Upload:** Kendi profilinizde oluşan repoya gidin, `Hafta-1/Ödevler` klasörüne girin ve dosyanızı yükleyin ("Add file" -> "Upload files").
3.  **Commit:** Değişiklikleri kaydedin (Commit changes).
4.  **Pull Request (PR):**
    * Reponun ana sayfasına dönün.
    * "Contribute" -> "Open Pull Request" butonuna tıklayın.
    * Başlık olarak `Ad Soyad - Hafta 1 Teslimi` yazın ve gönderin.

---

### 📚 Kritik Kavramlar ve İpuçları
Rapora başlamadan önce aşağıdaki temel kavramların üzerinden geçmeniz önerilir:

* [cite_start]**Ağ Temelleri:** OSI Referans Modeli [cite: 4] [cite_start]ve TCP/IP Modeli [cite: 5] arasındaki farkları anlamak, paket analizi için şarttır.
* [cite_start]**Savunma Hattı:** Güvenlik Duvarlarının (Firewall) temel işlevleri [cite: 28] [cite_start]ile IDS/IPS sistemlerinin çalışma mantığını [cite: 31, 32] ayırt etmelisiniz.
* [cite_start]**Kriptografi ve Gizlilik:** Verilerin ağda nasıl şifrelendiğini anlamak için SSL/TLS [cite: 21] [cite_start]ve VPN [cite: 19] kavramlarına hakim olun.
* [cite_start]**Tehditler:** Zero-Day (Sıfır Gün) saldırılarının neden tehlikeli olduğunu [cite: 16] [cite_start]ve Phishing [cite: 9] [cite_start]ile Malware [cite: 10] arasındaki farkları senaryolarınızda kullanın.

*Başarılar, Mühendis Adayları.*