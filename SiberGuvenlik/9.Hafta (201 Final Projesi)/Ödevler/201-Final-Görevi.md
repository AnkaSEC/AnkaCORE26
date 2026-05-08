# 🦅 Siber Güvenlik Mühendisliği Eğitimi - 2026

> **"Zafiyet bulmak gürültülü bir makinenin işidir; ancak sistemi kandırıp kaleye içeriden kapıyı açtırmak sanatın ta kendisidir."**

Bu repo, AnkaCORE '26 eğitim programının **201 Aşaması: Kırmızı Takım Operasyonları (Red Team Ops)** teslim merkezidir. Zafiyet tarayıcıların (Scanner) arkasına saklanmayı geride bıraktınız. Artık hedef odaklı, sessiz ve planlı bir "Düşman" (Adversary) gibi düşüneceksiniz. Bu görev, ekrana yeşil yazılar akıtan bir operatörden, uçtan uca saldırı senaryosu kurgulayan bir "Stratejist"e dönüştüğünüzü kanıtlama yeridir.

---

## 📅 201 RED TEAM OPERASYONU: "Adversary Simulation"

| Parametre | Detay |
| :--- | :--- |
| **Durum** | 🔴 İLERİ SEVİYE FİNAL OPERASYONU (201 Aşaması) |
| **Kapsam** | Red Team, Initial Access, Post-Compromise, MITRE ATT&CK |
| **Zorluk Seviyesi** | ⭐⭐⭐⭐⭐ (5/5 - FİNAL) |
| **Son Teslim** | **Pazar Gününe Kadar (Geçmiş Eksiklerle Birlikte) Geç Teslim için Pazartesi 23.59 Son Tarih** |

---

### 🚀 Görev Özeti

Gerçek dünyada kurumsal ağların (Firewall vb.) dışarıdan aşılması neredeyse imkansızdır. Bir Kırmızı Takım (Red Team) üyesinin amacı; gürültü çıkarmadan, çalışanları kandırarak (Phishing) sessizce içeri girmek (Initial Access) ve yakalanmadan sistemde kalıcılık (Persistence) sağlamaktır. Bu final projesinde, bir saldırı senaryosunu uçtan uca kurgulayacak ve sadece ne yaptığınızı değil, "neden" yaptığınızı açıklayacaksınız.

---

### 🛑 KRİTİK UYARI: "YAPAY ZEKA YASAKTIR" KURALI

1. **Yapay Zeka (ChatGPT, Claude vb.) Kullanımı KESİNLİKLE Yasaktır:** Bu rapor sizin strateji belgenizdir. Jenerik AI cümleleri anında tespit edilecek ve değerlendirmeye alınmayacaktır. Kendi cümlelerinizle, bozuk ama *size ait* bir dille yazın.
2. **Bayrak (Flag) Odaklı Değil, Mantık Odaklı:** Bizim için odayı bitirmeniz değil, saldırı vektörünü neden seçtiğinizi açıklayabilmeniz önemlidir. 

---

### 📝 FAZ 1: Düşman Zihniyeti (Adversary Mindset)

Saldırıya başlamadan önce Kırmızı Takım vizyonunu teorik olarak zihninize oturtmanız gerekmektedir. 
*(Öneri: Bu fazı yanıtlamadan önce TryHackMe: `Red Team Fundamentals` odasını çözerek ısının).*

**Beklenti & Raporlama:** Aşağıdaki 3 konsepti tamamen kendi cümlelerinizle, bir mülakattaymışsınız gibi açıklayın:

**1. Zihniyet Değişimi: "Gürültülü vs. Sessiz"**
* Geleneksel bir "Sızma Testi" (Pentest) ile "Kırmızı Takım" (Red Team) operasyonu arasındaki temel fark nedir? Neden Pentest gürültülüyken, Red Team operasyonları aylarca sürebilen sessiz bir süreçtir?

**2. Saldırının Anatomisi: Cyber Kill Chain**
* Cyber Kill Chain (Siber Cinayet Zinciri) nedir? Bir saldırgan hedefine ulaşana kadar hangi 7 kritik aşamadan geçer? (Keşiften Eyleme kadar mantığını özetleyin).

**3. Taktik Haritası: MITRE ATT&CK**
* Güvenlik sektöründe herkesin konuştuğu MITRE ATT&CK Framework ne işe yarar? Biz Kırmızı Takım olarak bu haritayı neden kullanıyoruz?

---

### ⚔️ FAZ 2: Saha Operasyonu (Boss Fights)

Teori bitti, şimdi tetiği çekme ve senaryoyu hayata geçirme zamanı. Aşağıdaki 2 cephede operasyonu tamamlayıp çözüm adımlarınızı (ve tercih ettiğiniz stratejileri) raporlayın.

---

