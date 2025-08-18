import { inArray } from "./inArray.js";

export function uniq(array) {
    if (Array.isArray(array)) {
        
        let arr = [];

        for (let index = 0; index < array.length; index++) {
            if (!inArray(arr,array[index])) {
                arr.push(array[index]);
            }
        }

        return arr;
    }

    throw "The element is not an array"

}