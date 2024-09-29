/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.MiniCurso;

import BD.BDconnector;
import Model.MiniCurso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author david
 */
public class RemoverCurso {
    
    public void RemoveCurso(Integer id) throws SQLException{

PreparedStatement st= null;
BDconnector conexao = new BDconnector();

        try{
        Connection conn = BDconnector.getConnection();
        
        st= conn.prepareStatement(
        "DELET FROM  MiniCurso WHERE id =?"
                   );
            
        st.setInt(1, id);
        
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
    

