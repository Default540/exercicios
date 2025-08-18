package trabalho2.perstencia;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import trabalho2.negocio.Anotacao;
import trabalho2.negocio.Display;


public class AnotacaoDAO {

    public void create(Anotacao a) throws SQLException {
        String sql = "INSERT INTO anotacao(titulo, descricao, cor, foto) VALUES (?, ?, ?, ?);";
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, a.getTitulo());
        preparedStatement.setString(2, a.getDescricao());
        preparedStatement.setInt(3, a.getRGBCor());
        preparedStatement.setBytes(4, a.getFoto());

        preparedStatement.executeUpdate();

        conexao.close();
    }

    public ArrayList<Anotacao> read() throws SQLException {
        ArrayList<Anotacao> ant = new ArrayList<>();

        String sql = "SELECT * FROM anotacao ORDER BY dataHora DESC";

        Connection conexao = new ConexaoPostgreSQL().getConexao();

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);

        ResultSet rs = preparedStatement.executeQuery();


        while (rs.next()) {
            Anotacao a = new Anotacao();
            a.setId(rs.getInt("id"));
            a.setTitulo(rs.getString("titulo"));
            a.setDescricao(rs.getString("descricao"));
            a.setDataHora(rs.getTimestamp("dataHora"));
            a.setCor(new Color(rs.getInt("cor")));
            a.setFoto(rs.getBytes("foto"));

            ant.add(a);
        }

        conexao.close();
        return ant;
    }

    public Anotacao read(int id) throws SQLException {

        String sql = "SELECT * FROM anotacao WHERE id = "+id+";";

        Connection conexao = new ConexaoPostgreSQL().getConexao();

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);

        ResultSet rs = preparedStatement.executeQuery();


        Anotacao a = new Anotacao();
        while (rs.next()) {
            a.setId(rs.getInt("id"));
            a.setTitulo(rs.getString("titulo"));
            a.setDescricao(rs.getString("descricao"));
            a.setDataHora(rs.getTimestamp("dataHora"));
            a.setCor(new Color(rs.getInt("cor")));
            a.setFoto(rs.getBytes("foto"));
        }

        conexao.close();
        return a;
    }

    public void update(Anotacao a) throws SQLException {
        String sql = "UPDATE anotacao set titulo = ?, descricao = ?, cor = ?, foto = ? WHERE id = ?;";

        Connection conexao = new ConexaoPostgreSQL().getConexao();
        
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, a.getTitulo());
        preparedStatement.setString(2, a.getDescricao());
        preparedStatement.setInt(3, a.getRGBCor());
        preparedStatement.setBytes(4, a.getFoto());
        preparedStatement.setInt(5, a.getId());

        preparedStatement.executeUpdate();
        conexao.close();
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM anotacao WHERE id = ?;";
        
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, id);

        preparedStatement.executeUpdate();
        conexao.close();
    }
}
