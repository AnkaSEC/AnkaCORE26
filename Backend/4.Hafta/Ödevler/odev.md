# 🎓 Java Proje Ödevi 3

## 📌 Konu: Konsol Tabanlı Kütüphane Yönetim Sistemi

Bu projede, bir kütüphanede kitapların ve üyelerin yönetildiği bir sistem geliştirmen beklenmektedir.

Bu ödev, Java’da öğrendiğin şu konuları **aktif olarak kullanman için hazırlanmıştır**:

* Collections Framework
* Exception yönetimi
* Custom Exception oluşturma
* Dosya okuma / yazma
* String ve StringBuilder
* Math ve Date sınıfları

Önceki konular (OOP, interface, abstraction, encapsulation vb.) yine kullanılmalıdır.

---

# 🎯 Projenin Amacı

Sistem:

* Kitap ekleyebilmeli
* Üye ekleyebilmeli
* Kitap ödünç verip geri alabilmeli
* Kitapları dosyaya kaydedebilmeli
* Açılışta dosyadan yükleyebilmeli
* Geciken kitapları hesaplayabilmeli

---

# 🧠 Bu Projede Kullanman Gereken Konular

## 🔴 Collections (Zorunlu)

Aşağıdakiler mutlaka kullanılmalıdır:

* `ArrayList<Book>` → kitap listesi
* `HashMap<Integer, Member>` → üye ID ile erişim
* `HashSet<String>` → benzersiz kategori listesi
* `Iterator` ile en az bir yerde dolaşım yapılmalı

---

## 🔴 Exception Yönetimi

Programda:

* try-catch blokları olmalı
* finally bloğu en az bir yerde kullanılmalı
* throws keyword kullanılmalı
* Custom Exception yazılmalı

---

### ✔ Zorunlu Custom Exception

```
BookNotAvailableException
```

Şu durumlarda fırlatılmalı:

* Kitap zaten ödünçteyse
* Kitap bulunamazsa

---

## 🔴 Dosya İşlemleri

Program:

* Çıkarken kitapları ve üyeleri dosyaya kaydetmeli
* Açılışta dosyadan yüklemeli

### Örnek kitap dosyası

```
BOOK;1;Sefiller;Victor Hugo;Roman;true
BOOK;2;Suç ve Ceza;Dostoyevski;Roman;false
```

### Örnek üye dosyası

```
MEMBER;101;Ali;2024-05-10
MEMBER;102;Ayşe;2023-11-02
```

Kullanılabilecek sınıflar:

* BufferedWriter
* BufferedReader
* FileWriter
* FileReader

---

## 🔴 String Konuları

Programda:

* split()
* equalsIgnoreCase()
* contains()
* trim()

kullanılmalı.

---

### ✔ StringBuilder Görevi

Bir metot yaz:

```
String generateLibraryReport()
```

Bu metot:

* Toplam kitap sayısı
* Ödünç verilen kitap sayısı
* En popüler kategori
* Üye sayısı

bilgilerini tek metin olarak döndürmelidir.

---

## 🔴 Math ve Date Kullanımı

### ✔ Date Görevi

Kitap ödünç alınırken:

```
LocalDate borrowDate
LocalDate returnDate
```

alanları tutulmalı.

Metot:

```
long calculateLateDays()
```

→ Eğer kitap geç verilmişse kaç gün geciktiğini hesaplamalı.

---

### ✔ Math Görevi

* Ortalama ödünç süresi hesaplanmalı
* En çok ödünç alınan kategori bulunmalı
* Gecikme cezası hesaplanmalı

Örnek:

```
ceza = geciken_gün * 2.5 TL
```

---

# 🏗 Zorunlu Sınıflar

```
library/
 ├── Main.java
 ├── model/
 │     ├── Book.java
 │     ├── Member.java
 │     ├── Loan.java
 │
 ├── exception/
 │     └── BookNotAvailableException.java
 │
 └── service/
       ├── LibraryService.java
       └── FileService.java
```

---

# 📚 Book Sınıfı

Alanlar:

* id
* title
* author
* category
* isAvailable

---

# 👤 Member Sınıfı

Alanlar:

* id
* name
* registerDate (LocalDate)

---

# 📦 Loan Sınıfı

Alanlar:

* Book book
* Member member
* borrowDate
* returnDate

Metotlar:

* isLate()
* calculateLateDays()

---

# ⚙️ LibraryService

Metotlar:

| Metot            | Açıklama           |
| ---------------- | ------------------ |
| addBook()        | Kitap ekler        |
| addMember()      | Üye ekler          |
| borrowBook()     | Kitap ödünç verir  |
| returnBook()     | Kitap iade alır    |
| listBooks()      | Kitapları listeler |
| generateReport() | Rapor üretir       |

---

# 🖥 Menü

```
1 - Kitap Ekle
2 - Üye Ekle
3 - Kitap Ödünç Ver
4 - Kitap İade Al
5 - Kitapları Listele
6 - Rapor Oluştur
7 - Dosyaya Kaydet
8 - Dosyadan Yükle
9 - Çıkış
```

---

# 🔧 Zorunlu Kullanımlar

| Konu             | Nerede Kullanılacak  |
| ---------------- | -------------------- |
| ArrayList        | Kitap listesi        |
| HashMap          | Üye erişimi          |
| HashSet          | Kategori             |
| Iterator         | Liste dolaşımı       |
| try-catch        | Ödünç işlemleri      |
| Custom Exception | Kitap müsait değilse |
| StringBuilder    | Rapor üretimi        |
| split()          | Dosya okuma          |
| LocalDate        | Ödünç tarihi         |
| Math             | Ceza hesaplama       |

---

# 📋 Teslim Şartları

* OOP prensipleri doğru uygulanmalı
* Collections kullanılmalı
* Exception yönetimi olmalı
* Dosya işlemleri çalışmalı
* Kod yorum satırı içermeli
* Program yeniden açıldığında veriler yüklenmeli