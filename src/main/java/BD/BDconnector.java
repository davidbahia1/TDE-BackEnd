/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class BDconnector {
    
    
      public static Connection getConnection(){
        try {
            String url = "jdbc:mysql://localhost:3306/tdebackend";
            String nome_bd = "root";
            String senha_bd = "102030";
            
            System.out.println("Conectado com Sucesso");
            return DriverManager.getConnection(url, nome_bd, senha_bd);
        } catch (SQLException e) {
            System.out.println("não foi possivel conectar");
            return null;
        }
        
    }

	public static void closeStatement(PreparedStatement st) {
		// TODO Auto-generated method stub
		
	}

	public static void closeConnection() {
		// TODO Auto-generated method stub
		
	}
   
    
    
}
