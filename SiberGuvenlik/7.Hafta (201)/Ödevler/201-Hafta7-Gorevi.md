# 🦅 Siber Güvenlik Mühendisliği Eğitimi - 2026

> **"Bir sisteme dışarıdan sızmak sadece başlangıçtır; asıl mesele içeride görünmez olup 'Dijital Yönetici'ye (Domain Admin) dönüşmektir."**

Bu repo, AnkaCORE '26 eğitim programının **201 Aşaması: Active Directory ve Saldırıları** teslim merkezidir. Web zafiyetlerini ve tekil sunucuları hacklemeyi geride bıraktınız. Artık kurumsal dünyanın kalbine, binlerce bilgisayarın bağlandığı devasa ağlara iniyoruz. Bu görev, "Script Kiddie" reflekslerinden kurtulup, sistemin mimarisini anlayarak hareket eden gerçek mühendisler olduğunuzu kanıtlama yeridir.

---

## 📅 201 AD OPERASYONU: "Domain Dominance"

| Parametre | Detay |
| :--- | :--- |
| **Durum** | 🔴 İLERİ SEVİYE OPERASYON (201 Aşaması) |
| **Kapsam** | AD Mimarisi, Kerberos Exploitation, Lateral Movement, Post-Exploit |
| **Zorluk Seviyesi** | ⭐⭐⭐⭐ (4/5) |
| **Son Teslim** | **24 Nisan Cuma Saat 23.59** (Geç Teslim **25 Nisan Cumartesi**) |

---

### 🚀 Görev Özeti

Şirketlerin %90'ı altyapısında Active Directory kullanır. İçeri sızdıktan sonra (Post-Compromise) düşük yetkili bir hesaptan en tepeye (Domain Admin) çıkmak zorundasınız. Bu proje üç ana fazdan oluşmaktadır: Önce sistemin nasıl çalıştığını (Mimari) anlayacak, ardından 3 farklı teknik cephede (Laboratuvarlar) hedefleri yok edecek ve son olarak elde ettiğiniz bulguları teknik bir sözlük/sonuç raporu ile taçlandıracaksınız.

---

### ⚠️ Rapor Kuralları

1. **Kanıt Zorunluluğu:** Terminal komutları (Impacket vb.) ve araç çıktıları (Bloodhound, Mimikatz) mutlaka ekran görüntüsü ile rapora eklenmelidir. Sadece "Bayrak şudur" yazmak sıfır puandır.
2. **Özgünlük:** İnternetteki CTF çözümlerini (Writeup) kopyalamayın. Kendi anladığınız şekilde, bir mühendise anlatır gibi "Neden bu aracı/komutu kullandım?" diyerek açıklayın.

---

### 📝 FAZ 1: Mimari ve Temeller (Research & Logic)

Laboratuvarlara girip ezbere `Impacket` veya `Mimikatz` komutları çalıştırmadan önce, hedef aldığımız kalenin mimarisini ve temellerini anlamalıyız. Bu faz, saldıracağımız sistemin haritasını zihnimizde kurmamızı sağlayacaktır.

**⚠️ Rapor Kuralları (Faz 1):**
1. **Kopyala-Yapıştır Yasaktır:** Wikipedia veya yapay zeka tanımlarını doğrudan rapora yapıştırmak sıfır puandır.
2. **Mühendis Dili:** Kavramları kendi anladığınız şekilde, bir iş görüşmesinde karşı tarafa (Blue Team veya Red Team) anlatır gibi teknik ve anlaşılır bir dille ifade edin.

---

