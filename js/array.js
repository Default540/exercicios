function ordenar(vet) { //copia o endereço da memoria
    if (vet.length != 2) throw 'O vetor deve ter 2 elementos'

    if (vet[0] > vet[1]) {
        let save = vet[0]
        vet[0] = vet[1] //troca o valor do heap
        vet[1] = save

        //return [vet[1], vet[0]]
    }

    //return vet //retorna a referencia
}

var test = [3, 2] //test é a referencia do valor no heap
ordenar(test) //envia a referencia

console.log(test) // [2,3]

// isso só ocorre nos dados dentro do heap (no stack ñ)