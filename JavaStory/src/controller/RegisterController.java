/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import javastory.*;
import connector.Connector;
import model.UserModel;
/**
 *
 * @author User
 */
public class RegisterController extends Controller {

    
    public RegisterController(){
        
    }
    
    @Override
    void index() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void view() {
        //panggil view
        new registerPage().show();
    }
    
    public void store(String nama,String email,String pass,String role){
        //panggil dan gunakan model
        UserModel user = new UserModel();
        user.store(nama,email,pass,role);
    }
    
    
}
