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
public class Evento {
    
     private int id;
    private int CpfResponsavel;
    public String NomeEvento;
    public Date DataInicio;
    public Date DataFim;
    public String DescricaoEvento;
    public String NomeResposanvel;
    public int NumeroVaga;
    public Date DataLimiteInscricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCpfResponsavel() {
        return CpfResponsavel;
    }

    public void setCpfResponsavel(int CpfResponsavel) {
        this.CpfResponsavel = CpfResponsavel;
    }

    public String getNomeEvento() {
        return NomeEvento;
    }

    public void setNomeEvento(String NomeEvento) {
        this.NomeEvento = NomeEvento;
    }

    public Date getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(Date DataInicio) {
        this.DataInicio = DataInicio;
    }

    public Date getDataFim() {
        return DataFim;
    }

    public void setDataFim(Date DataFim) {
        this.DataFim = DataFim;
    }

    public String getDescricaoEvento() {
        return DescricaoEvento;
    }

    public void setDescricaoEvento(String DescricaoEvento) {
        this.DescricaoEvento = DescricaoEvento;
    }

    public String getNomeResposanvel() {
        return NomeResposanvel;
    }

    public void setNomeResposanvel(String NomeResposanvel) {
        this.NomeResposanvel = NomeResposanvel;
    }

    public int getNumeroVaga() {
        return NumeroVaga;
    }

    public void setNumeroVaga(int NumeroVaga) {
        this.NumeroVaga = NumeroVaga;
    }

    public Date getDataLimiteInscricao() {
        return DataLimiteInscricao;
    }

    public void setDataLimiteInscricao(Date DataLimiteInscricao) {
        this.DataLimiteInscricao = DataLimiteInscricao;
    }

    public Evento(int id, int CpfResponsavel, String NomeEvento, Date DataInicio, Date DataFim, String DescricaoEvento, String NomeResposanvel, int NumeroVaga, Date DataLimiteInscricao) {
        this.id = id;
        this.CpfResponsavel = CpfResponsavel;
        this.NomeEvento = NomeEvento;
        this.DataInicio = DataInicio;
        this.DataFim = DataFim;
        this.DescricaoEvento = DescricaoEvento;
        this.NomeResposanvel = NomeResposanvel;
        this.NumeroVaga = NumeroVaga;
        this.DataLimiteInscricao = DataLimiteInscricao;
    }
    
    
    
    
    
}