#### 🎣 Cephe 1: Kapıdan Girmek (Initial Access)
* **Hedef:** [TryHackMe: Initial Access](https://tryhackme.com/module/red-team-initial-access)
* **Görev:** Dışarıdan port taramasıyla giremediğimiz kaleye, içeriden birini kandırarak girin.
* **Beklenti & Raporlama (Sadece ekran görüntüsü atıp geçmeyin):**
    * İçeri sızmak için hangi saldırı vektörünü (Oltalama, Makrolu Word belgesi vb.) kullandınız ve *neden* bu yöntemi seçtiniz?
    * Zararlı yükü (Payload) nasıl hazırladınız ve karşıdan gelen bağlantıyı (Listener) nasıl yakaladınız?

#### 👣 Cephe 2: İçeride Gezinmek ve Hayatta Kalmak (Post-Compromise)
* **Hedef:** [TryHackMe: Post Compromise](https://tryhackme.com/module/post-compromise)
* **Görev:** İçeri girdiniz ama yetkiniz düşük ve yakalanma riskiniz çok yüksek.
* **Beklenti & Raporlama:**
    * İçeri girdikten sonra güvenlik sistemlerini (AV/EDR) tetiklememek için "Living off the Land" (Sistemdeki yasal araçları kullanma - örn: `whoami`, `net user`) prensibini nasıl uyguladınız?
    * Bilgisayar yeniden başlatıldığında bağlantıyı kaybetmemek (Kalıcılık/Persistence) için sisteme nasıl bir arka kapı (Registry vb.) eklediniz?

---

### 🧠 FAZ 3: Strateji Raporu (Conclusion)

*Simülasyon bitti. Şimdi operasyon liderinize bir Kırmızı Takım durum raporu sunuyorsunuz.*

Cevaplarınızı kendi taktiksel vizyonunuza göre yanıtlayın:

**1. Payload Mantığı:**
* Bir zararlı dosya oluştururken "Bind Shell" ile "Reverse Shell" arasındaki o kritik fark nedir? Kurumsal ağların güvenlik duvarları (Firewall) düşünüldüğünde Kırmızı Takım neden her zaman Reverse Shell'i tercih eder?

**2. Gecikme ve Hata (Jitter & Sleep):**
* Zararlı yazılımımız, C&C sunucusuyla (bizimle) haberleşirken neden komutları anında iletmez de araya "Sleep" (Uyku) ve "Jitter" (Rastgele gecikme) süreleri koyarız? Kimi kandırmaya çalışıyoruz?

---

### 📤 Teslim Formatı ve Kontrol Listesi

Bu rapor, 201 aşamasının **FİNAL BELGESİDİR** ve 301 Aşamasına geçip geçemeyeceğinizi belirleyecek ana unsurdur. 

* **Dosya Adı:** `Ad_Soyad_201_RedTeam_Final.pdf`
* **Format ve Uzunluk:** Sadece PDF Formatı. Ekran görüntülerini net, strateji açıklamalarınızı AI kullanmadan *kendi* kelimelerinizle yazın.
* **Sayfa Düzeni ve Kontrol Listesi:**
    * [ ] **Kapak Sayfası:** Eğitim Adı, Görev Adı, Adınız Soyadınız ve Tarih.
    * [ ] **Faz 1 (Mantık):** Red Team, Kill Chain ve MITRE kavramları açıklandı mı?
    * [ ] **Faz 2 (Initial Access):** İlk sızma vektörü ve Payload/Listener ekran görüntüleri var mı?
    * [ ] **Faz 2 (Post-Compromise):** Enumeration (LotL) ve Kalıcılık (Persistence) adımları kanıtlandı mı?
    * [ ] **Faz 3 (Sonuç):** Reverse Shell ve Jitter/Sleep mantığı anlaşıldı mı?
* **Yükleme Adımları:** Kendi GitHub reponuzda oluşturacağınız `201-RedTeam-Final` klasörüne PDF dosyanızı yükleyip, ana repoya **Pull Request (PR)** açın.

---

### 📚 İpucu Kutusu (Red Team Cheat Sheet)

Saha operasyonunda ihtiyacınız olacak temel Kırmızı Takım mühimmatı:

| Kavram / Araç | Kullanım Amacı / Açıklaması |
| :--- | :--- |
| **msfvenom** | İçine zararlı kodlar gizlenmiş dosyalar (exe, pdf, word makrosu) üretmemizi sağlayan Metasploit aracıdır. |
| **Listener (Dinleyici)** | Kurban o zararlı dosyaya tıkladığında, kurbandan bize doğru gelecek olan bağlantıyı karşılamak için açtığımız port/sunucudur. |
| **Living off the Land (LotL)** | İçeri girdikten sonra dışarıdan hack tool'ları (örn: nmap, mimikatz) indirmek yerine, Windows'un kendi yasal komutlarını (`net user`, `powershell`) kullanarak sessizce bilgi toplama sanatıdır. |
| **Persistence (Kalıcılık)** | Kurban cihazı kapatıp açtığında erişimimizi kaybetmemek için Kayıt Defterine (Registry) veya Başlangıç klasörüne gizli bir kod/dosya eklemektir. |

**Unutmayın: Hedefimiz bayrağı bulmak değil, zihniyeti kazanmaktır.**

*AnkaCORE Operasyon Merkezi* 🦅
