export function without(array, element) {
    if (Array.isArray(array)) {
        let arr = [];

        for (let index = 0; index < array.length; index++) {
            if (array[index] !== element) {
                arr.push(array[index]);
            }
        }
        return arr;
    }

    throw "The element is not an array"
}
