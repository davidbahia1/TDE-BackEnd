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
import java.sql.Statement;

/**
 *
 * @author david
 */
public class AtualizacaoMiniCurso {
    
    public void AtualizarMiniCurso(MiniCurso obj) throws SQLException {
        
        PreparedStatement st = null;
        BDconnector conexao = new BDconnector();
        
        try {
            
            Connection conn = BDconnector.getConnection();
            
            st = conn.prepareStatement(
                    "UPDATE MiniCurso"
                    + "SET  NomeCurso =?,  DescricaoCurso=?, HorarioComeco=?,HorarioFim=?, NomeCoach=?, DataFim=?, DataComeco=?,CurriculoCoachCurriculoCoach=?,QuantidadeVagaQuantidadeVaga=?, DataLimiteInscricao=?"
                    + "WHERE  NomeCurso=?"
            );
            
            st.setString(1, obj.getNomeCurso());
            st.setString(2, obj.getDescricaoCurso());
            st.setDate(3, new java.sql.Date(obj.getHorarioComeco().getTime()));
            st.setDate(4, new java.sql.Date(obj.getHorarioFim().getTime()));
            st.setString(5, obj.getNomeCoach());
            st.setDate(6, new java.sql.Date(obj.getDataFim().getTime()));
            st.setDate(7, new java.sql.Date(obj.getDataComeco().getTime()));
            st.setString(8, obj.getCurriculoCoach());
            st.setInt(9, obj.getQuantidadeVaga());
            st.setDate(10, new java.sql.Date(obj.getDataLimiteInscricao().getTime()));
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            
        } finally {
            BDconnector.closeStatement(st);
            BDconnector.closeConnection();
            
        }
        
    }
}
