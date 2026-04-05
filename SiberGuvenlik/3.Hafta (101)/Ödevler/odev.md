# 🦅 Siber Güvenlik Mühendisliği Eğitimi - 2026

> **"Sistemi bilmeyen hackleyemez; sadece bozabilir."**

Bu repo, Siber Güvenlik Mühendisliği eğitim programının ödev teslim ve kaynak yönetim merkezidir. Hafta 3'te siber dünyanın "Kaputunun Altına" iniyoruz. Bir hackerın oyun alanı olan Kernel, Registry, Process ve Permission dünyasını keşfedeceğiz.

---

## 📅 HAFTA 3: İşletim Sistemleri Mimarisi (Linux & Windows Internals)

| Parametre | Detay |
| :--- | :--- |
| **Durum** | 🟢 Aktif |
| **Odak Konusu** | Sistem Mühendisliği, Anomali Tespiti ve Yetki Yönetimi |
| **Zorluk Seviyesi** | ⭐⭐⭐⭐ (4/5) |
| **Son Teslim** | Cumartesi 23:59 |

---

### 🚀 Görev Özeti: "Mühendislik Moduna Geçiş"

Bu hafta, sadece tuşlara basan bir "Son Kullanıcı" olmaktan çıkıp, sistemi yöneten ve manipüle edebilen bir **"Mühendis"** kimliğine bürünüyoruz. Siber saldırıların ve savunmanın %80'i işletim sistemi seviyesinde gerçekleşir. Eğer bir sürecin (Process) neden çalıştığını veya bir dosyanın izinlerinin ne anlama geldiğini bilmiyorsanız, siber güvenlikte sadece bir "Turist" olursunuz.

Bu hafta iki ana cephede savaşıyoruz:

#### 🐧 1. Cephe: Linux Mimarisi (The Core)
Linux, internetin omurgasıdır. Sunucuların %90'ı, bulut sistemleri ve siber güvenlik araçlarının tamamı Linux üzerinde koşar.
* **Hedef:** Terminalin efendisi olmak.
* **Kritik Kavramlar:** "Her şey bir dosyadır" felsefesi, `SUID/SGID` bitleri ile yetki yükseltme (PrivEsc), Bash script ile log analizi.

#### 🪟 2. Cephe: Windows Internals (The Target)
Kurumsal dünyada son kullanıcıların %85'i Windows kullanır. Bu da onu saldırganların 1 numaralı hedefi yapar.
* **Hedef:** "Görev Yöneticisi"nin ötesine geçmek.
* **Kritik Kavramlar:** Kayıt Defteri (Registry) manipülasyonu, Süreç Ağaçları (Process Trees), DLL yapıları ve Erişim Kontrol Listeleri (ACL).

!

> **💡 Vizyon:** Amacımız; bir sisteme sızdığınızda (Privilege Escalation) yetkinizi nasıl yükselteceğinizi veya bir zararlıyı analiz ederken (Malware Analysis) onun kendini nereye gizlediğini bir bakışta anlamanızı sağlamaktır.

---

### 📝 Görev 3: System Engineer Raporu (Proje Ödevi)

Aşağıdaki 4 bölümden (A, B, C, D) oluşan, analizlerinizi **ekran görüntüleri ile kanıtladığınız**, teknik ve kurumsal bir dille hazırlanmış bir **PDF Raporu** hazırlamanız gerekmektedir.

**⚠️ Rapor Kuralları:**
1.  **Kanıt Zorunluluğu:** "Yaptım, oldu" kabul edilmez. Her adımın (özellikle analiz kısımlarının) ekran görüntüsü rapora eklenmelidir.
2.  **Özgünlük:** Copy Paste'den olabildiğince uzak duralım. Kendi anladığınız cümlelerle, "bir mühendisin bir mühendise anlattığı gibi" yazın.
3.  **Format:** Kapak sayfası olan, düzenli bir PDF dosyası (`Ad_Soyad_Hafta3.pdf`) olarak teslim edilmelidir.

---

#### **Bölüm A: Teori ve Mimari (Research & Logic)**

Bu bölümde henüz terminale veya araçlara dokunmadan önce, üzerinde çalıştığımız **"Sistemin Felsefesini"** anlamalıyız. Bir mühendis, "Nereye?" tıklayacağını değil, tıkladığında arka planda "Neden?" o işlemin gerçekleştiğini bilen kişidir.

Aşağıdaki soruları **Wikipedia veya ChatGPT'den kopyala-yapıştır yapmadan**, mantığını anlatan bir dille ve kendi cümlelerinizle (bir meslektaşınıza anlatır gibi) yanıtlayın.

