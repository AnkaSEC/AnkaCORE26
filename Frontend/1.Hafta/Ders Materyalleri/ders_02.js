/*
template literal -> string yazmayı daha esnek ve okunabilir hale getiren sözdizimidir
*/

const name = "Melike";
const age = 30;

// console.log("İsim:",name + ", " + "Yaş:",age);
// console.log('İsim:',name + ', ' + 'Yaş:',age);
// console.log(`İsim: ${name}, Yaş: ${age}`);

//console.log(`İsim: ${name}\nYaş: ${age}`);
const message = `
Kullanıcı Bilgileri
-------------------
İsim: ${name}
Yaş: ${age}
`;
//console.log(message);

/*
escape sequences (kaçış dizileri):
    Code	Output
    \'	    single quote
    \"	    double quote
    \\	    backslash
    \n	    newline
    \t	    tab
    \r	    carriage return
    \b	    backspace
*/

// console.log("örnek 'olarak'");
// console.log('örnek \'olarak\'');
// console.log('\\ -> örnek \\olarak');
// console.log("\t -> örnek \tolarak");
// console.log(" -> örnek \rolarak");
// console.log(" -> örnek \bolarak");

/*
string methodları:
*/
let str = "  Bugün hava kar yağışlı olarak görünüyor  ";

console.log("ORİJİNAL:", `"${str}"`); 
console.log("------------------------------------------------");

console.log("length:", str.length); // 43

console.log("str[0]:", `"${str[0]}"`); // " "
console.log("at(-1):", `"${str.at(-1)}"`); // " "

console.log("toUpperCase:", str.toUpperCase()); //   BUGÜN HAVA KAR YAĞIŞLI OLARAK GÖRÜNÜYOR  
console.log("toLowerCase:", str.toLowerCase()); //   bugün hava kar yağışlı olarak görünüyor  
console.log("toLocaleUpperCase(tr):", str.toLocaleUpperCase("tr")); //   BUGÜN HAVA KAR YAĞIŞLI OLARAK GÖRÜNÜYOR  
console.log("toLocaleLowerCase(tr):", str.toLocaleLowerCase("tr")); //   bugün hava kar yağışlı olarak görünüyor  

console.log("slice(2,13):", str.slice(2, 13)); // Bugün hava
console.log("substring(2,13):", str.substring(2, 13)); // Bugün hava

console.log("split(' '):", str.split(" ")); // ["", "", "Bugün", "hava", "kar", "yağışlı", "olarak", "görünüyor", "", ""]

console.log("includes('kar'):", str.includes("kar")); // true
console.log("startsWith('  Bugün'):", str.startsWith("  Bugün")); // true
console.log("endsWith('  '):", str.endsWith("  ")); // true

console.log("indexOf('a'):", str.indexOf("a")); // 8
console.log("lastIndexOf('a'):", str.lastIndexOf("a")); // 27

console.log("replace('kar','güneşli'):", str.replace("kar", "güneşli")); //   Bugün hava güneşli yağışlı olarak görünüyor  
console.log("replaceAll(' ','-'):", str.replaceAll(" ", "-")); // --Bugün-hava-kar-yağışlı-olarak-görünüyor--

console.log("trim():", `"${str.trim()}"`); // "Bugün hava kar yağışlı olarak görünüyor"
console.log("trimStart():", `"${str.trimStart()}"`); // "Bugün hava kar yağışlı olarak görünüyor  "
console.log("trimEnd():", `"${str.trimEnd()}"`); // "  Bugün hava kar yağışlı olarak görünüyor"

console.log("concat('!!!'):", str.concat("!!!")); //   Bugün hava kar yağışlı olarak görünüyor  !!!

console.log("repeat(2):", str.repeat(2)); //   Bugün hava kar yağışlı olarak görünüyor    Bugün hava kar yağışlı olarak görünüyor  

console.log("padStart(50,'*'):", str.padStart(50, "*")); // ***  Bugün hava kar yağışlı olarak görünüyor  
console.log("padEnd(50,'*'):", str.padEnd(50, "*")); //   Bugün hava kar yağışlı olarak görünüyor  ***

console.log("charAt(2):", str.charAt(2)); // B
console.log("charCodeAt(2):", str.charCodeAt(2)); // 66

console.log("String.fromCharCode(66):", String.fromCharCode(66)); // B

console.log("valueOf():", str.valueOf()); //   Bugün hava kar yağışlı olarak görünüyor  

console.log("------------------------------------------------");
console.log("String'ler immutable'dır → str hiçbir yerde değişmedi."); // true

