# JavaScript’te Değişken Yapısı, Veri Tipleri ve Modern Sözdizimi

JavaScript, dinamik yapısı ve esnek sözdizimi sayesinde modern web geliştirme dünyasında merkezi bir konuma sahiptir. Bu yazıda; değişken tanımlama mekanizması, veri tipleri, scope kavramı, hoisting davranışı, string işlemleri ve destructuring yapısı teknik ve kavramsal bütünlük içerisinde ele alınacaktır.

---

## 1. JavaScript’te Değişken Tanımlama

JavaScript’te değişken tanımlamak için üç temel anahtar kelime kullanılır:

- `var`
- `let`
- `const`

Bu anahtar kelimelerin hiçbiri değişkenin veri tipini belirlemez. JavaScript dinamik tipli bir dildir; yani tip ataması çalışma anında yapılır.

### 1.1 Naming Convention

- Değişken isimlerinde genellikle **camelCase** kullanılır.
- Sabit değerlerde çoğunlukla **UPPER_SNAKE_CASE** tercih edilir.

Örnek:

```javascript
var variableOne = 2;
let variableTwo = "js";
const VARIABLETHREE = "4.1";
```

---

## 2. Dinamik Tip Sistemi ve Veri Türleri

JavaScript’te değişkenin değil, değerin tipi vardır. Aynı değişken farklı zamanlarda farklı tipte değer tutabilir.

```javascript
let x = 5;          // number
x = "merhaba";      // string
x = true;           // boolean
```

### 2.1 Primitive (İlkel) Tipler

Primitive tipler bellekte değerin kendisini tutar:

- `number`
- `string`
- `boolean`
- `undefined`
- `null`

Kopyalandıklarında tamamen yeni bir değer oluşturulur.

### 2.2 Reference (Referans) Tipler

Referans tipler bellekteki adresi taşır:

- `object`
- `array`
- `function`
- `date`

Bu türlerde kopyalama yapıldığında veri paylaşımı gerçekleşir.

---

## 3. Scope (Kapsam) Kavramı

Scope, bir değişkenin nereden erişilebilir olduğunu belirler.

- **Global Scope**: Her yerden erişilebilir.
- **Function Scope**: Sadece tanımlandığı fonksiyon içinde geçerlidir.
- **Block Scope**: `if`, `for` gibi blok yapılarında geçerlidir.

`var` fonksiyon kapsamına sahiptir.  
`let` ve `const` blok kapsamına sahiptir.

Bu fark, özellikle büyük ölçekli projelerde hata riskini azaltmak açısından kritiktir.

---

## 4. Hoisting ve Temporal Dead Zone (TDZ)

Hoisting, JavaScript motorunun kodu çalıştırmadan önce değişken ve fonksiyon tanımlarını belleğe almasıdır.

- `var` hoist edilir ve başlangıçta `undefined` atanır.
- `let` ve `const` hoist edilir ancak **Temporal Dead Zone (TDZ)** nedeniyle tanımlanmadan önce erişilemez.

TDZ, değişkenin tanımlandığı satıra kadar olan süredir ve bu aralıkta değişkene erişim yasaktır.

---

## 5. Template Literal ve String İşlemleri

Modern JavaScript’te string işlemleri daha okunabilir ve esnek hale gelmiştir.

### 5.1 Template Literal

Backtick (`` ` ``) kullanılarak çok satırlı ve değişken gömülü stringler oluşturulabilir:

```javascript
const name = "Melike";
const age = 30;

const message = `
Kullanıcı Bilgileri
-------------------
İsim: ${name}
Yaş: ${age}
`;
```

Bu yapı klasik string birleştirme yöntemine göre daha sürdürülebilir bir yaklaşımdır.

---

## 6. String Metodları

JavaScript string’leri immutable’dır; yani metotlar orijinal değeri değiştirmez.

Başlıca metotlar:

- `length`
- `toUpperCase()`
- `toLowerCase()`
- `slice()`
- `substring()`
- `split()`
- `includes()`
- `replace()`
- `trim()`
- `padStart()`
- `padEnd()`

Bu metotlar veri işleme, doğrulama ve formatlama süreçlerinde yoğun biçimde kullanılır.

---

## 7. Destructuring (Yapısal Ayrıştırma)

Destructuring, object veya array içindeki değerleri daha kısa ve temiz biçimde çıkarmayı sağlar.

### 7.1 Object Destructuring

```javascript
const user = {
  id: 1,
  user_name: "Melike",
  profile: {
    city: "Gaziantep",
    country: "TR",
  },
};

const { user_name, id } = user;
```

Nested yapıdan veri alma:

```javascript
const { profile: { city, country } } = user;
```

### 7.2 Array Destructuring

```javascript
const colors = ["red", "green", "blue", "yellow"];

const [first, , third] = colors;
```

Bu yöntem, özellikle API yanıtlarının işlenmesinde ve modern framework projelerinde yaygın şekilde kullanılır.

---

# Sonuç

JavaScript’in esnekliği, doğru kavramsal temellerle birleştiğinde güçlü ve ölçeklenebilir yazılım mimarileri oluşturmayı mümkün kılar.

- `var`, `let`, `const` farklarının doğru anlaşılması  
- Primitive ve reference tip ayrımının bilinmesi  
- Scope ve hoisting mekanizmasının kavranması  
- String metodlarının etkin kullanımı  
- Destructuring yapısının benimsenmesi  

Bu konular yalnızca başlangıç seviyesinde değil; ileri seviye uygulama mimarilerinde de kritik rol oynar.
