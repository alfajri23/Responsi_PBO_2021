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
public class CeritaModel {
    public void store(int id,String judul,String isi){
        Connector connector = new Connector();
        //coba melakukan CRUD ke database
        try {
            String query = "INSERT INTO `cerita` (`id_user`, `judul`, `isi`) VALUES ("+id+",'"+judul+"','"+isi+"')";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            System.out.println("Insert Berhasil");
            
        } catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void update(String judul,String isi){
        Connector connector = new Connector();
        //coba melakukan CRUD ke database
        try {
            String query = "UPDATE cerita set judul=`"+judul+"`,isi=`"+isi+"` WHERE judul = `"+judul+"` ";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            System.out.println("Insert Berhasil");
            
        } catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(String judul){
        Connector connector = new Connector();
        //coba melakukan CRUD ke database
        try {
            String query = "DELETE FROM cerita WHERE judul = `"+judul+"` ";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            System.out.println("hapus Berhasil");
            
        } catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

