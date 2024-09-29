/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Evento;
import BD.BDconnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author david
 */
public class RemoverEvento {
    
    public void RemoveEvento( Integer id){
    
    PreparedStatement st = null;
    
    BDconnector conexao =new BDconnector();
    try{
    Connection conn = BD.BDconnector.getConnection();
     
    st = conn.prepareStatement(
    
    "DELETE FROM Evento WHERE id= ? "
    );
    
    st.setInt(1, id);
    
    }
    catch(SQLException e ){
    e.printStackTrace();
    
    }
    
    finally{
    BDconnector.closeStatement(st);
    BDconnector.closeConnection();
    
    }
    }
    
    
    
    
    
}