---

#### **Bölüm A: Teori ve Mimari (Research & Logic)**

Bu bölümde henüz terminale veya araçlara dokunmadan önce, üzerinde çalıştığımız **"Sistemin Felsefesini"** anlamalıyız. Bir mühendis, "Nereye?" tıklayacağını değil, tıkladığında arka planda "Neden?" o işlemin gerçekleştiğini bilen kişidir.

Aşağıdaki soruları **Wikipedia veya ChatGPT'den kopyala-yapıştır yapmadan**, teknik bir dille ve kendi cümlelerinizle (bir meslektaşınıza anlatır gibi) yanıtlayın.

---

### **1. Linux Mimarisi: "Her Şey Bir Dosyadır" (Everything is a File)**

Linux çekirdeğinin en temel felsefesi budur. Klavye, ekran, harddisk ve hatta çalışan süreçler (process) bile birer dosyadır.

* **Kavramsal Analiz:**
    * Linux'ta `/dev/sda` (Harddisk), `/dev/tty` (Terminal) veya `/dev/null` (Kara delik) gibi donanımların bile dosya sisteminde bir yolunun olması, bir sistem yöneticisine ne gibi bir avantaj sağlar? (İpucu: `cat` komutuyla bir metin dosyasını okumakla, bir harddiskin imajını almak arasındaki benzerliği düşünün).
    * !

* **Tehlikeli İzinler ve SUID Biti:**
    * **777 Tehlikesi:** Bir dosyaya `chmod 777` (rwxrwxrwx) izni vermek, sistem güvenliği açısından neden bir intihardır? "Others" (Diğerleri) grubunun yazma yetkisine sahip olması, sıradan bir kullanıcıyı nasıl sisteme zarar verebilecek hale getirir?
    * **Hackerların Altın Anahtarı (SUID):** `SUID` (Set User ID) biti nedir? Normalde `passwd` komutunu çalıştıran bir kullanıcı, nasıl olur da sadece Root'un yazabildiği `/etc/shadow` dosyasına şifre yazabilir? Saldırganlar neden sistemde `find / -perm -4000` komutuyla bu bitin ayarlandığı dosyaları arar?

