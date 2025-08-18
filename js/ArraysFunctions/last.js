export function last(array) {
    if (Array.isArray(array)) {
        let arr = Array.from(array);
        if (arr.length === 0) return
        
        return arr[arr.length - 1]
    }

    throw "the element is not an array"
}