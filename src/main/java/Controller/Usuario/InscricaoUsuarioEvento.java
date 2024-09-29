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
public class InscricaoUsuarioEvento {
    
    
    public void InscricaoUsuarioEventos(Usuario obj) throws SQLException{
    
    BDconnector conexao = new BDconnector();
    PreparedStatement st = null;
    
    try{
    
    Connection conn = BDconnector.getConnection();
    
    st = conn.prepareStatement(
    
    "INSERT INTO Evento"
     +"(Nome, Cpf, Email,Telefone)"       
      +"VALUES"
            +" ?,?,?,?"
            
    
    );
            
            st.setString(1, obj.getNome());
            st.setInt(2, obj.getCpf());
            st.setString(3, obj.getEmail());
            st.setString(4, obj.getSenha());
    
            
            int rowsAffected =  st.executeUpdate();
  
            if(rowsAffected<0){
            
                System.out.println("as linhas afetadas com sucesso");
            
            
            } else{
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