#### 🏛️ Cephe 1: Windows Active Directory Basics
* **Hedef:** [TryHackMe: Windows AD Basics](https://tryhackme.com/room/winadbasics)
* **Görev:** Bu odayı baştan sona tamamlayarak Active Directory'nin omurgasını oluşturan temel bileşenleri ve hiyerarşiyi kavrayın.
* **Beklenti & Raporlama:** Odada öğrendiklerinize dayanarak, aşağıdaki 3 kritik kavramı teknik bir dille ve kendi cümlelerinizle açıklayın:

    **1. Domain Controller (DC): "Krallığın Merkezi"**
    * Domain Controller nedir? Kurumsal bir ağda binlerce bilgisayar varken, kimlik doğrulama ve yetkilendirme işlemleri için neden böyle merkezi bir sunucuya ihtiyaç duyarız?

    **2. Forest & Trees: "Orman ve Ağaçlar"**
    * Active Directory mimarisindeki "Domain", "Tree" (Ağaç) ve "Forest" (Orman) kavramları hiyerarşik olarak neyi ifade eder? Birbirleriyle olan güven ilişkisi (Trust Relationship) mantığı nedir?

    **3. Group Policy Objects (GPO): "Kuralların Gücü"**
    * Group Policy Object (GPO) nedir? Bir sistem yöneticisi (SysAdmin), tek tek masaları dolaşmak yerine GPO kullanarak ağdaki yüzlerce bilgisayarı ve kullanıcıyı nasıl yönetir/kısıtlar? (Örnek vererek açıklayın).

---

### ⚔️ FAZ 2: Saha Operasyonu (Boss Fights)

Teori bitti, şimdi tetiği çekme zamanı. Konfor alanınızdan çıkın; aşağıdaki 3 cephenin **tamamında** operasyonu tamamlayıp çözüm adımlarınızı adım adım raporlayın.

---

#### 🌐 Cephe 2: Keşif ve İlk Sızma (Initial Access)
* **Hedef:** [TryHackMe: Attacktive Directory](https://tryhackme.com/room/attacktivedirectory)
* **Görev:** Odayı baştan sona çözün.
* **Beklenti & Raporlama:**
    * Sisteme dışarıdan bakarken (henüz kimlik doğrulaması yapmadan) `Enum4linux` veya `Kerbrute` araçlarını kullanarak sistemdeki geçerli kullanıcı isimlerini nasıl tespit ettiniz?
    * Hangi kullanıcının hash'ini düşürdünüz ve sisteme ilk erişimi (SMB vb.) nasıl sağladınız? (Adımlarınızı terminal ekran görüntüleriyle kanıtlayarak anlatın).

#### 🛡️ Cephe 3: Bilet Avcısı (Kerberos Saldırıları)
* **Hedef:** [TryHackMe: Attacking Kerberos](https://tryhackme.com/room/attackingkerberos)
* **Görev:** Bu oda Kerberos zafiyetlerinin kalbidir. Odayı tamamlayın.
* **Beklenti & Raporlama:**
    * Impacket araç setini (`GetNPUsers.py` ve `GetUserSPNs.py`) kullanarak biletleri (Hash) nasıl çaldığınızı gösterin.
    * Çaldığınız bu hash'leri kendi bilgisayarınızda çevrimdışı (offline) olarak `Hashcat` veya `John The Ripper` ile nasıl kırdığınızı terminal ekran görüntüleriyle rapora ekleyin.

#### 📡 Cephe 4: İsviçre Çakısı ve Yanal Hareket (Post-Exploitation)
* **Hedef:** [TryHackMe: Post-Exploit Basics](https://tryhackme.com/room/postexploit)
* **Görev:** Artık içerideyiz. Mimikatz ve BloodHound araçlarını kullanarak sistemin köklerine inin.
* **Beklenti & Raporlama:**
    * **BloodHound:** Aracın ürettiği grafiksel haritalar üzerinden "Domain Admin'e giden en kısa yolu" nasıl tespit ettiniz? (Tespitinize ait harita görselini rapora mutlaka ekleyin).
    * **Mimikatz:** Bu aracı kullanarak LSASS belleğinden oturum açmış kullanıcıların NTLM hash'lerini nasıl çektiğinizi, kullandığınız spesifik komutlarıyla açıklayıp raporlayın.

---


### 🧠 FAZ 3: Mühendislik Vizyonu ve Saldırı Sözlüğü (Conclusion)

*Laboratuvar ortamındaki (Simülasyon) operasyonlarınız bitti. Kırmızı Takım şapkanızı çıkarıp, klavyeyi bırakma ve vizyonunuzu gösterme zamanı.*

Raporunuzun "Sonuç" bölümünde, yukarıdaki laboratuvarlarda bizzat uyguladığınız saldırı tekniklerinin anatomisini açıklayacaksınız. Aşağıdaki soruları, **bir Siber Güvenlik Danışmanı (Consultant) veya SOC Analisti vizyonuyla**, teknik bir ekibe brifing veriyormuş gibi kendi cümlelerinizle yanıtlayın. 

**(Kopyala-yapıştır tanımlar veya sadece "aracı çalıştırdım oldu" demek geçersizdir. Mantığını ve nasıl engelleneceğini açıklayın.)**

**1. Pass the Ticket (PtT) Saldırısı:**
* **Soru:** Bir Kırmızı Takım üyesi olarak, elinizde kullanıcının parolası veya NTLM hash'i olmadan, sadece çalınmış bir Kerberos bileti (TGT/TGS) ile sisteme nasıl sızarsınız? Bu saldırının arka planındaki çalışma mantığı nedir?

**2. AS-REP Roasting Saldırısı:**
* **Soru:** Bu saldırı, sistem yöneticisinin yaptığı hangi kritik yapılandırma hatasından (Pre-Auth / Ön Kimlik Doğrulama eksikliği) beslenir? Saldırgan bu hatayı kullanarak domain'deki bir kullanıcının hash'ini sistemi uyandırmadan nasıl çalar? 

**3. Kerberoasting Saldırısı:**
* **Soru:** Active Directory ortamında neden özellikle Servis Hesapları (Service Principal Name - SPN) hedeflenir? Bir saldırganın, geçerli düşük yetkili bir kullanıcıyla içeri girdikten sonra bilet (TGS) talep edip, bu biletin şifresini kendi evindeki bilgisayarda (Offline Cracking) kırmasını sağlayan Kerberos tasarım zafiyeti nedir?

**4. Golden Ticket (Altın Bilet) Saldırısı:**
* **Soru:** "Golden Ticket" nedir ve üretmek için neden özellikle Domain Controller üzerindeki **KRBTGT** hesabının hash'ine ihtiyaç duyarız? Bu bilet saldırgana sistemde nasıl bir kalıcılık (Persistence) ve "Sınırsız Erişim" sağlar?

**5. Silver Ticket (Gümüş Bilet) Saldırısı:**
* **Soru:** Silver Ticket'ın, Golden Ticket'tan (Altın Bilet) mimari ve yetki kapsamı olarak en büyük farkı nedir? Neden bazen Domain Controller'ı (KRBTGT) hedef almak yerine, sadece spesifik bir servisi (Örn: SQL Sunucusu) hedef alan Gümüş Bilet üretmeyi tercih ederiz?

---


### 📤 Teslim Formatı ve Kontrol Listesi

Bu rapor, 201 aşamasındaki Active Directory yeteneklerinizi kanıtlayacak ve sistem mühendisliği vizyonunuzu yansıtacak **ana operasyon belgenizdir**. Teslim etmeden önce aşağıdaki maddelerin tamamlandığından emin olun. 

* **Dosya Adı:** `Ad_Soyad_201_AD_Operasyonu.pdf`
* **Format ve Uzunluk:** Sadece PDF Formatı. Gereksiz laf kalabalığından kaçının, nokta atışı teknik açıklamalar yapın ve ekran görüntülerini (kanıtları) net/okunabilir şekilde ekleyin. Max. 20-25 Sayfa
* **Sayfa Düzeni ve Kontrol Listesi:**
    * [ ] **Kapak Sayfası:** Eğitim Adı, Görev Adı, Adınız Soyadınız ve Tarih.
    * [ ] **Faz 1 (Mimari):** WinADBasics mimari tanımlamaları (DC, Forest, GPO) kendi cümlelerinizle açıklandı mı?
    * [ ] **Faz 2 (Initial Access):** Attacktive Directory çözüm adımları ve sızma kanıtları eklendi mi?
    * [ ] **Faz 2 (Kerberos):** Attacking Kerberos çözüm adımları ve hash kırma kanıtları eklendi mi?
    * [ ] **Faz 2 (Post-Exploit):** Mimikatz kullanımı ve BloodHound harita ekran görüntüleri eklendi mi?
    * [ ] **Faz 3 (Sonuç):** Sonuç bölümündeki 5 farklı saldırı tekniğinin teorik ve pratik açıklaması yapıldı mı?
* **Yükleme Adımları:** Kendi GitHub reponuzda oluşturacağınız `201-AD-Operasyonu` (veya benzeri) klasörüne PDF dosyanızı yükleyip, ana repoya **Pull Request (PR)** açın.

⚠️ **KRİTİK UYARI:**
Bu görev, siber güvenliğin en zorlu ve en değerli konularından biri olan Active Directory'yi ne kadar kavradığınızı gösterecek. Sektör; ezbere komut kopyalayanları (Script Kiddie) değil, arka plandaki mimarinin nasıl çalıştığını bilip bunu profesyonelce raporlayabilen mühendisleri el üstünde tutar. Sürenizi iyi planlayın, bahanelere sığınmayın.

---

### 📚 İpucu Kutusu (AD Cheat Sheet)

Operasyon sırasında hem Linux hem de Windows cephesinde savaşırken hayat kurtaracak kritik araç ve komutlar:

#### 🐺 Keşif ve Hash Avı (Linux / Impacket & Kerbrute)
| Komut / Mantık | Açıklama |
| :--- | :--- |
| `kerbrute userenum users.txt -d domain.local --dc IP` | Brute-force mantığıyla DC üzerinde hangi kullanıcıların geçerli/aktif olduğunu tespit eder. |
| `GetNPUsers.py domain.local/ -usersfile users.txt -format hashcat -outputfile hashes.txt` | **AS-REP Roasting:** Pre-Auth (Ön Kimlik Doğrulama) istemeyen dikkatsiz kullanıcıların bilet hash'lerini çalar. |
| `GetUserSPNs.py domain.local/user:password -request` | **Kerberoasting:** Geçerli bir kullanıcı bilgisiyle sisteme girip, Servis Hesaplarının (SPN) hash'ini talep eder ve çalar. |
| `hashcat -m 13100 hashes.txt wordlist.txt` | Kerberoasting (TGS-REP) operasyonu ile elde edilen hash'leri çevrimdışı (offline) olarak kırmaya yarar. |

#### 🔪 Tahta Çıkış (Windows / Mimikatz)
| Komut / Mantık | Açıklama |
| :--- | :--- |
| `privilege::debug` | Mimikatz çalıştırıldığında, sistemde en üst düzey admin izinlerini (`SeDebugPrivilege`) kullanabilmek için şarttır. İlk bu komut yazılır. |
| `sekurlsa::logonpasswords` | LSASS belleğini okuyarak, o makinede oturum açmış kullanıcıların NTLM hash'lerini (veya cleartext şifrelerini) listeler. |
| `sekurlsa::tickets /export` | Hafızadaki mevcut Kerberos biletlerini (TGT/TGS) `.kirbi` formatında dışarı aktarır (Pass the Ticket saldırısı için mühimmattır). |

**Bildiğiniz her şeyi masaya koyun. Başarılar dileriz.**

*AnkaCORE Operasyon Merkezi* 🦅