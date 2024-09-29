/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author david
 */
public class Usuario {
    
    private int Cpf;
    private String Nome;
    private String email;
    private String Senha;

    public Usuario(int Cpf, String Nome, String email, String Senha) {
        this.Cpf = Cpf;
        this.Nome = Nome;
        this.email = email;
        this.Senha = Senha;
    }

    
    
    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
    
    
    
}
