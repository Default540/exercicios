export function zip() {

    const length = arguments.length;;

    let arr = [];
    for (let index = 0; index < length; index++) {
        arr.push([])
    }

    for (let index = 0; index < arguments.length; index++) {

        if (!Array.isArray(arguments[index])) throw "Some element is not an array"

        if (length != arguments[index].length) {
            throw "arrays no valid length"
        }

        for (let i = 0; i < arguments[index].length; i++) {
            arr[i][index] = arguments[index][i]
        }

    }

    return arr;
}