function dobro(valor) {
    if (typeof(valor) === 'number') return valor * 2
    if (typeof(valor) === 'string') return valor + valor

    if (Array.isArray(valor)) { 
        var novo = Array.from(valor)
        for (let index = 0; index < novo.length; index++) {
            novo[index] = dobro(novo[index])
        }
        return novo
    }
}


console.log(dobro([33,5,2,"awd",[24,[12,"ggg"]]]))
