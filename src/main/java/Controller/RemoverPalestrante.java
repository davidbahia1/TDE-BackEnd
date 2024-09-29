/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import BD.BDconnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author david
 */
public class RemoverPalestrante {
    
    
    public void RemovePalestrante(String NomePalestra){
    
        PreparedStatement st =null;
        BDconnector conexao = new BDconnector();
        
        try{
        
        Connection conn = BDconnector.getConnection();
        
        st = conn.prepareStatement(
        "DELET FROM palestra WHERE NomePalestrante=?"
        
        );
        st.setString(1, NomePalestra);
        
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