* **Bash Gücü vs. GUI:**
    * Bir Siber Güvenlik Analisti olarak önünüze **5 GB** boyutunda bir web sunucu log dosyası (`access.log`) geldi. Bunu Excel veya Notepad ile açmaya çalışırsanız RAM şişer ve bilgisayar donar.
    * Aynı dosyayı Linux terminalinde; `grep`, `awk` ve `|` (Pipe) operatörlerini kullanarak saniyeler içinde analiz etmenin (Örn: Sadece 404 hatası veren IP'leri ayıklamanın) mühendislik açısından önemi nedir?

---

### **2. Windows Internals: "Çarklar Nasıl Dönüyor?"**

Windows, sadece pencerelerden ibaret değildir. Arkada dönen karmaşık bir "Kernel" ve yetki mimarisi vardır.

* **User Mode vs. Kernel Mode (Ring 0 - Ring 3):**
    * Modern işlemciler ve Windows, kararlılığı sağlamak için neden iki farklı modda çalışır?
    * **Senaryo:** Sizin açtığınız `chrome.exe` çökerse sadece tarayıcı kapanır, ancak ekran kartı sürücüsü (Driver) hata verirse neden "Mavi Ekran" (BSOD) alırız ve tüm sistem çöker? "Ring 0" ve "Ring 3" kavramlarını kullanarak açıklayın.
    * !

* **Registry (Kayıt Defteri) Anatomisi:**
    * Windows'un beyni olan Registry'de; `HKLM` (HKEY_LOCAL_MACHINE) ile `HKCU` (HKEY_CURRENT_USER) arasındaki kritik fark nedir?
    * **Zararlı Yazılım Analizi:** Bir Trojan bilgisayara bulaştığında, bilgisayar her yeniden başlatıldığında tekrar çalışabilmek (Persistence/Kalıcılık) için kendini genellikle hangi Registry yoluna (Path) yazar? (Örn: `.../CurrentVersion/Run`).

* **NTFS İzinleri ve ACL (Erişim Kontrol Listesi):**
    * Linux'taki basit "Okur/Yazar/Çalıştır" mantığı Windows'ta çok daha detaylıdır.
    * Bir klasöre sağ tıklayıp "Security" sekmesine geldiğimizde gördüğümüz **ACL (Access Control List)** yapısı nedir? Bir dosyaya "Bunu Ali sadece okusun, Veli hem okusun hem silsin, ama SYSTEM hesabı dokunamasın" diyebilmek, kurumsal güvenliği nasıl etkiler?
    * !

---

#### **Bölüm B: Saha Eğitimi (TryHackMe - Lab)**

Bu bölümde teoriden pratiğe geçiyoruz. Bir Siber Güvenlik Mühendisi, terminalden korkmaz ve Windows'un sadece masaüstünden ibaret olmadığını bilir.

---

### **Görev 1: Linux Cephesi - Terminalle Tanışma**

Linux, siber güvenlik dünyasının ana dilidir. Sunucular, saldırı araçları ve bulut sistemleri Linux üzerinde konuşur. Fareyi bırakıp klavyeye hükmetme vakti.

!

* **Oda:** [TryHackMe | Linux Fundamentals Part 1-2-3](https://tryhackme.com/module/linux-fundamentals)
* **Amaç:** Dosya sistemi hiyerarşisini, temel komutları ve izin yapılarını öğrenmek.
* **Raporlama İsteği:** Modülleri tamamlarken öğrendiğiniz, bir analistin hayatını kurtaracak **3 kritik komutu** seçin ve uygulamasını ekran görüntüsüyle gösterin.
    * *Örnek Komutlar:* `grep` (Arama), `chmod` (İzin değiştirme), `pipe |` (Komutları bağlama), `find` (Dosya bulma).
    * *Beklenti:* Sadece komutu yazmayın; komutun çıktısını (Output) da gösteren bir ekran görüntüsü ekleyin.

---

### **Görev 2: Windows Anatomisi - "Normal"i Tanımak**

Siber savunmanın altın kuralı şudur: **"Normali bilmeyen, anomaliyi (virüsü) bulamaz."**
Zararlı yazılımlar genellikle kendilerini Windows'un kendi sistem dosyaları gibi (Örn: `svchost.exe`) göstermeye çalışır. Bu labda gerçek ile sahteyi ayırt etmeyi öğreneceksiniz.

!

* **Oda:** [TryHackMe | Core Windows Processes](https://tryhackme.com/room/btwindowsinternals)
* **Kritik Süreç Analizi:**
    Odayı tamamlarken aşağıdaki kritik süreçlerin ne işe yaradığını birer cümleyle (Türkçe ve kendi yorumunuzla) açıklayın. Bu süreçler ilerde malware analizi yaparken karşınıza en çok çıkacak olanlardır:
    1.  **System (PID 4):** Neden her zaman PID 4'tür? Kernel (Çekirdek) ile ilişkisi nedir?
    2.  **smss.exe (Session Manager):** Windows açılırken hangi kritik işi yapar? (Örn: Oturum başlatma).
    3.  **csrss.exe (Client/Server Runtime):** Neden bu süreci öldürürseniz "Mavi Ekran" (BSOD) alırsınız?
    4.  **lsass.exe (Local Security Authority):** Hackerlar neden en çok bu süreci sever? (İpucu: Parolalar ve Hash'ler nerede tutulur?).
    5.  **svchost.exe (Service Host):** Neden Görev Yöneticisi'nde bundan onlarca var?
* **Kanıt:** Odayı bitirdiğinize dair "Room Completed" veya tebrik ekranının görüntüsü.

> **⚠️ Mühendislik Notu:** Bu Windows süreçlerinin **"Parent-Child" (Ebeveyn-Çocuk)** ilişkisi çok önemlidir. Örneğin; `services.exe` normalde `wininit.exe` altından çıkar. Eğer `explorer.exe` altından çıkan bir `services.exe` görürseniz, tebrikler! Bir virüs buldunuz.

---

#### **⚔️ BÖLÜM C: Operasyonel Görev (Boss Fight)**

Eğitim bitti, şimdi öğrendiklerinizi sahada uygulama zamanı. Bu hafta iki farklı cephede savaşıyoruz: Bir yanda siyah ekran (Linux), diğer yanda işletim sisteminin kalbi (Windows).

---

### 🐧 Cephe 1: OverTheWire - Bandit (Linux)
*Burası, terminal korkunuzu yeneceğiniz yer.*

Bandit, Linux komut satırını öğretmek için tasarlanmış efsanevi bir savaş oyunudur (Wargame). Burada fare çalışmaz, sadece komutlar konuşur.

* **Hedef:** [OverTheWire: Bandit Wargame](https://overthewire.org/wargames/bandit/)
* **Bağlantı Yöntemi:** SSH (Secure Shell) kullanarak oyuna bağlanacaksınız.
    * *Komut:* `ssh bandit0@bandit.labs.overthewire.org -p 2220`
    * *Şifre:* `bandit0`
* **Görev:** **Level 0'dan başlayıp Level 10'a kadar** (Level 10 dahil) gelmeniz gerekmektedir.
* **Raporlama Formatı:**
    * Sadece şifreyi (Flag) yazıp geçmeyin! Her leveli nasıl geçtiğinizi teknik olarak açıklayın.
    * *Örnek Raporlama:*
        > **Level X Çözümü:**
        > Dosya adı tire (-) ile başladığı için normal `cat -file` komutu hata verdi. Bu yüzden `cat ./-file` komutunu kullanarak dosyayı okudum.
        > *Kanıt:* [Ekran Görüntüsü]
    * **Kanıt:** Her seviyede bir sonraki levelin şifresini bulduğunuz terminal ekranının görüntüsü raporda olmalıdır.

> **💡 İpucu:** Bandit seviyelerinde ilerlerken `man`, `ls -la`, `file`, `find`, `du`, `grep` komutları en iyi dostunuz olacak. Takıldığınızda Google'ı kullanmaktan çekinmeyin, "araştırmak" mühendisliğin %90'ıdır.

---

### 🪟 Cephe 2: Sysinternals Analizi (Windows)
*Kendi bilgisayarınızda veya Sanal Makinede (VM) bir "Avcı" olun.*

Windows Görev Yöneticisi size yalan söyleyebilir ama **Process Explorer** söylemez. Bu görevde, Microsoft'un efsanevi mühendisi Mark Russinovich tarafından yazılan Sysinternals araçlarını kullanacağız.

**Adım 1: Cephaneyi Hazırla**
1.  Microsoft'un resmi [Sysinternals Suite](https://learn.microsoft.com/en-us/sysinternals/downloads/sysinternals-suite) paketini indirin.
2.  ZIP dosyasını klasöre çıkarın.
3.  `procexp.exe` (Process Explorer) uygulamasını **Yönetici Olarak (Run as Administrator)** çalıştırın.

**Adım 2: Analiz ve Raporlama (3 Görev)**
Aşağıdaki analizleri kendi bilgisayarınızda yapın ve sonuçları raporlayın:

1.  **Parent-Child (Ebeveyn-Çocuk) Analizi:**
    * Bir programın kim tarafından başlatıldığı, onun güvenli olup olmadığını anlamanın en iyi yoludur.
    * *Görev:* Herhangi bir programa (Örn: Chrome, Word veya Discord) sağ tıklayıp **"Properties"** deyin. **"Image"** sekmesindeki **"Parent"** kısmını bulun.
    * *Rapor:* Seçtiğiniz programın Parent süreci nedir? (Örn: `explorer.exe` -> `chrome.exe`). Ekran görüntüsünü ekleyin.

2.  **Svchost Avı (Service Host):**
    * Listede pembe renkli onlarca `svchost.exe` göreceksiniz. Bunlar Windows servislerini (Windows Update, Bluetooth, Ses vb.) taşıyan süreçlerdir.
    * *Görev:* Bir tane `svchost.exe` sürecinin üzerine farenizi getirin (Hover). Açılan sarı kutucukta (Tooltip) hangi servislerin çalıştığını görün.
    * *Rapor:* İçinde en az 3-4 servisin çalıştığı bir svchost'un ekran görüntüsünü alın.

3.  **İmza Kontrolü (Verify Signatures):**
    * Zararlı yazılımlar genellikle Microsoft imzasına sahip değildir.
    * *Görev:* Menüden **Options > Verify Image Signatures** seçeneğini işaretleyin.
    * *Analiz:* Listede "Company Name" kısmında **(Verified) Microsoft Windows** yazmayan, mor veya kırmızı renkle işaretlenmiş bir süreç var mı?
        * *Varsa:* Nedir bu program? Güvenli mi? (Google'layın).
        * *Yoksa:* Bu özelliğin bir Malware Analisti için neden hayati olduğunu 1 cümleyle açıklayın.

!

---

#### **🧠 BÖLÜM D: Mühendislik Vizyonu (Reflection)**

*Analiz bitti, şimdi yorumlama zamanı. Bir mühendisi, bir "Script Kiddie"den ayıran şey; komutları ezberlemesi değil, sistemin davranışını öngörebilmesidir.*

Aşağıdaki sorulara **teknik gerekçelerle** ve **kendi cümlelerinizle** cevap verin.

**1. Yetki Yükseltme (PrivEsc) Mantığı:**
*Senaryo:* Linux sistem yöneticisi, işlerini kolaylaştırmak için `vim` (metin editörü) programına `SUID` biti atamış (`chmod u+s /usr/bin/vim`).
* **Soru:** Sadece metin düzenlemeye yarayan masum bir editör, bu "küçük" izin hatası yüzünden nasıl olur da sıradan bir kullanıcıyı **ROOT** (Süper Yönetici) yapabilir? `/etc/shadow` veya `/etc/sudoers` dosyaları üzerinden mantığı açıklayın.

**2. Zararlı Yazılım Kamuflajı (Process Injection):**
*Senaryo:* Bir Malware geliştiricisisiniz ve virüsünüzün (Trojan) antivirüsler tarafından fark edilmemesini ve sistemde en yüksek yetkide çalışmasını istiyorsunuz.
* **Soru:** Kodunuzu neden rastgele bir `oyun.exe` yerine, sistemin kendi parçası olan `svchost.exe` veya `explorer.exe` sürecinin içine enjekte edersiniz?
    * *İpucu 1:* Görev yöneticisine bakan bir göz ne görür? (Stealth/Gizlilik).
    * *İpucu 2:* `svchost.exe` genellikle hangi kullanıcı yetkisiyle (SYSTEM vs User) çalışır? (Privilege).

---

### 📤 Teslim Formatı ve Kontrol Listesi

Raporunuzu teslim etmeden önce aşağıdaki maddelerin tamamlandığından emin olun. Bu sektörde **"Raporlama"**, teknik işin yarısıdır.

* **Dosya Adı:** `Ad_Soyad_Hafta3.pdf` (Örn: `Ali_Yilmaz_Hafta3.pdf`)
* **Format:** PDF (Word veya TXT kabul edilmez). (10 - 12 Sayfa Önerilir, Max 15 Sayfa)
* **Sayfa Düzeni:**
    * [ ] **Kapak Sayfası:** (Eğitim Adı, Hafta Numarası, Adınız, Tarih).
    * [ ] **İçindekiler:** (Opsiyonel ama önerilir).
    * [ ] **Ekran Görüntüleri:** Her görevde (Linux komutları, Bandit şifreleri, Process Explorer analizleri) kanıt niteliğinde görsel var mı?
    * [ ] **Açıklamalar:** Görsellerin altında ne yapıldığına dair 1-2 cümlelik teknik açıklama var mı?

**GitHub Yükleme Adımları:**
1.  Bu repoyu kendi profilinize **Fork** etmişsinizdir (Hafta 1'de).
2.  Kendi profilinizdeki repoya gidin -> `Hafta-3/Odevler` klasörüne girin.
3.  `Add file > Upload files` diyerek PDF'inizi yükleyin ve **Commit** edin.
4.  Ana repoya gelerek **Pull Request (PR)** açın.

---

### 📚 İpucu Kutusu (Cheat Sheet)

Görev sırasında takılırsanız, hayat kurtaran bu komutlara ve ipuçlarına göz atın:

#### 🐧 Linux (Bandit İpuçları)
| Komut | Açıklama |
| :--- | :--- |
| `man <komut>` | Kılavuzu açar. (Örn: `man ls` ile parametreleri öğrenin). |
| `ls -la` | Gizli dosyaları (`.`) ve izinleri listeler. |
| `cat ./-dosya` | İsmi `-` (tire) ile başlayan dosyaları okumak için kullanılır. |
| `file <dosya>` | Dosyanın türünü (ASCII text, Data, Zip vb.) söyler. |
| `find . -type f -size 1033c` | Bulunduğun yerde **1033 byte** boyutundaki dosyayı bulur. (Level 5-6 için kritik). |
| `grep "aranan" dosya` | Dosya içinde kelime arar. |
| `sort | uniq -u` | Tekrar eden satırları eler, **benzersiz** olanı bırakır. |

#### 🪟 Windows (Process Explorer Renkleri)
* **Pembe:** Windows Servisleri (Arka planda çalışan hizmetler).
* **Mavi:** Sizin başlattığınız (User Mode) süreçler.
* **Kırmızı:** O an kapanmakta olan (Kill edilen) süreçler.
* **Yeşil:** O an yeni başlayan süreçler.
* **Mor:** "Image" (Dosya) sıkıştırılmış veya paketlenmiş (Packed).

> **💡 Analist Tavsiyesi:** Process Explorer'da bir sürecin üzerine gelip beklerseniz (Hover), o sürecin komut satırını (Command Line) görürsünüz. Zararlı yazılımlar genellikle komut satırında kendilerini ele verirler!

---

**Başarılar, Sistem Mühendisleri.**
*AnkaCORE Operasyon Merkezi*