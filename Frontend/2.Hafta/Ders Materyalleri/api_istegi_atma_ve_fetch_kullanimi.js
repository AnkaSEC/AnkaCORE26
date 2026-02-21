/*

GET İsteği (Veri Çekme)
Tarayıcının adres çubuğuna bir URL yazıp Enter'a bastığında aslında bir GET isteği yaparsın.

Amaç: Sunucudan veri okumak/almak.

Özellik: Veri taşınmaz (body yoktur), parametreler URL içinde gönderilir (örn: ?id=5).

Güvenlik: URL geçmişinde görünür, şifre göndermek için uygun değildir.

-----------------------------------------------------------------------------

// async fonksiyon tanımlıyoruz çünkü await kullanacağız
async function kullaniciGetir() {
    try {
        console.log("1. İstek atılıyor...");
        
        // 1. AŞAMA: Sunucuya bağlan (Response Header gelir)
        const cevap = await fetch('https://jsonplaceholder.typicode.com/users/1');
        
        // Bu noktada 'cevap' sadece bağlantı bilgisidir, veri değil!
        console.log("2. Bağlantı başarılı, durumu:", cevap.status); // 200 OK

        // 2. AŞAMA: Gelen akışı (stream) JSON'a çevir ve bekle
        const veri = await cevap.json();

        console.log("3. Veri işlendi:", veri.name); // "Leanne Graham"
    } catch (hata) {
        console.error("Bir sorun oluştu:", hata);
    }
}

kullaniciGetir();

-------------------------------------------------------------------------------------

POST İsteği (Veri Gönderme)
Bir kayıt formu doldurup "Kaydol" dediğinde genellikle POST isteği yaparsın.

Amaç: Sunucuya yeni veri eklemek veya var olanı değiştirmek.

Özellik: Veriler URL'de değil, Request Body (İstek Gövdesi) içinde gizli gider.

Header (Başlık): Sunucuya "Sana JSON formatında veri yolluyorum, ona göre oku" demek için Content-Type: application/json başlığı eklenir.

--------------------------------------------------------------------------------------

async function gonderiPaylas() {
    const yeniGonderi = {
        title: 'JavaScript Öğreniyorum',
        body: 'Fetch API ve JSON konuları harika!',
        userId: 1
    };

    try {
        const cevap = await fetch('https://jsonplaceholder.typicode.com/posts', {
            method: 'POST', // Metodu belirtiyoruz
            headers: {
                'Content-Type': 'application/json' // "Sana JSON yolluyorum" diyoruz
            },
            // JavaScript Objesini -> JSON String'ine çevirip yolluyoruz
            body: JSON.stringify(yeniGonderi) 
        });

        const sonuc = await cevap.json();
        console.log("Sunucudan gelen cevap:", sonuc);
        // Genelde sunucu, kaydettiği veriyi ID ekleyerek geri döner.
    } catch (hata) {
        console.error("Gönderilemedi:", hata);
    }
}

gonderiPaylas();

--------------------------------------------------------------------------------------

İlk Promise (Fetch): Sunucuya bağlanılır ve sunucu "Tamam, isteğini aldım (Status 200)" der. Bu noktada sadece HTTP Başlıkları (Headers) elimize ulaşır. Gövde (Body) hala internet kablolarından akıyor olabilir.

Fetch	Sunucuya istek atar, Response nesnesi döner. (Promise)

JSON.stringify()	JS Objesini → String'e çevirir. (Sunucuya gönderirken)

.json()	Gelen String akışını → JS Objesine çevirir. (Promise)

Headers	Mektubun zarfı gibidir. İçeriğin türünü, yetki bilgisini taşır.

Body	Mektubun kendisidir. Asıl veri burada taşınır.















*/