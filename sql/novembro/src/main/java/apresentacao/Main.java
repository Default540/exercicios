/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import negocio.Funcionario;
import negocio.Gerente;
import negocio.Usuario;
import negocio.Veiculo;
import persistencia.ConexaoPostgreSQL;
import persistencia.VeiculoDAO;

/**
 *
 * @author iapereira
 */
public class Main {
    
    public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {

        //JFrame jFrame = new JFrame();
        //jFrame.setLayout(new FlowLayout());
        //jFrame.setSize(500, 400);
        
        //JLabel jLabel = new JLabel(new ImageIcon(veiculo.getFoto()));
        //jFrame.add(jLabel);
        
        //jFrame.setVisible(true);
        //jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        VeiculoDAO veiculoDAO = new VeiculoDAO();
        
        Scanner s = new Scanner(System.in);

        ConexaoPostgreSQL.username = "postgres";
        ConexaoPostgreSQL.password = "postgres";

        while (true) {

            Usuario user = null;

            while (user == null) {
                System.out.println("Escolha o usuario:");
                System.out.println("1: Gerente");
                System.out.println("2: Funcionario");
                System.out.println("3: Cliente");

                int opUs = s.nextInt();

                if (opUs == 1) {
                    user = new Usuario();
                }else if (opUs == 2) {
                    user = new Funcionario();
                }else if (opUs == 3) {
                    user = new Gerente();
                }

            }


            System.out.println("Escolha uma opção: ");

            System.out.println("1: inserir");
            System.out.println("2: deletar");
            System.out.println("3: atualizar");
            System.out.println("4: listar");
            System.out.println("5: sair");

            int opção = s.nextInt();

            if (opção == 1) {
                System.out.println("Qual o ano?");
                int ano = s.nextInt();
                System.out.println("Qual a placa?");
                String placa = s.next();
                System.out.println("Qual o local da foto? 0 == carro.webp");
                String pathFoto = s.next();
                if (pathFoto.equals("0")) {
                    pathFoto = new File(".").getCanonicalPath() + "/src/main/java/imagens/carro.webp";
                }

                Veiculo v = new Veiculo();
                v.setAno(ano);
                v.setPlaca(placa);

                FileInputStream fotoIS = new FileInputStream(new File(pathFoto));
    
                byte[] fotoByte = fotoIS.readAllBytes();
                
                v.setFoto(fotoByte);

                veiculoDAO.inserir(v);
            }else if (opção == 2) {
                System.out.println("Qual Lineo id do veiculo que voce quer deletar?");
                int id = s.nextInt();

                veiculoDAO.deletar(id);
            }else if (opção == 3) {
                
                System.out.println("Qual o id do veiculo que voce quer atualizar?");
                int id = s.nextInt();

                System.out.println("Qual o ano?");
                int ano = s.nextInt();
                System.out.println("Qual a placa?");
                String placa = s.next();
                System.out.println("Qual o local da foto? 0 == carro.webp");
                String pathFoto = s.next();

                if (pathFoto.equals("0")) {
                    pathFoto = new File(".").getCanonicalPath() + "/src/main/java/imagens/carro.webp";
                }

                Veiculo v = new Veiculo();
                v.setId(id);
                v.setAno(ano);
                v.setPlaca(placa);

                FileInputStream fotoIS = new FileInputStream(new File(pathFoto));
    
                byte[] fotoByte = fotoIS.readAllBytes();
                
                v.setFoto(fotoByte);

                veiculoDAO.atualizar(v);
            }else if (opção == 4) {
                ArrayList<Veiculo> veiculos = veiculoDAO.listar();
    
                for (int i = 0; i < veiculos.size(); i++) {
        
                    System.out.println(veiculos.get(i));
                }
            }else if (opção == 5) {
                break;
            }else{
                System.out.println("Opcão invalida");
            }

            
        }


        s.close();

        
        
    }
    
}
