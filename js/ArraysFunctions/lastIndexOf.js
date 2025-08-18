export function lastIndexOf(array, value, fromIndex = 0) {
    if (Array.isArray(array) && typeof(fromIndex) === "number" && !isNaN(fromIndex))  {
        let res = -1;
        
        for (let i = fromIndex; i < array.length; i++) {
            if (array[i] === value) {
                res = i;
            }
        }    
        return res;
    }

    throw "The first elemento is not an array"
}