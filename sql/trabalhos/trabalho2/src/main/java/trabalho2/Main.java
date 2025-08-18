package trabalho2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import trabalho2.negocio.Anotacao;
import trabalho2.negocio.Display;
import trabalho2.perstencia.AnotacaoDAO;

public class Main {
    public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {

        AnotacaoDAO anDAO = new AnotacaoDAO();

        while (true) {

            System.out.println("Escolha entre as opções:");
            System.out.println("1: Criar anotação");
            System.out.println("2: Ver todas as anotações");
            System.out.println("3: Atualizar anotação");
            System.out.println("4: Deletar anotação");
            System.out.println("5: Criar uma copia");
            System.out.println("6: Sair");

            Scanner s = new Scanner(System.in);

            int option = s.nextInt();

            if (option == 1) {

                Anotacao anotacao = new Anotacao();

                System.out.println("Coloque o titulo:");

                anotacao.setTitulo(s.next());

                System.out.println("Coloque a descrição:");

                anotacao.setDescricao(s.next());

                System.out.println("Quer colocar uma cor? (opcional)");

                boolean cor = s.nextBoolean();

                if (cor) {
                    anotacao.setCor(Display.setColor());
                } else {
                    anotacao.setCor(new Color(255, 255, 255));
                }

                System.out.println("Quer colocar uma foto? (opcional)");

                boolean foto = s.nextBoolean();
                s.nextLine();

                if (foto) {

                    anotacao.setFoto(Display.setFotoPath());
                }

                anDAO.create(anotacao);

            } else if (option == 2) {


                for (Anotacao an : anDAO.read()) {
                    Display.showDisplay(an);
                }

            } else if (option == 3) {
                System.out.println("Qual o id da anotação?");
                int id = s.nextInt();

                Anotacao anotacao = anDAO.read(id);

                System.out.println("Quer trocar o titulo?");
                boolean titulo = s.nextBoolean();

                if (titulo) {
                    System.out.println("Coloque o titulo:");
                    anotacao.setTitulo(s.next());
                }

                System.out.println("Quer trocar a descrição?");
                boolean descricao = s.nextBoolean();

                if (descricao) {

                    System.out.println("Coloque a descrição:");

                    anotacao.setDescricao(s.next());
                }

                System.out.println("Quer colocar uma cor?");

                boolean cor = s.nextBoolean();

                if (cor) {
                    
                    anotacao.setCor(Display.setColor());
                }

                System.out.println("Quer colocar uma foto?");

                boolean foto = s.nextBoolean();

                if (foto) {
                    anotacao.setFoto(Display.setFotoPath());
                }

                anDAO.update(anotacao);
            } else if (option == 4) {
                System.out.println("Qual o id da anotação?");
                int id = s.nextInt();

                anDAO.delete(id);
            } else if (option == 5) {
                System.out.println("Qual o id da anotação?");
                int id = s.nextInt();

                Anotacao anotacao = anDAO.read(id);

                anDAO.create(anotacao);
            } else if (option == 6) {
                s.close();
                System.exit(0);
                break;
            }
        }
    }
}