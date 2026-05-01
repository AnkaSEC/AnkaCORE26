# 🦅 Siber Güvenlik Mühendisliği Eğitimi - 2026

> **"Sistemi hacklemek bir yetenektir; ancak sana saldıran o karanlık silahı (virüsü) izole bir odada kesip biçerek niyetini okumak saf mühendisliktir."**

Bu repo, AnkaCORE '26 eğitim programının **201 Aşaması: Zararlı Yazılım Analizi ve Tersine Mühendislik** teslim merkezidir. Saldırı tekniklerini geride bıraktınız. Artık bize saldıran o karanlık dosyaları laboratuvar masamıza yatırıp mikroskop altına alıyoruz. Bu görev, ekrana düşen alarmları körü körüne kapatan operatörlerden sıyrılıp, bir dosyanın anatomisini okuyan gerçek "Siber Dedektifler" olduğunuzu kanıtlama yeridir.

---

## 📅 201 MALWARE OPERASYONU: "The Malware Hunter"

| Parametre | Detay |
| :--- | :--- |
| **Durum** | 🔴 İLERİ SEVİYE OPERASYON (201 Aşaması) |
| **Kapsam** | Statik/Dinamik Analiz, Tersine Mühendislik, Sandbox, Assembly |
| **Zorluk Seviyesi** | ⭐⭐⭐⭐ (4/5) |
| **Son Teslim** | **05 Mayıs Salı Saat 23.59** (Geç Teslim **06 Mayıs Çarşamba Saat 23.59**) |

---

### 🚀 Görev Özeti

Hackerlar, sistemlere sızmak ve kalıcılık sağlamak için karmaşık zararlı yazılımlar (Malware) yazarlar. Göreviniz; bir hacker'ın yazdığı şüpheli `.exe` veya belge dosyasını izole bir laboratuvar (Sandbox) ortamına alıp, *"Bu dosya arka planda ne yapıyor?"* sorusunu hem kodu okuyarak (Statik) hem de canavarı kafeste çalıştırıp izleyerek (Dinamik) cevaplandırmaktır. Bu proje üç ana fazdan oluşmaktadır: Teori, Laboratuvar (Boss Fights) ve Mühendislik Vizyonu.

---

### ⚠️ Rapor Kuralları

1. **Kanıt Zorunluluğu:** Kullanılan analiz araçlarının (PeStudio, ProcMon, Wireshark vb.) çıktıları mutlaka ekran görüntüsü ile rapora eklenmelidir. Sadece "Zararlı IP şudur" yazmak sıfır puandır.
2. **Özgünlük:** İnternetteki CTF çözümlerini (Writeup) kopyalamayın. Kendi anladığınız şekilde, bir mühendise anlatır gibi "Neden bu aracı çalıştırdım ve bu bulgu bana ne söylüyor?" diyerek açıklayın.

---

### 📝 FAZ 1: Mimari ve Temeller (Research & Logic)

Zararlıyı sanal makinede çalıştırıp ezbere araçları açmadan önce, bu işin felsefesini ve mimarisini anlamalıyız. 

**⚠️ Rapor Kuralları (Faz 1):**
1. **Kopyala-Yapıştır Yasaktır:** Wikipedia veya yapay zeka tanımlarını doğrudan rapora yapıştırmak sıfır puandır.
2. **Mühendis Dili:** Kavramları kendi anladığınız şekilde teknik ve anlaşılır bir dille ifade edin.

**Beklenti & Raporlama:** Aşağıdaki 3 kritik konsepti kendi cümlelerinizle açıklayın:

**1. Analiz Türleri: "Durağan ve Hareketli"**
* **Statik Analiz** (dosyayı çalıştırmadan incelemek) ile **Dinamik Analiz** (dosyayı çalıştırarak izlemek) arasındaki fark nedir? Neden dinamik analiz yapmadan önce mutlaka statik analiz yapmalıyız?

**2. Güvenli Alan: "Kafes (Sandbox)"**
* Sandbox (Kum Havuzu) nedir? Şüpheli bir dosyayı neden kendi ana işletim sistemimizde (Host) değil de ağdan izole edilmiş bir sanal makinede (Guest) inceleriz? 

