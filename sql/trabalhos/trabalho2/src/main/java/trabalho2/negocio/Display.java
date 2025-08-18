package trabalho2.negocio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Display {

    public static String setFotoPath() {

        JFrame jFrame = new JFrame();

        jFrame.setVisible(true);

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(jFrame);

        jFrame.dispose();
        if (result == JFileChooser.APPROVE_OPTION) {

            File selectedFile = fileChooser.getSelectedFile();

            return selectedFile.getAbsolutePath();
        } else {
            return null;
        }
    }

    public static void showDisplay(Anotacao anotacao) {

        Dimension size = new Dimension(400, 500);

     
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new BorderLayout());
        jFrame.setSize(size);
        jFrame.setVisible(true);
        jFrame.getContentPane().setBackground(anotacao.getCor());


        
      
        if (anotacao.getFoto() != null) {
            Image img = new ImageIcon(anotacao.getFoto()).getImage();
            size = new Dimension(img.getWidth(null), img.getHeight(null));
            jFrame.setSize(size);

            JLabel jLabel = new JLabel(new ImageIcon(anotacao.getFoto()));
            jLabel.setLayout(new FlowLayout());
            jFrame.add(jLabel, BorderLayout.CENTER);


        }


        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS)); 
        painel.setBackground(anotacao.getCor());


        JLabel titulo = new JLabel("<html>" + anotacao.getTitulo() + "<br><br><br></html>", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));

        
        JLabel descricao = new JLabel("<html>" + anotacao.getDescricao() + "</html>", SwingConstants.LEFT);
        descricao.setFont(new Font("Arial", Font.ITALIC, 14));

       
        painel.add(titulo);
        painel.add(descricao);

       
        if (anotacao.getFoto() == null) {
            jFrame.add(painel, BorderLayout.NORTH);
        }else{

            jFrame.add(painel, BorderLayout.SOUTH);
        }


        

        jFrame.revalidate();
    }

    

    public static Color setColor(){
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);

        Color result = JColorChooser.showDialog(jFrame, "Escolha uma cor", new Color(0));

        jFrame.dispose();
        

        return result;
    }

}