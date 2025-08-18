import { inArray } from './inArray.js';
import { without } from './without.js';

export function difference(array) {

    if (!Array.isArray(array)) throw "Some element is not an array"

    let arr = Array.from(array);

    for (let index = 1; index < arguments.length; index++) {
        
        if (!Array.isArray(arguments[index])) throw "Some element is not an array"
        
        
        for (let i = 0; i < arguments[index].length; i++) {
            
            if (inArray(arr, arguments[index][i])){
                arr = without(arr, arguments[index][i]);
            }
        }

    }

    return arr
}