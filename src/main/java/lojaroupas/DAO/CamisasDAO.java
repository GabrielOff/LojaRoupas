/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaroupas.DAO;

import connection.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import lojaroupas.model.Camisas;

/**
 *
 * @author OffSys
 */
public class CamisasDAO {

    public static List<Camisas> listagemCamisas(String marca) throws SQLException {
        List<Camisas> camisas = new ArrayList<>();
        String sql = "SELECT * FROM Camisas WHERE Marca LIKE ?";

        try (Connection connection = connectionFactory.getConnection(); PreparedStatement instrucaoSQL = connection.prepareStatement(sql)) {

            instrucaoSQL.setString(1, marca + "%");
            ResultSet rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Camisas c = new Camisas();
                c.setIdCamisa(rs.getInt("ID"));
                c.setFabricante(rs.getString("Fabricante"));
                c.setTamanho(rs.getString("Tamanho"));
                c.setCor(rs.getString("Cor"));
                c.setPreco(rs.getDouble("Preco"));
                c.setMarca(rs.getString("Marca"));
                camisas.add(c);
            }
        }

        return camisas;
    }

    public static void adcionarCamisas(Camisas camisas) throws SQLException {
        String sql = "INSERT INTO Camisas (Cor, Tamanho, Marca, Preco, Fabricante) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = connectionFactory.getConnection(); PreparedStatement instrucaoSQL = connection.prepareStatement(sql)) {

            instrucaoSQL.setString(1, camisas.getCor());
            instrucaoSQL.setString(2, camisas.getTamanho());
            instrucaoSQL.setString(3, camisas.getMarca());
            instrucaoSQL.setDouble(4, camisas.getPreco());
            instrucaoSQL.setString(5, camisas.getFabricante());

            int numLinhas = instrucaoSQL.executeUpdate();

            if (numLinhas > 0) {
                JOptionPane.showMessageDialog(null, "Cadastro Realizado");
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro Não Realizado", "title", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static boolean excluirCamisas(int id) throws SQLException {
        boolean booleanExclusao = false;
        String sql = "DELETE FROM Camisas WHERE ID = ?";

        try (Connection connection = connectionFactory.getConnection(); PreparedStatement instrucaoSQL = connection.prepareStatement(sql)) {

            instrucaoSQL.setInt(1, id);
            int numLinhas = instrucaoSQL.executeUpdate();

            if (numLinhas > 0) {

            } else {
                booleanExclusao = true;
                JOptionPane.showMessageDialog(null, "Erro ao excluir");
            }
        }

        return booleanExclusao;
    }

    public static void atualizarCamisas(Camisas c) throws SQLException {
        String sql = "UPDATE camisas SET Cor = ?, Tamanho = ?, Marca = ?, Preco = ? WHERE ID = ?";

        try (Connection connection = connectionFactory.getConnection(); PreparedStatement instrucaoSQL = connection.prepareStatement(sql)) {

            instrucaoSQL.setString(1, c.getCor());
            instrucaoSQL.setString(2, c.getTamanho());
            instrucaoSQL.setString(3, c.getMarca());
            instrucaoSQL.setDouble(4, c.getPreco());
            instrucaoSQL.setInt(5, c.getIdCamisa());

            int numLinhas = instrucaoSQL.executeUpdate();
            if (numLinhas > 0) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado!");
            }
        }
    }

}
