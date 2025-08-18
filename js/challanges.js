function numberReverse(number) {
    let nstr = number.toString();;
    let res = "";

    for (let i = nstr.length-1; i >= 0; i--) {
        res += nstr[i];    
    }

    return res;
}

console.log(numberReverse(4330458))