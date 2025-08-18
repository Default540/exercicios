export function initial(array) {
    if (Array.isArray(array)) {
        let arr = Array.from(array);
        let result = [];
        
        for (let index = 0; index < arr.length-1; index++) {
            result.push(arr[index]);
        }

        return result;
    }
    throw "The element is not an array"
}