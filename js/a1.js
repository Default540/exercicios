b1 = 2
e1 = 8

//console.log(Math.pow(b1,e1))

/* 
var a = 1 //funçao
let c = 1 //escopo {}
b = 4     //global
*/

//console.log([1,2] == "1,2")



/*
    comentar
*/

// comentar

/**
 * documentar
 * 
 * @param n numero
 * 
 * @returns numero positivo
 * 
 * 
 */
//sempre em cima da função
function abs(n) {
    return n < 0 ? n * -1: n;    
}

/**
 * 
 * @param {*} value valor 
 * @returns retorna verdadeiro se o valor não for null, undefined ou NaN
 */
function hasValue(value) {
    return value != null && value != undefined && !isNaN(value)
}
/**
 * 
 * @param {*} b base
 * @param {*} e expoente
 * @returns base elevada ao expoente
 * @throws exceção quando expoente decimal
 */
function pow(b,e = 1) {

    if (b === undefined || e === undefined) return undefined;
    if (b === null || e === null) return null;
    if (b === NaN || e === NaN) return NaN;

    if (typeof(b) != 'number' || typeof(e) != 'number') return NaN;
    

    if (e == 0 || b == 1) return 1

    if (e % 1 != 0) throw 'expoente decimal'  //lançar exessao e para o script
    
    let res = 1

    for (let index = 0; index < abs(e); index++) {
        res *= b;
    }

    /* if (e < 0) return 1 / res
    else return res */
    
    return e < 0? 1/res:res
    
    console.log("no exc")
}



try {
    console.log(pow(4,2.5))
    
} catch (error) {
    console.log(error)
}



/* console.log(pow(b1,e1))
console.log(pow(5,6))


console.log(6.225267453 | 0) //6

console.assert(pow(5,6) == 15625) //test

console.log(pow(4,0))

//console.log(pow(14,2.1))

console.log(pow(4,-7)) */

