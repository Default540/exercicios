//João Vitor Santos
//Luã
var array1 = [12, 34, 56, 12, 67]
var array2 = ['js', 'java', 'c#', 'python']

// Todas as funções devem ser implementadas sem efeitos colaterais, isto é,
// elas não devem modificar o array de entrada (não são in-place).

function first(a,b=1) {
    if (Array.isArray(a)) {
        
        var array = Array.from(a)
        var res = []
        
        if (array.length < b) b = array.length;
        

        for (let index = 0; index < b; index++) {
            res[index] = array[index]
        }

        if (res.length > 1) {
            return res
        }
        
        return res[0] || []    
    }
    
    return null
}

function last(a,b=1) {

    if (Array.isArray(a)) {
        
        var array = Array.from(a)
        var res = []

        for (let index = b; index > 0; index--) {

            res.push(array[array.length-index])
        }

        if (res.length > 1) {
            return res
        }
        
        return res[0] || []
        
    }

    return null
    
}

function tail(a) {
    if (Array.isArray(a)) {
        
        var array = Array.from(a)
        
        res = []
        for (let index = 1; index < array.length; index++) {
            res.push(array[index])
        }
        
        return res
    }
    return null
}

function without(a,b) {
    if (Array.isArray(a)) {
        
        var array = Array.from(a)
        var res = []
        
        for (let index = 0; index < array.length; index++) {
            if (array[index] != b) {
                res.push(array[index])
            }
            
        }

        return res
    }
    return null
}

function union(a = [],b = [],c = []) {
    if (Array.isArray(a) && Array.isArray(b) && Array.isArray(c)) {
        
        var res = Array.from(a)

        for (let index = 0; index < b.length; index++) {
            res.push(b[index])
        }
        for (let index = 0; index < c.length; index++) {
            res.push(c[index])
        }
        
        return unique(res)
    }

    return null
}

function unique(a) {
    
    var array = Array.from(a)
    var res = []
    
    for (let index = 0; index < array.length; index++) {
        var tem = false
        for (let i = 0; i < res.length; i++) {
            
            if (array[index] == res[i]) {
                tem = true
            }
            
        }
        if (!tem) {
            res.push(array[index])
        }
    }

    return res
}

function intersection(a,b) {

    var res = []
    
    for (let index = 0; index < a.length; index++) {
        if (inArray(b,a[index]) && !inArray(res,a[index])) {
            res.push(a[index])
        }
        
    }
    
    return res
}

function difference(a,b) {
    var res = []
    
    for (let index = 0; index < a.length; index++) {
        
        if (!inArray(b,a[index])) {
            res.push(a[index])
        }
        
    }


    if (res.length > 0) {
        return res
    }
    return []
}

function inArray(array, elemento) {
    
    var res = false
    for (let index = 0; index < array.length; index++) { 
        if (array[index] === elemento) {
            res = true
        }
        
    }

    return res

}

function zip(a,b=[],c=[]) {

    var res = []
    if (b.length == 0) {
        return [a]
    }

    for (let index = 0; index < a.length; index++) {
        if (c.length == a.length) {
            
            res.push([a[index],b[index],c[index]])
        }else{

            res.push([a[index],b[index]])
        }
    }
    
    return res
}

function compact(a) { 
    var res = []

    for (let index = 0; index < a.length; index++) {
        if (a[index] != null && a[index] != undefined && !Number.isNaN(a[index])) {
            res.push(a[index])   
        }
        
    }

    return res
}

function flatten(a, count=1, res = []) {

    var c = [count]
    for (let index = 0; index < a.length; index++) {
        if (!Array.isArray(a[index])) {
            res.push(a[index])
        }else {
            if (c[0] != 0) {
                c[0]--;
                flatten(a[index], c[0], res)
                c = [count]
            }else{
                res.push(a[index])
            }
        }
    }
    return res
}

function equals(a,b) { 

    if (a.length != b.length) return false
    var test1 = Array.from(a)
    var test2 = Array.from(b)
    test1 = flatten(test1,-1)
    test2 = flatten(test2,-1)

    for (let index = 0; index < a.length; index++) {
        if (test1[index] != test2[index]) {
            return false
        }
    }
    
    return true
}

console.log(first(array1)) // 12
console.log(first(array1, 3)) // [12, 34, 56]
console.log(first([], 3)) // []

