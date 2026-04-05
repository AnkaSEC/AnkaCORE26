# 🦅 201 Operasyon: Nöbetçi Kulesi (SOC Analiz Raporu)

> **"Saldırganlar iz bırakmamak için savaşır, savunmacılar ise o izleri okumak için. Gerçek bir mühendis, ekrana düşen tek bir logdan tüm hikayeyi yazabilendir."**

Selamlar Ekip, 

Önümüzdeki haftalarda vize sınavlarınızın olduğunu biliyoruz. AnkaSEC olarak akademik gelişiminizi destekliyoruz, bu yüzden bu hafta sizi uzun TryHackMe odalarında veya bitmek bilmeyen terminal ekranlarında yormayacağız. Ancak siber dünyada alarmlar asla susmaz. 

Bu haftaki göreviniz; pazar günkü derste canlı olarak işlediğimiz **LetsDefend** platformuna girip, gerçek bir Mavi Takım (SOC) analisti gibi 3 vakayı (Alert) analiz etmek ve bunu raporlamaktır. Sadece kalitenizi ve analitik düşünme yeteneğinizi görmek istiyoruz.

---

## 📅 GÖREV DETAYI

| Parametre | Detay |
| :--- | :--- |
| **Durum** | 🔵 MAVİ TAKIM OPERASYONU (Vize Haftası Özel) |
| **Kapsam** | Olay Müdahalesi (Incident Response), Log Analizi, LetsDefend |
| **Zorluk Seviyesi** | ⭐⭐⭐ (3/5 - Analitik Düşünce Odaklı) |
| **Son Teslim** | 05 Nisan Pazar 23.59 (Geç Teslim: 06 Nisan Pazartesi 23.59) |

---

### 🚀 Görev Özeti: "Vardiya Sende"

Bir SOC analisti olarak vardiyayı devraldınız. Sisteminize bir alarm düştü. Göreviniz bu alarmı sahiplenmek (Take Ownership), logları incelemek ve yönetime sunulacak net, profesyonel bir **Olay Müdahale Raporu (Incident Report)** hazırlamaktır.

#### 🎯 Operasyon Adımları:
1. **Platforma Giriş:** [LetsDefend.io](https://app.letsdefend.io/) adresine gidin ve (eğer yoksa) ücretsiz hesabınızı oluşturun.
2. **Alarm Seçimi:** "Monitoring" veya "Alerts" sekmesine geçin. Kendinize **Windows işletim sistemiyle alakalı**, komut satırı veya şüpheli işlem (Örn: *Suspicious MSHTA, Command Injection, Malicious Process execution*) içeren **ücretsiz** bir alarm seçin ve sahiplenin.
3. **Analiz:** Platformdaki "Log Management" veya "Endpoint Security" sekmelerini kullanarak saldırganın bıraktığı izleri (Event ID, çalıştırılan komutlar, IP adresleri) tespit edin. Playbook adımlarını takip edin.
4. **Karar:** Bu bir gerçek saldırı mı (True Positive) yoksa sistemin yanlış anladığı normal bir işlem mi (False Positive)? Kararınızı verin ve alarmı kapatın.

---

### 📋 Raporlama Formatı (Teslimat)

Hazırlayacağınız PDF dosyası, gereksiz laf kalabalığından uzak, doğrudan bir SOC yöneticisine (Manager) sunulacak netlikte olmalıdır. Raporunuz şu başlıkları içermelidir:

* **1. Alarm Bilgileri:**
    * Alarm Adı (Rule Name):
    * Tarih / Saat:
    * Hedef Makine (Hostname / IP):
* **2. Olay Analizi (Investigation):**
    * Saldırgan hangi IP adresinden gelmiş veya hangi zararlı dosyayı çalıştırmış?
    * Arka planda hangi Windows komutu (Command Line) çalıştırılmış? (Ekran görüntüsü ekleyin).
    * Bu komutun amacı nedir? (Kendi cümlelerinizle "Saldırgan burada ... yapmaya çalışmış" şeklinde özetleyin).
* **3. Sonuç ve Aksiyon (Verdict):**
    * Saldırı Başarılı mı / Başarısız mı? 
    * Durum: True Positive mi / False Positive mi? Neden?
    * Cihazı izole ettiniz mi (Containment)?

---

### 📤 Teslim Formatı ve Kontrol Listesi

* **Dosya Adı:** `Ad_Soyad_201_Hafta6_Raporu.pdf`
* **Format:** Maksimum 5-6 sayfalık PDF. Olayı bir mühendis gibi analiz ettiğinizi bize kanıtlayın.
* **Yükleme Adımları:** Kendi GitHub reponuzda bulunan klasörünüze PDF dosyanızı yükleyip, ana repoya **Pull Request (PR)** açın.

Vize haftalarınızda başarılar dileriz. Klavyenize kuvvet!

*AnkaCORE26 Operasyon Merkezi* 🦅