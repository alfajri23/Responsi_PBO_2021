/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import connector.Connector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javastory.*;

/**
 *
 * @author User
 */
public class LoginController extends Controller{
    
    public String id;
    public String role;
    
    @Override
    void index() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void view() {
        new loginPage().show();
    }

    public void login(String email, String pass){
        Connector connector = new Connector();
        
        try {
        String query = "SELECT * FROM users WHERE email = '"+email+"' AND password = '"+pass+"' ";
        connector.statement = connector.koneksi.createStatement();
        connector.resultSet = connector.statement.executeQuery(query);
        //String id = connector.resultSet.getString("email");
        //System.out.println(connector.resultSet.next());
        //System.out.println(id);
        while(connector.resultSet.next()){
            id = connector.resultSet.getString("id");
            role = connector.resultSet.getString("role");
        }
        System.out.println(id);
        
            
        }
        catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
        }
        
        if("admin".equals(role)){
            adminPage admin = new adminPage();
            admin.setVisible(true);
            
        }else{
            userPage user = new userPage(id);
            user.setVisible(true);
        }
        
        
        
        
        
        
        
    }

    private Object userPage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
