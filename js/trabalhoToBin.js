// numero positivo inteiro

function toBin(n) {

    if (typeof(n) != "number" || isNaN(n)) return null
    if (n < 0) return null
    if (n == 0) return String(n);

    let binary = '';

    while(n > 0) {
        binary = (n % 2) + binary;
        n = (n/2) | 0
    }

    return binary
}

function toOct(n) {

    if (typeof (n) != "number" || isNaN(n)) return null
    if (n < 0) return null
    if (n == 0) return String(n);

    let oct = '';

    while (n > 0) {
        oct = (n % 8) + oct;
        n = (n / 8) | 0
    }

    return oct
}

function toHex(n) {
    if (typeof (n) != "number" || isNaN(n)) return null
    if (n < 0) return null
    if (n == 0) return String(n);

    let hex = '';

    while (n > 0) {
        let p = (n % 16);
        
        if (p > 9) {
            if (p == 10) {
                p = 'A'
            } else if (p == 11) {
                p = 'B'
            } else if (p == 12) {
                p = 'C'
            } else if (p == 13) {
                p = 'D'
            } else if (p == 14) {
                p = 'E'
            } else if (p == 15) {
                p = 'F'
            }
        }

        hex = p + hex;
        n = (n / 16) | 0
    }

    return hex
}

function toAlphaNumerico(n) { //36
    if (typeof (n) != "number" || isNaN(n)) return null
    if (n < 0) return null
    if (n == 0) return String(n);

    let apNum = '';

    while (n > 0) {
        let p = (n % 36);

        if (p > 9) {
            if (p == 10) {
                p = 'A'
            } else if (p == 11) {
                p = 'B'
            } else if (p == 12) {
                p = 'C'
            } else if (p == 13) {
                p = 'D'
            } else if (p == 14) {
                p = 'E'
            } else if (p == 15) {
                p = 'F'
            } else if (p == 16) {
                p = 'G'
            } else if (p == 17) {
                p = 'H'
            } else if (p == 18) {
                p = 'I'
            } else if (p == 19) {
                p = 'J'
            } else if (p == 20) {
                p = 'K'
            } else if (p == 21) {
                p = 'L'
            } else if (p == 22) {
                p = 'M'
            } else if (p == 23) {
                p = 'N'
            } else if (p == 24) {
                p = 'O'
            } else if (p == 25) {
                p = 'P'
            } else if (p == 26) {
                p = 'Q'
            } else if (p == 27) {
                p = 'R'
            } else if (p == 28) {
                p = 'S'
            } else if (p == 29) {
                p = 'T'
            } else if (p == 30) {
                p = 'U'
            } else if (p == 31) {
                p = 'V'
            } else if (p == 32) {
                p = 'W'
            } else if (p == 33) {
                p = 'X'
            } else if (p == 34) {
                p = 'Y'
            } else if (p == 35) {
                p = 'Z'
            }
        }

        apNum = p + apNum;
        n = (n / 36) | 0
    }

    return apNum
}

resultado = toBin(124)
resultado = toOct(18)
resultado = toHex(64)
resultado = toAlphaNumerico(3656838538357)
console.log(resultado)