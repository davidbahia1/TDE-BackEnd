/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BD.BDconnector;
import Model.Palestra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author david
 */
public class CadastroPalestra {
    
    
    public void CadastrarPalestra(Palestra obj) throws SQLException{
    
    PreparedStatement st=null;
        BDconnector conexao= new BDconnector();
    try{
    Connection conn = BDconnector.getConnection();
    
    st= conn.prepareStatement(
    
    "INSERT INTO Palestra"
    +"(NomePalestra,DescricaoPalestra,HorarioComeco,HorarioFim,NomePalestrante,DataFim,DataComeco,CurriculoPalestrante)"
    +"VALUES"
    +"?,?,?,?,?,?,?,?"
    );
    
    
    st.setString(1, obj.getNomePalestra());
    st.setString(2, obj.getDescricaoPalestra());
    st.setDate(3, new java.sql.Date(obj.getHorarioComeco().getTime()));
    st.setDate(4, new java.sql.Date(obj.getHorarioFim().getTime()));
    st.setString(5, obj.getNomePalestrante());
    st.setDate(6, new java.sql.Date(obj.getDataFim().getTime()));
    st.setDate(7, new java.sql.Date(obj.getDataComeco().getTime()));
    st.setString(8, obj.getCurriculoPalestrante());
    
    int RowsAffected = st.executeUpdate();
    
    if(RowsAffected<0){
        System.out.println("linhas afetadas com sucesso");
    
    }
    else{
        System.out.println("as linhas nao foram afetadas");
    }
    
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
