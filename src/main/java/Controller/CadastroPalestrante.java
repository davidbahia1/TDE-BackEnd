/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BD.BDconnector;
import Model.Palestra;
import Model.Usuario;
import java.lang.ModuleLayer.Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class CadastroPalestrante {

    public void CadastraPalestrante(Palestra palestrante, Usuario Usuarios) throws SQLException {

        BDconnector conexao = new BDconnector();
        PreparedStatement st = null;

        try {
            Connection conn = BD.BDconnector.getConnection();

            st = conn.prepareStatement(
                    "INSERT INTO CadastroUsuario"
                    + "(NomePalestra,CurriculoPalestrante,Email,Senha,Cpf)"
                    + "VALUES"
                    + " ?,?,?,?,?"
            );

            st.setString(1, palestrante.getNomePalestrante());
            st.setString(2, palestrante.getCurriculoPalestrante());
            st.setString(3, Usuarios.getEmail());
            st.setString(4, Usuarios.getSenha());
            st.setInt(5, Usuarios.getCpf());

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            BDconnector.closeStatement(st);
            BDconnector.closeConnection();
        }
    }

}
