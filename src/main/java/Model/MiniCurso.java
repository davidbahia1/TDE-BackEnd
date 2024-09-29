/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author david
 */


public class MiniCurso {
    
    private int id;
    public String NomeCurso;
    public String DescricaoCurso;
    public Date HorarioComeco;
    public Date  HorarioFim;
    public String NomeCoach;
    public Date DataFim;
    public Date DataComeco;
    public String CurriculoCoach;
    public int QuantidadeVaga;
   public Date DataLimiteInscricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String NomeCurso) {
        this.NomeCurso = NomeCurso;
    }

    public String getDescricaoCurso() {
        return DescricaoCurso;
    }

    public void setDescricaoCurso(String DescricaoCurso) {
        this.DescricaoCurso = DescricaoCurso;
    }

    public Date getHorarioComeco() {
        return HorarioComeco;
    }

    public void setHorarioComeco(Date HorarioComeco) {
        this.HorarioComeco = HorarioComeco;
    }

    public Date getHorarioFim() {
        return HorarioFim;
    }

    public void setHorarioFim(Date HorarioFim) {
        this.HorarioFim = HorarioFim;
    }

    public String getNomeCoach() {
        return NomeCoach;
    }

    public void setNomeCoach(String NomeCoach) {
        this.NomeCoach = NomeCoach;
    }

    public Date getDataFim() {
        return DataFim;
    }

    public void setDataFim(Date DataFim) {
        this.DataFim = DataFim;
    }

    public Date getDataComeco() {
        return DataComeco;
    }

    public void setDataComeco(Date DataComeco) {
        this.DataComeco = DataComeco;
    }

    public String getCurriculoCoach() {
        return CurriculoCoach;
    }

    public void setCurriculoCoach(String CurriculoCoach) {
        this.CurriculoCoach = CurriculoCoach;
    }

    public int getQuantidadeVaga() {
        return QuantidadeVaga;
    }

    public void setQuantidadeVaga(int QuantidadeVaga) {
        this.QuantidadeVaga = QuantidadeVaga;
    }

    public Date getDataLimiteInscricao() {
        return DataLimiteInscricao;
    }

    public void setDataLimiteInscricao(Date DataLimiteInscricao) {
        this.DataLimiteInscricao = DataLimiteInscricao;
    }

    public MiniCurso(int id, String NomeCurso, String DescricaoCurso, Date HorarioComeco, Date HorarioFim, String NomeCoach, Date DataFim, Date DataComeco, String CurriculoCoach, int QuantidadeVaga, Date DataLimiteInscricao) {
        this.id = id;
        this.NomeCurso = NomeCurso;
        this.DescricaoCurso = DescricaoCurso;
        this.HorarioComeco = HorarioComeco;
        this.HorarioFim = HorarioFim;
        this.NomeCoach = NomeCoach;
        this.DataFim = DataFim;
        this.DataComeco = DataComeco;
        this.CurriculoCoach = CurriculoCoach;
        this.QuantidadeVaga = QuantidadeVaga;
        this.DataLimiteInscricao = DataLimiteInscricao;
    }
    
    
}
