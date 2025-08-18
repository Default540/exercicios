function abs(n: number | null): number | undefined {
    if(n == null) n = 0;
    return n > 0? n : n * -1;
}

console.log(abs(-4))
