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
public class RemoverUsuarioAdm {
    
    
    public void RemoveUsuarioAdm(Integer Cpf){
    
    PreparedStatement st= null;
    BD.BDconnector conexao = new BDconnector();
    
    try{
    
    Connection conn = BDconnector.getConnection();
    
    st= conn.prepareStatement( 
    
    
    "DELET FROM CadastroUsuario WHERE Cpf=?"
    
    
    );
    st.setInt(1, Cpf);
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
