# 🦅 Siber Güvenlik Mühendisliği Eğitimi - 2026

> **"Sistemi bilmeyen hackleyemez; sadece bozabilir."**

Bu repo, Siber Güvenlik Mühendisliği eğitim programının ödev teslim ve kaynak yönetim merkezidir. Hafta 4'te sahanın en geniş ve en popüler alanına, **WEB DÜNYASINA** iniyoruz.

---

## 📅 HAFTA 4: Hedefi Tanıma ve Mantık Hataları (Web Recon & IDOR)

| Parametre | Detay |
| :--- | :--- |
| **Durum** | 🟢 Aktif |
| **Odak Konusu** | Web Keşfi (Recon), Burp Suite ve Yetki Atlatma (BAC) |
| **Zorluk Seviyesi** | ⭐⭐⭐⭐ (4/5) |
| **Son Teslim** | Cumartesi 23:59 |

---

### 🚀 Görev Özeti: "Web Pentest'in %60'ı Keşiftir"

İşletim sistemleri ve ağ trafiğini geride bıraktık. Bu hafta amacımız; tarayıcıda gördüğümüz "süslü" web sitelerinin arkasındaki çıplak HTTP trafiğini manipüle etmektir. Bir web uygulamasına saldırmadan önce iki şeyi çok iyi bilmelisiniz: **Sitenin arka kapıları (Recon)** ve **Uygulamanın mantığı (Logic).**

Bu hafta iki ana cephede savaşıyoruz:

#### 🕵️‍♂️ 1. Cephe: Hayalet Avı (Reconnaissance)
Saldırganlar ana sayfadaki "İletişim" formuna saldırmazlar. Yazılımcıların unuttuğu, test ortamında kalmış alt alan adlarını (subdomain) ve gizli dizinleri bulurlar.
* **Hedef:** Saldırı yüzeyini haritalandırmak (Attack Surface Mapping).
* **Kritik Araçlar:** `subfinder`, `amass`, `httpx`, `dirsearch`.

#### 🔓 2. Cephe: Yetkiyi Delmek (IDOR & BAC)
Sitede kendi profilinizi görüntülerken, URL'deki `id=101` değerini `id=102` yaptığınızda patronun maaş bordrosunu görebiliyorsanız, sistemi kırmışsınız demektir.
* **Hedef:** "Başkası gibi" işlem yapmak.
* **Kritik Kavramlar:** IDOR (Insecure Direct Object Reference), Broken Access Control, Cookie/Session manipülasyonu ve **Burp Suite**.



> **💡 Vizyon:** Amacımız ekrana `alert(1)` yazdırmak değil; uygulamanın çalışma mantığındaki açıkları bularak başkasının verisine (veya yetkisine) ulaşmaktır.

---

### 📝 Görev 4: Bug Hunter Başlangıç Raporu (Proje Ödevi)

Aşağıdaki 4 bölümden (A, B, C, D) oluşan, analizlerinizi **ekran görüntüleri ile kanıtladığınız**, teknik bir **PDF Raporu** hazırlamanız gerekmektedir.

**⚠️ Rapor Kuralları:**
1.  **Kanıt Zorunluluğu:** Burp Suite ekran görüntüleri ve Terminal çıktıları rapora eklenmelidir.
2.  **Özgünlük:** HTTP durum kodlarını veya açıkları kitaptan kopyalamayın. Kendi cümlelerinizle yazın.
3.  **Format:** Kapak sayfası olan, düzenli bir PDF dosyası (`Ad_Soyad_Hafta4.pdf`) olarak teslim edilmelidir.

---

#### **Bölüm A: Teori ve Mimari (Research & Logic)**

Burp Suite'i açmadan önce HTTP'nin dilini anlamalıyız. Aşağıdaki soruları teknik bir dille ve kendi cümlelerinizle yanıtlayın.

