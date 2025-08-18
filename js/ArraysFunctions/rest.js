export function rest(array) {
    if (Array.isArray(array)) {
        let arr = Array.from(array);

        let res = []

        for (let index = 1; index < arr.length; index++) {
            res.push(arr[index])
        }
        return res;
    }

    throw "the element is not an array"
}