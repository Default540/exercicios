export function inArray(array, value) {
    if (Array.isArray(array)) {
        let inArray = false;

        for (let index = 0; index < array.length; index++) {
            
            if (array[index] === value) {
                inArray = true;
            }
            
        }
        
        return inArray;
    }

    throw "The first element is not an array"
}