**1. Web Anatomisi: HTTP Protokolü**
* Tarayıcınız bir web sitesine girerken sunucuyla konuşur. Sunucunun verdiği cevaplardaki HTTP Durum Kodlarından (Status Codes) **200**, **302**, **401**, **403** ve **500** kodlarının bir pentester (sızma testi uzmanı) için anlamı nedir? (Örn: 403 gördüğümüzde ne anlarız, pes mi ederiz?)

**2. Kimlik ve Yetki: "Sen Kimsin?"**
* **Cookie, Session ve Token:** Bu üç kavramın farkı nedir? Bir web sitesi, sayfayı her yenilediğimizde bizim "aynı kişi" olduğumuzu nasıl anlar?
* **Authentication vs Authorization:** Biri "Kimlik Doğrulama", diğeri "Yetkilendirme"dir. Sisteme başarıyla giriş yapmak (Login) hangisidir? Girdiğiniz sistemde başkasının mesajlarını okuyabilmek (IDOR) hangisinin zafiyetidir?



**3. Zafiyet Mimarisi: IDOR**
* **IDOR (Insecure Direct Object Reference)** nedir? Bir yazılımcı hangi güvenlik kontrolünü yapmayı unutursa uygulamasında IDOR zafiyeti ortaya çıkar?

---

#### **Bölüm B: Saha Eğitimi (TryHackMe & Dorking)**

Bu bölümde web dünyasının temel araçlarını kuşanıyoruz.

