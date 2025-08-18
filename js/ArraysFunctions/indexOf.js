export function indexOf(array,value) {
    if (Array.isArray(array)) {
        
        let result = -1;
        for (let index = 0; index < array.length; index++) {
            if (array[index] === value) {
                result = index;
            }
            
        }
        return result;
    }

    throw "The first argument is not an array"
}