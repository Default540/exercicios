import "./uniq.js"

export function union(arr1, arr2) {
    if (Array.isArray(arr1) && Array.isArray(arr2)) {
        
        let arr = [];

        for (let index = 0; index < arr1.length; index++) {
            arr.push(arr1[index]);
        }
        for (let index = 0; index < arr2.length; index++) {
            arr.push(arr2[index]);
        }

        return uniq(arr);
    }

    throw "Some element of union is not an array"
}