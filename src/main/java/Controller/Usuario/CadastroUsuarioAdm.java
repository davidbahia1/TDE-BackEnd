/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Usuario;

import BD.BDconnector;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class CadastroUsuarioAdm {
    public class CadastroUsuario {
    
    
    public void CadastrarUsuario( Usuario Usuarios){
    
      PreparedStatement st = null;
       BDconnector conexao = new BDconnector();
       
       Connection conn = BDconnector.getConnection();
      try{
      
        st = conn.prepareStatement(
          "INSERT INTO CadastroUsuario"
          +"(Cpf,Nome,Email,Senha)"
          +"VALUES"
                +"?,?,?,?"
          );
      
        st.setInt(1, Usuarios.getCpf());
        st.setString(2, Usuarios.getNome());
        st.setString(3, Usuarios.getEmail());
        st.setString(4, Usuarios.getSenha());
        
        int rowsAffected = st.executeUpdate();
        
        if(rowsAffected<0){
            System.out.println("linhas afetadas com sucesso");
        
        }
        else{
            System.out.println("nenhuma linha foi afetada");
        
        }
      }
    catch(SQLException e){
        e.printStackTrace();
    
    }
      finally{
      BDconnector.closeStatement(st);
      BDconnector.closeConnection();
      
      }
}
}
}
