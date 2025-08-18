package Banco;

import java.time.LocalDate;

public class Transacao {
    public LocalDate data;
    private float valor;
    public String tipo;

    public float getValor(){
        return this.valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
}
