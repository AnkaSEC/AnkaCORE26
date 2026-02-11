/*
varible declaration -> değişken tanımlama
var
let
const

hiçbirinin tip belirleme özelliği yoktur
değişkenin nasıl davrandığını belirler


Naming:
    variable declaration yaparken "camelCase" kullanılır
    const için U"PPER_SNAKE_CASE" genellikle
*/

var variableOne= 2;
let variableTwo= "js";
const VARIABLETHREE= "4.1";

/* 
conosle.log(); -> console'a yazı yazdırmak için kullanılır
*/

// console.log("variableOne ->", variableOne);
// console.log("variableTwo ->", variableTwo);
// console.log("VARIABLETHREE ->", VARIABLETHREE);

/*
JavaScript dinamik tipli (dynamically typed) bir dildir
    Bu ne demek?
        Değişkenin tipi runtime’da (çalışma anında) belirlenir
        Aynı değişken farklı zamanlarda farklı tipte değer tutabilir

varible type:
x = 5;        // number
x = "merhaba";   // string
x = true;        // boolean

js de değişkenin değil, değerin tipi vardır
    Primitive (ilkel) tipler -> değer taşır -- bellekte değerin kendisini tutar, kopyalandıklarında tamamen yeni bir değer oluşur
        number     // 1, 3.14, NaN, Infinity -> 8 byte
        string     // "abc" -> her karakter 2 byte
        boolean    // true / false -> 1 byte
        undefined  // tanımlı ama değeri yok
        null       // bilinçli boş değer
    Reference (nesne) tipler -> adres taşır -- değişken, değerin kendisini değil bellekteki adresini tutar. Kopyalama yapıldığında adres kopyalanır, veri paylaşılır
        object
        array
        function
        date
*/

//re-declaration -> aynı isimle tekrar tanımlama

// var x = 10; 
// console.log("x ->", x); 
// var x = 20; 
// console.log("x ->", x); 

x=4;
// console.log("x ---->", x);

let y = 10;
//let y = 20; //
y= 5;
//console.log("y->", y);
//SyntaxError: yazım kurallarına uymadığını gösterir

/*
Scope Türleri -> bir değişkenin nereden erişilebilir olduğunu belirleyen görünürlük alanıdır
Global: Sayfanın her yerinden erişim
Function: Sadece o fonksiyona özel
Block: if, for gibi block yapıların içindeki dar alan
*/

if (true) {
  var functionScoped = "Ben function scoped'um";
  let blockScoped = "Ben block scoped'um";
  const alsoBlockScoped = "Ben de block scoped'um";
};

// console.log(functionScoped);
// console.log(blockScoped); //
// console.log(alsoBlockScoped); //

//ReferenceError -> erişmeye çalıştığın değişkeni tanımadığını gösterir, ya hiç tanımlanmamıştır yada scope dışında kalıyorudr

/*
hoisting -> kodu çalıştırmadan önce değişken ve fonksiyon tanımlarını bellek alanına almasıdır
var hoisting sırasında tanımlanır ve undefined atanır, bu yüzden tanımlanmadan önce erişilebilir gibi davranır
let ve const da hoist edilir ama erişime kapalıdır (TDZ)

Temporal Dead Zone (TDZ): let ve const tanımlanmadan önce onlara erişmeye çalışırsanız hata alırsınız. Bu, kod güvenliğini artırır.
TDZ -> değişkenin tanımlandığı satıra kadar olan süredir ve bu aralıkta değişkene erişim tamamen yasaktır.
*/

//console.log(a);
var a = 5;

//console.log(b);
let b = 10;

//hoistedFunction();

function hoistedFunction() {
  console.log("Fonksiyon hoist edildi");
}

arrowFunc();
const arrowFunc = () => {
  console.log("Arrow function hoist edilir mi?");
};

