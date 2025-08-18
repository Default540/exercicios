var s = "modular"

console.log(s.charAt(4)) // 'l'

console.log(s.charCodeAt(3)) //117 //ASCII UTF-8 //128 Caracteres 
console.log(String.fromCharCode(80+12))  // '\'


var x = "abc"
var y = "def"
var z = x+y

var q = x.concat(y)

console.log(z === q) //true


var t = ["a","b","c"]
var v = ["d","e","f"]
var p = t+v; //'a,b,cd,e,f' //que praga é essa?

