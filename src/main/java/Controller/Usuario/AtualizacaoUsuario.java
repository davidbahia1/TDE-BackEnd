/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Usuario;

import BD.BDconnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class AtualizacaoUsuario {

    public void AtualizaUsuario(int Cpf, String Nome, String Email, String Senha) throws SQLException {

        PreparedStatement st = null;
        BDconnector conexao = new BDconnector();

        try {
            Connection conn = BDconnector.getConnection();

            st = conn.prepareStatement(
                    "UPDATE CadastroUsuario"
                    + "SET Cpf=?, Nome=?, Email=?, Senha=? "
                    + "WHERE Cpf = ?"
            );

            st.setInt(1, Cpf);
            st.setString(2, Nome);
            st.setString(3, Email);
            st.setString(4, Senha);

            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            BDconnector.closeStatement(st);
            BDconnector.closeConnection();

        }
    }

}