console.log(last(array1)) // 67
console.log(last(array1, 3)) // [56, 12, 67]

console.log(tail(array1)) // [34, 56, 12, 67]
console.log(tail([])) // []

console.log(without(array1, 34)) // [12, 56, 12, 67]
console.log(without(array1, 12)) // [34, 56, 67]

console.log(union(array1, array2)) // [12, 34, 56, 67, 'js', 'java', 'c#', 'python']
console.log(union(array1, array2, [89, 34, 'ruby', 'js'])) // [12, 34, 56, 67, 'js', 'java', 'c#', 'python', 89, 'ruby']

console.log(unique(array1)) // [12, 34, 56, 67]
console.log(unique(['a', 'a', 'a'])) // ['a']
console.log(unique(['a', 'b', 'a', 'b'])) // ['a', 'b']

console.log(intersection(['a', 4, 'c', 8], [8, 'b', 'c', 34])) // ['c', 8]
console.log(intersection([8, 'a', 4, 'c', 8], [8, 'b', 'c', 34])) // [8, 'c']

console.log(difference(['a', 4, 'c', 8], [8, 'b', 'c', 34])) // ['a', 4 ]
console.log(difference([], array1)) // []
console.log(difference(array1, [])) // [12, 34, 56, 12, 67]
console.log(difference(array1, array2)) // [12, 34, 56, 12, 67]
console.log(difference(array1, [56, 67])) // [12, 34, 12]

console.log(zip([12, 45], [67, 90])) // [[12, 67], [45, 90]]
console.log(zip(array2, [67, 90, 52, 56])) // [['js', 67], ['java', 90], ['c#', 52], ['python', 56]]
console.log(zip(array2, [67, 90, 52, 56], ['brendan eich', 'james gosling', 'anders hejlsberg', 'guido van rossum']))
// [['js', 67, 'brendan eich'], ['java', 90, 'james gosling'], ['c#', 52, 'anders hejlsberg'], ['python', 56, 'guido van rossum']]
console.log(zip([12, 45, 89], [67, 90])) // [[12, 67], [45, 90], [89, undefined]]
console.log(zip([12, 45])) // [[12], [45]]

console.log(compact([45, 23])) // [45, 23]
console.log(compact([45, 23, null])) // [45, 23]
console.log(compact([NaN, 23, null, 12])) // [23, 12]
console.log(compact([NaN, 23, null, 12, undefined, 78])) // [23, 12, 78]
console.log(compact([NaN, 23, null, 12, undefined, 78, 0, false, ''])) // [23, 12, 78, 0, false, '']
console.log(compact(array1)) // [12, 34, 56, 12, 67]

var depth = 2 // profundidade
var nested = [34, 54, [45, 23, [78, 90, [65]]], 12]
console.log(flatten([34, 54, [45, 23], 12])) // [34, 54, 45, 23, 12]
console.log(flatten([34, 54, [45, 23], 12, [78, 90]])) // [34, 54, 45, 23, 12, 78, 90]
console.log(flatten([34, 54, [45, 23, [78, 90]], 12])) // [34, 54, 45, 23, [78, 90], 12]
console.log(flatten([34, 54, [45, 23, [78, 90]], 12], depth)) // [34, 54, 45, 23, 78, 90, 12]
console.log(flatten(nested, depth)) // [34, 54, 45, 23, 78, 90, [65], 12]
console.log(flatten(nested, 3)) // [34, 54, 45, 23, 78, 90, 65, 12]
console.log(flatten(array1)) // [12, 34, 56, 12, 67]

console.log(equals([1, 2, 3], [1, 2, 3])) // true
console.log(equals([1, 2, 3], [1, 3, 2])) // false
console.log(equals(array1, array2)) // false
console.log(equals([1, [2, 3], 4], [1, [2, 3], 4])) // true
console.log(equals([1, [2, 3], 4], [1, [3, 2], 4])) // false
console.log(equals(nested, nested)) // true
console.log(equals(nested, [34, 54, [45, 23, [78, 90, [65]]], 12])) // true
console.log(equals([34, 54, [45, 23, [78, 90, [65]]], 12], nested)) // true

console.log(array1) // [12, 34, 56, 12, 67]
console.log(array2) // ['js', 'java', 'c#', 'python']