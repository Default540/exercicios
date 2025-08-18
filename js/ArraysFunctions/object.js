export function object(arr1, arr2) {
    if (!Array.isArray(arr1) || !Array.isArray(arr2)) throw "Some element is not an array"
    if (arr1.length != arr2.length) throw "Arrays have different lengths"
    let obj = {};

    for (let index = 0; index < arr1.length; index++) {
        obj[arr1[index]] = arr2[index];
    }

    return obj
}