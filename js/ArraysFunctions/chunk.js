export function chunk(array, length) {
    let result = []
    let arr = []
    let count = 0;
    
    for (let index = 0; index < array.length; index++) {
        
        arr.push(array[index])
        count++;
        
        if (count == length) {
            count = 0
            result.push(arr)
            arr = []
        }

        if ((index+1) == array.length && arr.length > 0) {
            result.push(arr)
        }
    }

    return result;
}