/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Evento;

import BD.BDconnector;
import Model.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author david
 */
public class AtualizarEvento {
    
    public void AtualizaEvento(Evento obj){
    
    PreparedStatement st =null;
    BDconnector conexao= new BDconnector();
    try{
    Connection conn = BDconnector.getConnection();
    
    st = conn.prepareStatement(
    
            "UPDATE Evento"
            +"SET CpfResponsavel=?,NomeEvento=?,DataInicio=?,DataFim=?,DescricaoEvento=?,NomeResposanvel=?,NumeroVaga=?,DataLimiteInscricao=?"
            +"WHERE id=?"
    
    
    );
    st.setInt(1, obj.getCpfResponsavel());
    st.setString(2, obj.getNomeEvento());
    st.setDate(3, new java.sql.Date(obj.getDataInicio().getTime()));
    st.setDate(4, new java.sql.Date(obj.getDataFim().getTime()));
    st.setString(5, obj.getDescricaoEvento());
    st.setString(6, obj.getNomeResposanvel());
    st.setInt(7, obj.getNumeroVaga());
    st.setDate(8, new java.sql.Date(obj.getDataLimiteInscricao().getTime()));
    
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
