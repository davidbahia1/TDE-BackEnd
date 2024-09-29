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
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author david
 */
public class CadastrarMiniCurso {

    public void CadastrarCurso(MiniCurso Curso) throws SQLException, ParseException {

        PreparedStatement st = null;
        BDconnector conexao = new BDconnector();
        Connection conn = BDconnector.getConnection();

        try {
            st = conn.prepareStatement(
                    "INSET INTO MiniCurso"
                    + "( Nomecurso, DescricaoCurso,HorarioComeco,HorarioFim,NomeCoach,DataFim,DataComeco,CurriculoCoach,QuantidadeVaga,DataLimiteInscricao)"
                    + "VALUES"
                    + "?,?,?,?,?,?,?,?,?"
            );

            st.setString(1, Curso.getNomeCurso());
            st.setString(2, Curso.getDescricaoCurso());
            st.setDate(3, new java.sql.Date(Curso.getHorarioComeco().getTime()));
            st.setDate(4, new java.sql.Date(Curso.getHorarioFim().getTime()));
            st.setString(5, Curso.getNomeCoach());
            st.setDate(6, new java.sql.Date(Curso.getDataFim().getTime()));
            st.setDate(7, new java.sql.Date(Curso.getDataComeco().getTime()));
            st.setString(8, Curso.getCurriculoCoach());
            st.setInt(9, Curso.getQuantidadeVaga());
            st.setDate(10, new java.sql.Date(Curso.getDataLimiteInscricao().getTime()));

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("linhas afetadas com sucesso");

            } else {
                System.out.println("nenhuma linha foi afetada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            BDconnector.closeStatement(st);
            BDconnector.closeConnection();
        }

    }
}
