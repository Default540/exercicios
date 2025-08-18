let a = {nome: "nome", fun: function(){
    return "sla";
}}

console.log(a.nome)

delete a.nome;

a.fun();

class TestOld {
    nome = "si"
    constructor(ad){
        this.nome = ad
    }
    funcao(){
        return 14
    }
}


class Test extends TestOld{
    
    sla = 13
    
    test = () => {
        return false
    }
}


let b = new Test("ohipo");
console.log(b.funcao())


/* array.forEach(element => {
    
});

for (const iterator of object) {
    
}
 */



let arr = [
        ()=>{ 
            return ()=>{
                        return () => {
                            return true
                        }
                    }   
        }
    ]


console.log(arr[0]()()())


let m = new Map()

m.set([214,42])

m.set([214,42])
m.set(4)

for (const e of m) {
    console.log(e)
}