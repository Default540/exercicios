export function first(array) {

    if (Array.isArray(array)) {

        let arr = Array.from(array)

        if (arr.length === 0) return
        
        return arr[0];
    }
    
    throw "The element is not an array"
}