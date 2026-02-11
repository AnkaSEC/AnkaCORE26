/*
destructuring -> object veya array’in içindeki değerleri tek tek çıkarmanın kısa ve temiz yoludur
destructuring = parçala, al, kullan
*/

// object destructuring
const user = {
  id: 1,
  user_name: "Melike",
  profile: {
    city: "Gaziantep",
    country: "TR",
  },
};

//console.log(user.user_name, user.profile.city);

const { user_name, id } = user;
//console.log(user_name, id);

// nested destructuring
const { profile: { city, country },} = user;
//console.log(city, country);


// array destructuring
const colors = ["red", "green", "blue", "yellow"];

const [first, , third] = colors;
console.log(first, third);
