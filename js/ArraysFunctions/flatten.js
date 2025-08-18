export function flatten(array, depth = 1, util = []) {
    if (Array.isArray(array)) {
        
        let arr = Array.from(array);
        
        let result = util;
        if (depth === -1) depth = Infinity;

        for (let index = 0; index < arr.length; index++) {
            
            if (Array.isArray(arr[index]) == false) {
          
                result.push(arr[index]);
            
            }else if(depth == -1 || depth > 0) {

                depth--;
                flatten(arr[index], depth, result)
                

            }else{
                result.push(arr[index]);
            }

        }

        return result;
    }

    throw "the element is not an array"
}