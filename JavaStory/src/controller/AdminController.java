/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.AdminModel;

/**
 *
 * @author User
 */
public class AdminController extends Controller{

    @Override
    void index() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void view() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void update(String email,String nama){
        AdminModel Admin = new AdminModel();
        Admin.update(email,nama);
    }
    
    public void delete(String email){
        AdminModel Admin = new AdminModel();
        Admin.delete(email);
    }
    
}
