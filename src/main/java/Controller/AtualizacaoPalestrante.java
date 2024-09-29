/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BD.BDconnector;
import Model.Palestra;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author david
 */
public class AtualizacaoPalestrante {
    
    public void AtualizaPalestrante(Usuario obj, Palestra objs){
   
    PreparedStatement st = null;
    
    BD.BDconnector conexao = new BDconnector();
    try{

Connection conn = BDconnector.getConnection();

st= conn.prepareStatement(

"UPDATE CadastroUsuario"
+"SET NomePalestrante=?, CurriculoPalestrante=?,Email=?,Senha=? Cpf=?"
+"WHERE NomePalestrante=? "

);

st.setString(1, objs.getNomePalestrante());
st.setString(2,objs.getCurriculoPalestrante());
st.setString(3, obj.getEmail());
st.setString(4, obj.getSenha());
st.setInt(5, obj.getCpf());

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
