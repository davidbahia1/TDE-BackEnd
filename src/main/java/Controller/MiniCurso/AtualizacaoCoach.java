/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.MiniCurso;
import BD.BDconnector;
import Model.MiniCurso;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author david
 */
public class AtualizacaoCoach {
    
    public void AtualizaCoach(Usuario obj, MiniCurso objs ){
    
    
    PreparedStatement st =null;
    BDconnector conexao =new BDconnector();
    try{
    
    Connection conn = BDconnector.getConnection();
    
    st = conn.prepareStatement(
    
    "UPDATE CadastroUsuario"
     +"SET Cpf =?, NomeCoach=?, CurriculoCoach =?, Email=?, senha=?"
     +"WHERE Cpf=?"
    
    
    
    );
    st.setInt(1, obj.getCpf());
    st.setString(2, objs.getCurriculoCoach());
    st.setString(3, obj.getEmail());
    st.setString(4, obj.getSenha());
    
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