**Görev 1: İnternetin Röntgeni (TryHackMe)**
* **Oda:** [TryHackMe | HTTP in Detail](https://tryhackme.com/room/httpindetail) (Veya alternatif olarak *Burp Suite: The Basics* odası).
* **İstenen:** Odayı tamamlayın. HTTP Request (İstek) başlıklarındaki `User-Agent` ve `Host` parametrelerinin ne işe yaradığını kendi cümlelerinizle açıklayın.

**Görev 2: Google Dorking (Açık Kaynak İstihbaratı)**
Google sadece bir arama motoru değil, dünyanın en büyük zafiyet tarayıcısıdır.
* **Senaryo:** Hedefiniz `ankasec.co` (veya seçtiğiniz başka bir Bug Bounty hedefi).
* **Görev:** Hedefle ilgili potansiyel olarak hassas dosyaları (Admin paneli, PDF belgeleri, Backup dosyaları vb.) bulmak için kullanacağınız **3 farklı Google Dork** sorgusu yazın ve bu sorguların tam olarak ne aradığını açıklayın. (Örn: `site:hedef.com ext:pdf`).
* **Kanıt:** Yazdığınız Dork'lardan birini Google'da aratıp sonucunun ekran görüntüsünü ekleyin.

---

#### **⚔️ BÖLÜM C: Operasyonel Görev (Boss Fight)**

Simülasyon bitti, gerçek av başlıyor. Bu bölümde "Gerçek" hedefler üzerinde Recon yapacak ve PortSwigger laboratuvarlarında yetki atlatacaksınız.

### 🕵️‍♂️ Cephe 1: Hayalet Avı (Recon Haritası)
* **Hedef:** HackerOne veya Bugcrowd üzerinde "Public" (Herkese açık) ve "Safe Harbor" (Test izni olan) bir program seçin. (Örn: Yahoo, Red Bull, Ford).
* **Operasyon:**
    1.  Terminalinizi açın. `subfinder` veya `amass` kullanarak hedef domainin alt alan adlarını (subdomain) tarayın.
    2.  Bulduğunuz sonuçları `httpx` aracına vererek hangilerinin "Canlı" (Live) olduğunu kontrol edin.
* **Raporlama:** Bulduğunuz en ilginç **3 subdomain'i** ve `httpx`'ten dönen **HTTP durum kodlarını** raporlayın. (Neden bu 3'ü ilginizi çekti?). Terminal çıktısının ekran görüntüsünü ekleyin.

### 🔓 Cephe 2: Yetkiyi Delmek (PortSwigger Labs)
Web güvenliğinin kutsal mekanı PortSwigger'da gerçek IDOR senaryoları çözeceğiz.

* **Platform:** [PortSwigger Web Security Academy](https://portswigger.net/web-security/learning-path) (Kayıt olun, ücretsizdir).
* **Görev:** Aşağıdaki iki IDOR/BAC laboratuvarını çözün:
    1.  *Lab: Insecure direct object references*
    2.  *Lab: User ID controlled by request parameter*
* **Raporlama Formatı:** "Çözdüm" demek yok. Burp Suite kullanarak trafiği nasıl yakaladığınızı (Proxy), isteği **Repeater**'a nasıl attığınızı ve parametreyi (`id` veya `user`) değiştirerek başkasının verisine nasıl ulaştığınızı adım adım anlatın.
* **Kanıt:** Burp Suite Repeater ekranında başarılı response (Örn: Başkasının API anahtarını veya şifresini gördüğünüz an) açıkça görünmelidir.



---

#### **🧠 BÖLÜM D: Mühendislik Vizyonu (Reflection)**

*Analiz bitti, şimdi yorumlama zamanı.*

**1. IDOR'un Gerçek Hayat Etkisi (Impact):**
*Senaryo:* Bir hastanenin e-randevu sisteminde test yapıyorsunuz. Kendi tahlil sonucunuza bakarken URL'nin `hastane.com/tahlil?id=500` olduğunu gördünüz.
* **Soru:** `id=501` yaptığınızda başkasının HIV veya Kanser test sonucunu görebiliyorsanız, bu zafiyetin KVKK (veya GDPR) açısından şirkete maliyeti ve marka itibarına vereceği zarar nedir? Bir mühendis olarak bu açığı şirkete raporlarken **"Risk Seviyesini (Impact)"** nasıl açıklarsınız?

**2. Güvenin Bedeli (Zero Trust):**
* **Soru:** IDOR ve Broken Access Control zafiyetlerinin temelinde yatan yazılımcı hatası, "Kullanıcıdan gelen girdiye (Input) güvenmek"tir. Bir yazılımcı bu hatayı yapmamak için arka planda (Backend) nasıl bir kontrol (Check) mekanizması kurmalıdır?

---

### 📤 Teslim Formatı ve Kontrol Listesi

* **Dosya Adı:** `Ad_Soyad_Hafta4.pdf`
* **Format:** PDF (10 - 12 Sayfa Önerilir).
* **Sayfa Düzeni:**
    * [ ] Kapak Sayfası.
    * [ ] Ekran Görüntüleri (Terminal Recon çıktıları, Burp Suite ekranları, Dork sonuçları).
    * [ ] Açıklamalar (Görsellerin altında ne yapıldığına dair teknik yorumlar).
* **Yükleme:** Kendi GitHub reponuzda `Hafta-4/Odevler` klasörüne yükleyip, ana repoya **Pull Request (PR)** açın.

---

### 📚 İpucu Kutusu (Cheat Sheet)

#### 🌐 Recon (Keşif) Komutları
| Araç | Komut | Açıklama |
| :--- | :--- | :--- |
| **Subfinder** | `subfinder -d hedef.com -all` | Hedefin tüm alt alan adlarını pasif olarak bulur. |
| **httpx** | `cat subdomains.txt \| httpx -sc -title` | Bulunan domainlerin hangilerinin çalıştığını (Status Code) ve başlıklarını (Title) gösterir. |
| **Dirsearch** | `dirsearch -u https://hedef.com` | Sitedeki gizli klasörleri (admin, backup vb.) tarar. |

#### 🕷️ Burp Suite Kısayolları
* `Ctrl + R`: Seçili isteği Repeater'a gönderir (Kurcalamak için).
* `Ctrl + I`: Seçili isteği Intruder'a gönderir (Otomatize saldırı için).
* **İpucu:** IDOR ararken, tarayıcınızda normal bir işlem yapın, Burp HTTP History'de o isteği bulun ve parametrelerle oynayın!



**Başarılar, Ödül Avcıları.**
*AnkaCORE Operasyon Merkezi*