**3. Tersine Mühendislik (Reverse Engineering): "Kodu Geriye Sarmak"**
* Tersine mühendislik nedir? Sadece makine dilinden (1 ve 0'lar) veya Assembly dilinden ibaret olan derlenmiş (compiled) bir `.exe` dosyasını analiz etmek, bize o yazılımın "niyeti" hakkında nasıl ipuçları verir?

---

### ⚔️ FAZ 2: Saha Operasyonu (Boss Fights)

Teori bitti, şimdi neşteri elimize alma zamanı. Aşağıdaki 3 cephenin **tamamında** operasyonu tamamlayıp çözüm adımlarınızı adım adım raporlayın.

---

#### 🔬 Cephe 1: Dosyayı Kesip Biçmek (Basic Static Analysis)
* **Hedef:** [TryHackMe: Basic Static Analysis](https://tryhackme.com/room/staticanalysis1)
* **Görev:** Odayı tamamlayıp dosyaların anatomisini çalıştırmadan inceleyin.
* **Beklenti & Raporlama:**
    * Şüpheli dosyaların kimlik numarası olan **Hash (MD5/SHA256)** değerlerini nasıl tespit ettiniz?
    * Dosya içindeki gizli metinleri (Strings) okuyarak zararlının niyeti hakkında hangi bulgulara (IP adresi, API çağrısı vb.) ulaştınız? (Ekran görüntüleriyle anlatın).

#### 🦠 Cephe 2: Canavarı Serbest Bırakmak (Basic Dynamic Analysis)
* **Hedef:** [TryHackMe: Basic Dynamic Analysis](https://tryhackme.com/room/basicanalysis)
* **Görev:** Statik analiz yetmez; virüsü izole ortamda çalıştırın ve davranışlarını (Process, Network, Registry) izleyin.
* **Beklenti & Raporlama:**
    * Zararlı yazılımı çalıştırdığınızda (ProcMon veya Process Hacker kullanarak) arka planda kendini hangi isimle gizlediğini veya hangi yeni dosyaları (örn: `C:\Windows\Temp` altına) yarattığını nasıl tespit ettiniz?

#### 🕵️‍♂️ Cephe 3: Malware Hunter (Boss Fight: MalBuster)
* **Hedef:** [TryHackMe: MalBuster](https://tryhackme.com/room/malbuster)
* **Görev:** Öğrendiğiniz tüm yetenekleri bu karmaşık vaka üzerinde birleştirin.
* **Beklenti & Raporlama:** Raporunuzun bu kısmı çok detaylı olmalıdır. İncelenen zararlının:
    1. MD5 Hash değeri nedir?
    2. İçinde bulduğunuz en kritik/şüpheli "String"ler nelerdir?
    3. Zararlı çalıştıktan sonra hangi dış IP adresine veya domain'e bağlantı kurmaya çalıştı? (Kanıtlarıyla ekleyin).

---

### 🧠 FAZ 3: Mühendislik Vizyonu ve Tehdit Sözlüğü (Conclusion)

*Laboratuvar ortamındaki analizleriniz bitti. Şimdi önlüğünüzü çıkarıp, elde ettiğiniz bulguları bir SOC Yöneticisine sunma zamanı.*

Raporunuzun "Sonuç" bölümünde, zararlı yazılımların anatomisiyle ilgili aşağıdaki soruları bir **Güvenlik Analisti vizyonuyla** yanıtlayın:

**1. Assembly Diline Giriş:**
* **Soru:** Tersine mühendislik yaparken sıkça gördüğümüz makine dili (Assembly) komutlarından `MOV EAX, 1` komutu temel mantıkta ne anlama gelir? Neden bu dili okuyabilmek ileri seviye analiz için kritiktir?

**2. Hayatta Kalma Sanatı (Persistence):**
* **Soru:** Bir virüs, bilgisayar yeniden başlatıldığında (Restart) silinmemek ve tekrar aktif olmak için kendini Windows işletim sisteminde nerelere gizler? (Kayıt Defteri/Registry ve Startup klasörü mantığını açıklayın).

**3. Kukla Ustası (Command & Control - C&C):**
* **Soru:** Zombi (enfekte olmuş) bir bilgisayar, dışarıdaki asıl saldırgandan (Hacker) nasıl komut alır? C&C sunucusu mantığı nedir ve biz bunu ağ trafiğinde (Wireshark) nasıl yakalarız?

**4. Hayalet Tehditler (Fileless Malware):**
* **Soru:** Geleneksel antivirüsler diske yazılan dosyaları (.exe) tarar. Peki "Dosyasız Zararlı Yazılım" (Fileless Malware) diske hiçbir dosya kaydetmiyorsa, sistemin neresinde yaşar ve komutlarını nasıl çalıştırır? (Örn: RAM, PowerShell).

---

### 📤 Teslim Formatı ve Kontrol Listesi

Bu rapor, 201 aşamasındaki analitik zekanızı ve "Adversary" (Düşman) araçlarını okuma yeteneğinizi kanıtlayacak **ana operasyon belgenizdir**. Teslim etmeden önce aşağıdaki maddelerin tamamlandığından emin olun. 

* **Dosya Adı:** `Ad_Soyad_201_Malware_Operasyonu.pdf`
* **Format ve Uzunluk:** Sadece PDF Formatı. Ekran görüntülerini net, açıklamaları profesyonel tutun.
* **Sayfa Düzeni ve Kontrol Listesi:**
    * [ ] **Kapak Sayfası:** Eğitim Adı, Görev Adı, Adınız Soyadınız ve Tarih.
    * [ ] **Faz 1 (Mimari):** Statik/Dinamik analiz, Sandbox ve Tersine Mühendislik tanımları yapıldı mı?
    * [ ] **Faz 2 (Statik & Dinamik):** İlgili THM odalarındaki String analizi ve ProcMon izleri kanıtlandı mı?
    * [ ] **Faz 2 (Boss Fight):** MalBuster odasındaki MD5, dış IP ve String bulguları rapora eklendi mi?
    * [ ] **Faz 3 (Sonuç):** Assembly, Kalıcılık (Persistence), C&C ve Fileless Malware mantığı açıklandı mı?
* **Yükleme Adımları:** Kendi GitHub reponuzda oluşturacağınız `201-Malware-Operasyonu` klasörüne PDF dosyanızı yükleyip, ana repoya **Pull Request (PR)** açın.

⚠️ **KRİTİK UYARI:**
Bir dosyayı "Antivirüs'e taratmak" son kullanıcının işidir. Mühendis, o dosyanın Antivirüs'ü nasıl atlattığını ve arka planda hangi sistemi manipüle ettiğini bulmakla yükümlüdür. Zihninizi bir dedektif gibi çalıştırın.

---

### 📚 İpucu Kutusu (Malware Cheat Sheet)

Analiz sırasında hayat kurtaracak kritik araçlar ve terimler:

| Araç / Konsept | Kullanım Amacı / Açıklaması |
| :--- | :--- |
| **PeStudio / CFF Explorer** | (Statik) Bir PE (Portable Executable) dosyasının içindeki şüpheli kütüphaneleri (DLL), stringleri ve mimariyi çalıştırmadan gösterir. |
| **Strings** | (Statik) Derlenmiş ikili (binary) bir dosyanın içinde insan tarafından okunabilir metinleri (IP, URL, Hata mesajı) ayıklar. |
| **ProcMon (Process Monitor)** | (Dinamik) Bir dosya çalıştığında arka planda hangi dosyaları yarattığını, Registry'de ne değiştirdiğini anlık (Real-time) kaydeder. |
| **Wireshark** | (Dinamik) Zararlı yazılım çalıştığı anda dış dünyayla (C&C Sunucusuyla) kurduğu DNS veya HTTP ağ trafiğini yakalar. |
| **IDA Pro / Ghidra** | (Tersine Mühendislik) Derlenmiş programları Assembly veya C benzeri koda çevirerek iç mantığını okumamızı sağlayan ağır toplardır. |
| **YARA** | Kötü amaçlı yazılımları, belirlediğimiz kurallara (String veya Hex desenlerine) göre sınıflandıran ve tespit eden bir "eşleştirme" aracıdır. |

**Bildiğiniz her şeyi masaya koyun. Başarılar dileriz.**

*AnkaCORE Operasyon Merkezi* 🦅