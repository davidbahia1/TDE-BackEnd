/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.MiniCurso;
import BD.BDconnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author david
 */
public class RemoverCoach {

   public void Removecoach(String NomeCoach) throws SQLException{
   
           PreparedStatement st=null;
           BDconnector conexao = new BDconnector();
   try{
   
       Connection conn = BDconnector.getConnection();
   
        st = conn.prepareStatement(
        "DELET FROM CadastroUsuario WHERE NomeCoach =?"
        
        );
                st.setCursorName(NomeCoach);
                st.executeUpdate();
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
