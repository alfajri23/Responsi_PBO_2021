/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connector.Connector;

/**
 *
 * @author User
 */
public class UserModel {
    
    
    public void store(String nama,String email,String pass,String role){
        Connector connector = new Connector();
        
        try {
            String query = "INSERT INTO `users` (`nama`, `email`, `password`, `role`) VALUES ('"+nama+"','"+email+"','"+pass+"','"+role+"')";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            System.out.println("Insert Berhasil");
            
        } catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
