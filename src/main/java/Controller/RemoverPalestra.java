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
public class RemoverPalestra {
    
    public void RemovePalestra(Integer id){

PreparedStatement st= null;
BD.BDconnector conexao = new BDconnector();
try{

Connection conn = BDconnector.getConnection();

st= conn.prepareStatement(

"DElET FROM Palestra WHERE id =?"
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
