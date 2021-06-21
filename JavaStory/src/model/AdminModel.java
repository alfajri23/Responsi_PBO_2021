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
public class AdminModel {
    
    public void update(String email,String nama){
        Connector connector = new Connector();
        
        try {
            String query = "UPDATE `users` set `email`=`"+email+"`,`nama`=`"+nama+"` WHERE `users`.`email` = `"+email+"` ";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            System.out.println("Insert Berhasil");
            
        } catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(String email){
        Connector connector = new Connector();
        
        try {
            String query = "DELETE FROM users WHERE `users`.`email` = `"+email+"` ";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeQuery(query);

            System.out.println("hapus Berhasil");
            
        } catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
