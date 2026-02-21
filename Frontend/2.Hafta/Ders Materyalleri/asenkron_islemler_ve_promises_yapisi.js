/*

setTimeout, JavaScript'e "Bunu hemen yapma,
şu kadar süre bekle, sonra yap" demenin yoludur.

setTimeout(fonksiyon, süre_ms) kullanılır

-------------------------------------------------------------------------------------

console.log("1. Sipariş verildi.");

setTimeout(() => {
    console.log("2. Kargo yola çıktı (3 saniye sonra).");
}, 3000);

console.log("3. Fatura kesildi.");

-------------------------------------------------------------------------------------

Promise, bir "Söz"dür demiştik. .then() (O zaman/Sonra),
eğer söz tutulursa (yani resolve çalışırsa) ne yapılacağını belirleyen bloktur.

// BURASI SADECE RESOLVE ÇALIŞIRSA DEVREYE GİRER

--------------------------------------------------------------------------------------

resolve(veri) fonksiyonunun içine koyduğun veri,
.then(gelenVeri) parametresine aktarılır.

--------------------------------------------------------------------------------------

Hayatta her şey yolunda gitmez. .catch() (Yakala),
eğer söz tutulamazsa (yani reject çalışırsa) devreye giren "Acil Durum Freni"dir.

// BURASI SADECE REJECT ÇALIŞIRSA DEVREYE GİRER

--------------------------------------------------------------------------------------

reject(hataMesaji) fonksiyonunun içindeki mesaj, .catch(hata) parametresine aktarılır.

-------------------------------------------------------------------------------------

console.log("⏳ Kullanıcı uygulamada bekliyor...");

kargoTakip
    .then((sonuc) => {
        console.log("✅ İŞLEM BAŞARILI!");
        console.log("Paket: ", sonuc.paket);
    })
    .catch((hata) => {
        console.log("❌ BİR SORUN OLUŞTU!");
        console.error("Hata Detayı: ", hata);
    })
        // finally her türlü çalışır
    .finally(() => { 
        console.log("🏁 Kargo takip işlemi sonlandı.");
    });

console.log("...Kod akışı devam ediyor (Bloklanmadı)...");

*/

/*

1. Pending (Bekliyor) Durumu

Bir Promise oluşturulduğu an, henüz sonuçlanmadığı 
(ne başarılı ne hatalı) o mikrosaniyelik veya saniyelik arada "Pending" durumundadır.

*/

/*

const islem = new Promise((resolve, reject) => {
    // İşlem başlatıldı ama henüz ne resolve ne de reject çağrıldı.
    // Simüle etmek için boş bırakıyorum veya uzun süren bir işlem varmış gibi düşün.
});

console.log(islem);

*/

/*

2. Resolved (Başarılı) Durumu
İşlem başarıyla tamamlandığında resolve() fonksiyonu tetiklenir.
 Bu, "Sözümü tuttum, al sana veri" demektir.

*/

/*

const basariliIslem = new Promise((resolve, reject) => {
    const veri = "Sunucudan gelen kullanıcı listesi";
    
    resolve(veri); // İşlem başarılı olduğu için resolve çağırıyoruz
});

// Promise'i tüketiyoruz (consuming) .then kullanarak
basariliIslem.then((gelenVeri) => {
    console.log("İşlem Başarılı:", gelenVeri);
});

*/

/*

3. Rejected (Hatalı/Reddedildi) Durumu
İşlem sırasında bir hata oluşursa reject() fonksiyonu tetiklenir.

*/

/*

const hataliIslem = new Promise((resolve, reject) => {
    const sunucuCoktu = true;

    if (sunucuCoktu) {
        // Hata olduğu için reject çağırıyoruz
        reject("HATA: Sunucu yanıt vermiyor (500 Internal Server Error)"); // 
    }
});

hataliIslem
    .then(() => {
        console.log("Burası asla çalışmaz.");
    })
    .catch((hataMesaji) => {
        console.error("Yakalanan Hata:", hataMesaji);
    });

*/

/*

4. Zamanlanmış İşlemler (Asenkron Simülasyonu)
Gerçek hayatta veritabanı sorguları anında olmaz,
belli bir süre (latency) alır. Bunu setTimeout ile simüle ederiz.

*/

/*

function veritabaniSorgusu() {
    return new Promise((resolve, reject) => {
        console.log("Sorgu gönderildi, bekleniyor...");

        // 2 saniye (2000ms) süren bir işlemi taklit ediyoruz
        setTimeout(() => {
            const veriGeldi = true;

            if (veriGeldi) {
                resolve({ id: 1, urun: "Laptop" });
            } else {
                reject("Veri bulunamadı.");
            }
        }, 2000);
    });
}

// Kullanımı
veritabaniSorgusu()
    .then((sonuc) => {
        console.log("Veri geldi:", sonuc); // 2 saniye sonra çalışır
    })
    .catch((hata) => {
        console.log(hata);
    });

*/

/*

5. Promise.all() Kullanımı
Birden fazla bağımsız işlemi paralel (aynı anda) başlatıp
hepsinin bitmesini beklemek için kullanılır.

*/

/*

// 3 farklı işlem tanımlayalım (Farklı sürelerde bitiyorlar)
const resimYukle = new Promise(resolve => setTimeout(() => resolve("Resim Yüklendi"), 1000));
const muzikYukle = new Promise(resolve => setTimeout(() => resolve("Müzik Yüklendi"), 3000));
const yaziYukle = new Promise(resolve => setTimeout(() => resolve("Yazı Yüklendi"), 500));

console.log("Tüm indirmeler başlatıldı...");

Promise.all([resimYukle, muzikYukle, yaziYukle])
    .then((sonuclar) => {
        // sonuclar bir DİZİ (Array) olarak döner
        console.log("Hepsi bitti! Sonuçlar:");
        console.log(sonuclar);
    })
    .catch((hata) => {
        console.log("İçlerinden biri bile hata verse burası çalışır:", hata);
    });

*/