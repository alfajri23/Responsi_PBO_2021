/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connector.Connector;
import javastory.userPage;
import model.CeritaModel;

/**
 *
 * @author User
 */
public class UserController extends Controller{

     public String id;
    
    @Override
    void index() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void view() {
    
    }
    
    public void show(){
        
        
        
    }

    public void store(int id,String judul,String isi){
        //panggil dan gunakan model
        CeritaModel cerita = new CeritaModel();
        cerita.store(id,judul,isi);
    }
    
    public void update(String judul,String isi){
        //panggil dan gunakan model
        CeritaModel cerita = new CeritaModel();
        cerita.update(judul,isi);
    }
    
    public void delete(String judul){
        //panggil dan gunakan model
        CeritaModel cerita = new CeritaModel();
        cerita.delete(judul);
    }
    
}
