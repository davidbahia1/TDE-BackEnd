/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Evento;

/**
 *
 * @author david
 */
import BD.BDconnector;
import Model.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class CadastroEvento {
    
    public void CriarCadastroEvento(Evento Eventos) throws SQLException, ParseException{
            
       SimpleDateFormat sdf = new SimpleDateFormat("dd,MM,yyyy");
        PreparedStatement st =null;
              BDconnector conexao = new BDconnector();
           
     
                Connection conn = BDconnector.getConnection();
                
               try{
               st = conn.prepareStatement(
               "INSERT INTO Evento"
               +" (CpfResponsavel,NomeEvento,DataInicio,DataFim,DescricaoEvento,NomeResposanvel,NumeroVaga,DataLimiteInscricao)"
               +"VALUES"
               +"?,?,?,?,?,?,?"        
               );
               
               st.setInt(1, Eventos.getCpfResponsavel());
               st.setString(2,Eventos.getNomeEvento() );
               st.setDate(3, new java.sql.Date(sdf.parse("").getTime()));
               st.setDate(4, new java.sql.Date(sdf.parse("").getTime()));
               st.setString(5, Eventos.getDescricaoEvento() );
               st.setString(5, Eventos.getNomeResposanvel());
               st.setInt(6, Eventos.getNumeroVaga());
               st.setDate(7,new java.sql.Date(sdf.parse("").getTime()) );
               
               
               int rowsAffected = st.executeUpdate();
                   System.out.println("as linhas afetadas foram:"+ rowsAffected);
            }
       
    
    catch (SQLException e){
e.printStackTrace();
}
 catch(ParseException e){
e.printStackTrace();
}
finally{
      
BDconnector.closeStatement(st);
BDconnector.closeConnection();

}

    }
         
            }


