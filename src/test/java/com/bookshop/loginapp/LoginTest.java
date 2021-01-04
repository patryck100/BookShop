package com.bookshop.loginapp;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author patry
 */
public class LoginTest {
    
    Login instance = new Login();
    
    public LoginTest() {
    }
    
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
       
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
     /**
     * Test of verifyFields method, of class RegisterForm.
     * If there is any empty field in the RegisterForm it returns a boolean "false"
     * and does not allow the user to submit the form before filling it all
     */
    @Test
    public void testVerifyFields() {
        System.out.println("Verify if there is any empty field");
        RegisterForm instance = new RegisterForm();
        boolean expResult = false;
        boolean result = instance.verifyFields();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of register method, of class MainClassLogin.
     * It checks if there is any user with the same login and either allow
     * or not a new account.
     */
    @org.junit.jupiter.api.Test
    public void testRegister() {
        System.out.println("Register with new userLogin");
        String firstName = "Patryck";
        String lastName = "Brenner";
        String email = "patryck@test.com";
        String password = "test123";
        String phone = "0123456";
        String address = "ireland";
        int expResult = 0;
        int result = instance.register(firstName, lastName, email, password, phone, address);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of register method, of class MainClassLogin.
     * Test trying to register an account already existent. Expects false result
     */
    @org.junit.jupiter.api.Test
    public void testRegister1() {
        System.out.println("Register with existing user");
        String firstName = "Patryck";
        String lastName = "Brenner";
        String email = "patryck@test123.com";
        String password = "12345";
        String phone = "0123456";
        String address = "ireland";
        int expResult = -1;
        int result = instance.register(firstName, lastName, email, password, phone, address);
        assertEquals(expResult, result);
    }    
    

    /**
     * Test of login method, of class MainClassLogin with valid login.
     * This test a login with a valid user account
     */
    @org.junit.jupiter.api.Test
    public void testLogin() {
        System.out.println("login with valid userLogin");
        String email = "patryck@test123.com";
        String password = "12345";
        int expResult = 0;
        int result = instance.login(email, password);
        assertEquals(expResult, result);
    }
    
       /**
     * Test of login method, of class MainClassLogin with invalid userLogin.
     */
    @org.junit.jupiter.api.Test
    public void testLogin1() {
        System.out.println("login with invalid userLogin");
        String email = "wrongLogin";
        String password = "12345";
        int expResult = -1;
        int result = instance.login(email, password);
        assertEquals(expResult, result);
    } 
    
           /**
     * Test of login method, of class MainClassLogin with invalid password.
     */
    @org.junit.jupiter.api.Test
    public void testLogin2() {
        System.out.println("login with invalid password");
        String email = "patryck@test123.com";
        String password = "wrongPassword";
        int expResult = -1;
        int result = instance.login(email, password);
        assertEquals(expResult, result);
    } 
    
}
