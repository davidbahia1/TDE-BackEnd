/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Date;
public class Palestra {
    
    private int id;
   public String NomePalestra;
    public   String DescricaoPalestra;
    public  Date HorarioComeco;
  public Date  HorarioFim;
   public  String NomePalestrante;
    public Date DataFim;
   public  Date DataComeco;
    public String CurriculoPalestrante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePalestra() {
        return NomePalestra;
    }

    public void setNomePalestra(String NomePalestra) {
        this.NomePalestra = NomePalestra;
    }

    public String getDescricaoPalestra() {
        return DescricaoPalestra;
    }

    public void setDescricaoPalestra(String DescricaoPalestra) {
        this.DescricaoPalestra = DescricaoPalestra;
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

    public String getNomePalestrante() {
        return NomePalestrante;
    }

    public void setNomePalestrante(String NomePalestrante) {
        this.NomePalestrante = NomePalestrante;
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

    public String getCurriculoPalestrante() {
        return CurriculoPalestrante;
    }

    public void setCurriculoPalestrante(String CurriculoPalestrante) {
        this.CurriculoPalestrante = CurriculoPalestrante;
    }

    public Palestra(int id, String NomePalestra, String DescricaoPalestra, Date HorarioComeco, Date HorarioFim, String NomePalestrante, Date DataFim, Date DataComeco, String CurriculoPalestrante) {
        this.id = id;
        this.NomePalestra = NomePalestra;
        this.DescricaoPalestra = DescricaoPalestra;
        this.HorarioComeco = HorarioComeco;
        this.HorarioFim = HorarioFim;
        this.NomePalestrante = NomePalestrante;
        this.DataFim = DataFim;
        this.DataComeco = DataComeco;
        this.CurriculoPalestrante = CurriculoPalestrante;
    }
    
}
