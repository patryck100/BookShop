package com.bookshop.loginapp;


import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author patry
 */
public class Login {
    
 
    public class UserLogin{
        String firstName;
        String lastName;
        String password;
        String phone;
        String address;
        
        public UserLogin(String email, String password){
            this.password = password;
        }    
         
        public UserLogin(String firstName, String lastName, String password, String phone, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.password = password;
            this.phone = phone;
            this.address = address;            
        }      
        
    }
    
    private HashMap<String, UserLogin> loginList = new HashMap<>();

            
    public Login() {
        HashMap<String, UserLogin> loginList = new HashMap<String, UserLogin>();
    }    
    
    public int register(String firstName, String lastName, String email, String password, String phone, String address){
        
        loginList.put("patryck@test123.com", new UserLogin("Patryck", "Brenner", "12345", "010101", "Ireland"));
        
        if (!loginList.containsKey(email)){
            loginList.put(email, new UserLogin(firstName, lastName, password, phone, address));
            return 0;
        } else{
            return -1;
        }
    }
    
    
    
    
    public int login(String email, String password){
        int result = -1;
        loginList.put("patryck@test123.com", new UserLogin("Patryck", "Brenner", "12345", "010101", "Ireland"));
        
        if (loginList.containsKey(email)){
            if (loginList.get(email).password == password){
                result = 0;
            }
        } 
        return result;
    }

    
}
