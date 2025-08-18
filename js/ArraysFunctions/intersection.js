import { inArray } from "./inArray.js";
import { without } from "./without.js";
import { uniq } from "./uniq.js";

export function intersection(){

    let arr = [];
    for (let index = 0; index < arguments.length; index++) {
        
        if (!Array.isArray(arguments[index])) throw "Some element is not an array"
        
        for (let i = 0; i < arguments[index].length; i++) {
            arr.push(arguments[index][i]);
        }
    }


    for (let index = 0; index < arguments.length; index++) {
        for (let i = 0; i < arr.length; i++) {
            if (!inArray(arguments[index], arr[i])) {
                arr = without(arr, arr[i]);
            }
            
        }
    }

    return uniq(arr);

}