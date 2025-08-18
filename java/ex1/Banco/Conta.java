package Banco;

import java.time.LocalDate;
import java.util.ArrayList;

public class Conta {
    private int numero;
    private Cliente cliente;
    private String tipo;
    private ArrayList<Transacao> transacoes = new ArrayList<Transacao>();

    Conta(Cliente c){
        this.numero = 12345;
        this.cliente = c;
        this.tipo = "corrente";    
    }

    public float saldo(){
        float saldo = 0;
        for (Transacao transacao : this.transacoes) {

            if (transacao.tipo == "credito") {
                
                saldo += transacao.getValor();
            }else{
                saldo -= transacao.getValor();
            }
        }
        return saldo;
    }

    public ArrayList<Transacao> historico(){
        return this.transacoes;
    }

    public void transferir(Conta c, float valor){
        if (valor <= saldo()) {
            Transacao t = new Transacao();
            t.data = LocalDate.now();
            t.tipo = "debito";
            t.setValor(valor);
            this.transacoes.add(t);
    
    
            Transacao newt = new Transacao();
            newt.data = LocalDate.now();
            newt.tipo = "credito";
            newt.setValor(valor);
            c.transacoes.add(newt);
        }
    }

    public void sacar(float valor){
        if (valor <= saldo()) {
            Transacao t = new Transacao();
            t.data = LocalDate.now();
            t.tipo = "debito";
            t.setValor(valor);
    
            this.transacoes.add(t);
        }
    }

    public void depositar(float valor){
        Transacao t = new Transacao();
        t.data = LocalDate.now();
        t.tipo = "credito";
        t.setValor(valor);

        this.transacoes.add(t);
    }



    public String toString(){
        return this.cliente.getNome() + " - " + this.tipo + " - " + this.numero;
    }
}
