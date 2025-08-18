package trabalho2.negocio;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;

public class Anotacao {

    private int id;
    private String Titulo; 
    private Timestamp dataHora;
    private String descricao;
    private Color cor;
    private byte foto[] = null;


    public int getId() {
        return id;
    }
    public String getTitulo() {
        return Titulo;
    }
    public Timestamp getDataHora() {
        return dataHora;
    }
    public String getDescricao() {
        return descricao;
    }
    public Color getCor() {
        return cor;
    }
    
    public int getRGBCor(){
        return getCor().getRGB();
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setCor(Color cor) {
        this.cor = cor;
    }
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    public void setFoto(String fotoPath) throws FileNotFoundException, IOException{
        File f = new File(fotoPath);
        FileInputStream fileInputStream = new FileInputStream(f);
        this.foto = fileInputStream.readAllBytes();
        fileInputStream.close();
    }
}