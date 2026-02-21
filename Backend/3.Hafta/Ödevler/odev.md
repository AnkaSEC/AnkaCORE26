# 🎓 Java Proje Ödevi 2

## 📌 Konu: Konsol Tabanlı Personel Yönetim Sistemi

Bu projede, Java’da öğrendiğin nesne yönelimli programlama kavramlarını kullanarak bir **Personel Yönetim Sistemi** geliştirmen beklenmektedir.

Bu ödevde özellikle şu konular ön plandadır:

* Kalıtım (Inheritance)
* Çok Biçimlilik (Polymorphism)
* Encapsulation
* Abstraction
* Interface kullanımı

---

# 🎯 Projenin Amacı

Bir şirkette farklı türde çalışanlar vardır:

* Normal çalışan
* Müdür
* Stajyer

Her personelin maaş hesaplama şekli farklıdır.

Program:

* Personel ekleyebilmeli
* Tüm personelleri listeleyebilmeli
* Maaşları hesaplayabilmeli
* En yüksek maaşlı personeli gösterebilmeli

---

# 🧠 Bu Projede Kullanman Gereken Konular

## 🔴 Zorunlu OOP Konuları

* Inheritance (extends kullanılmalı)
* super anahtar kelimesi
* Method overriding
* Polymorphism
* Encapsulation
* Getter / Setter metotları
* Abstract class kullanılmalı
* Interface kullanılmalı
* final anahtar kelimesi en az bir yerde kullanılmalı
* Object sınıfından gelen bir metot override edilmeli (`toString()` önerilir)

---

# 🏗 Proje Senaryosu

Sistemde farklı personel tipleri olacaktır:

### 👤 Ortak bilgiler:

* Ad
* Soyad
* ID
* Çalışma yılı

Ancak maaş hesapları farklıdır:

| Personel Türü | Maaş Hesabı              |
| ------------- | ------------------------ |
| Çalışan       | Sabit maaş               |
| Müdür         | Maaş + yönetim tazminatı |
| Stajyer       | Günlük ücret × gün       |

---

# 📦 Zorunlu Paket Yapısı

```
company/
 ├── Main.java
 ├── model/
 │     ├── Employee.java
 │     ├── Manager.java
 │     ├── Intern.java
 └── service/
       └── EmployeeService.java
```

---

# 🧩 1️⃣ Abstract Üst Sınıf: Employee

Bu sınıf **abstract olmalıdır**.

### Alanlar (private):

* name
* surname
* id
* workYear

### Constructor kullanılmalı

### Metotlar:

| Metot                               | Açıklama                    |
| ----------------------------------- | --------------------------- |
| `abstract double calculateSalary()` | Alt sınıflar hesaplayacak   |
| Getter / Setter                     | Encapsulation için          |
| `toString()` override edilmeli      | Personel bilgisi yazdırmalı |

---

# 👨‍💼 2️⃣ Alt Sınıflar

## ✔ Manager sınıfı

* Employee’dan kalıtım almalı
* Ek alan: bonus
* Maaş = baseSalary + bonus
* `calculateSalary()` override edilmeli
* Constructor içinde `super()` kullanılmalı

---

## ✔ Intern sınıfı

* Ek alan: dailyWage
* Ek alan: workedDays
* Maaş = dailyWage × workedDays
* Override yapılmalı

---

## ✔ Normal Employee nesnesi oluşturulabilir

(İstersen bu sınıf concrete de olabilir veya ayrı bir Worker sınıfı açabilirsin.)

---

# 🔌 3️⃣ Interface Kullanımı

Bir interface oluştur:

```
Payable
```

### Metot:

```
double calculateSalary();
```

Employee sınıfı bu interface’i implement etmelidir.

---

# ⚙️ 4️⃣ EmployeeService Sınıfı

Personeller burada tutulmalıdır.

```
Employee[] employees = new Employee[100];
```

⚠️ Bu önemli:
**Dizi tipi Employee olmalı → Polymorphism zorunlu**

---

### Metotlar:

| Metot                   | Açıklama                  |
| ----------------------- | ------------------------- |
| addEmployee(Employee e) | Personel ekler            |
| listEmployees()         | Tüm personelleri yazdırır |
| showHighestSalary()     | En yüksek maaşı bulur     |
| showMenu()              | Menü yazdırır             |

---

# 🖥 Main Sınıfı

Program döngü içinde çalışmalı.

### Menü:

```
1 - Çalışan Ekle
2 - Müdür Ekle
3 - Stajyer Ekle
4 - Personelleri Listele
5 - En Yüksek Maaşı Göster
6 - Çıkış
```

---

# 🔧 Zorunlu Kullanımlar

| Konu         | Nerede Kullanılacak    |
| ------------ | ---------------------- |
| while        | Menü döngüsü           |
| switch       | Menü seçimleri         |
| Scanner      | Kullanıcıdan veri alma |
| if-else      | Giriş doğrulama        |
| for          | Maaş karşılaştırma     |
| Polymorphism | Employee dizisi        |
| Overriding   | Maaş hesaplama         |
| super        | Constructor            |
| final        | En az bir değişkende   |

---

# 📋 Teslim Şartları

* Paket yapısı doğru olmalı
* Kodlar yorum satırı içermeli
* Program hatasız çalışmalı
* En az 5 personel ile test edilmeli
* OOP prensipleri doğru uygulanmalı