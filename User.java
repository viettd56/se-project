/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author trinh_000
 */
public class User {
    private String userName;
    private String pass;
   
    public User(){
        userName = "admin";
        pass = "admin";
    }
    
    public User(String userName1, String pass1){
        userName = userName1;
        pass = pass1;
    }
    public void set_user_name(String un){
        userName = un;
    }
    
    public String get_user_name(){
        return userName;
    }
    
    public void set_pass(String pas){
        pass = pas;
    }
    
    public String get_pass(){
        return pass;
    }
   
}
