/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.thelounge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoungeLoginTest {
    LoungeLogin obj = new LoungeLogin();
    
    @Test
    public void TestUsernameCorrectlyFormatted(){
        String username ="kyl_1";
        String password = "Ch&&sec@ke99!";
        String expected = "Welcome <firstname>,<lastname> it is great to see you again";
        String results = obj.returnLoginStatus(username, password);
        assertEquals(expected, results);
    }
    
    @Test
    public void TestUsernameIncorrectlyFormatted(){
        String IsNotusername = "kyle!!!!!!!";
        String IsNotpassword = "password";
        String IsNotcellphone ="0838968976";
        String expected = "Username is not correctly formatted; please ensure that youur username contains an underscore and is not more than five characters in length";
        String results = obj.registerUser(IsNotusername, IsNotpassword, cellphone);
        assertEquals(expected,results);
    }
    
    @Test
    public void TestPasswordComplexity(){
        String username = "kyl_1";
        String password = "Ch&&sec@ke99!";
        String expected ="Password successfully captured";
        String results = obj.returnLoginStatus(username, password);
        assertEquals(expected,results);
    }
    
    @Test
    public void TestPasswordIncomplexity(){
        String IsNotusername = "kyle!!!!!!!";
        String IsNotpassword = "password";
        String IsNotcellphone ="+27838968976";
        String expected = "Password is not correctly formatted; please ensure that the password contains at leat eight character, a capital letter, a number and, a speacial character";
        String results = obj.registerUser(IsNotusername, IsNotpassword, IsNotcellphone);
        assertEquals(expected,results);
    }
    
    
    @Test
    public void TestLoginSuccess(){
        String username = "kyl_1";
        String password = "Ch&&sec@ke99!";
        boolean results = obj.loginUser(username, password);
        assertTrue(results);
    }
    
    @Test
    public void TestLoginFailure(){
        String IsNotusername = "kyle!!!!!!!";
        String IsNotpassword = "password";
        boolean results = obj.loginUser(IsNotusername, IsNotpassword);
        assertFalse(results);
    }
    
    @Test
    public void TestUsernameCorrectformat(){
        String username= "kyl_1";
        boolean results = obj.checkUserName(username);
        assertTrue(results);
    }
    
    @Test
    public void TestUsernameIncorrectformat(){
        String IsNotusername = "kyle!!!!!!!";
        boolean results = obj.checkUserName(IsNotusername);
        assertFalse(results);
    }
    
    @Test
    public void TestPasswordComplexity(){
        String password = "Ch&&sec@ke99!";
        boolean results = obj.checkPasswordComplexity();
        assertTrue(results);
    }
    
    @Test
    public void TestPasswordIncomplexity(){
        String IsNotpassword = "password";
        boolean results = obj.checkPasswordComplexity();
        assertFalse(results);
    }
    
    @Test
    public void TestCellPhoneSuccess(){
        String cellphone ="+27838968976";
        boolean results = obj.checkcellNumber();
        assertTrue(results);
    }
    
    @Test
    public void TestCellPhoneFailure(){
        String IsNotcellphone = "0838968976";
        boolean results = obj.checkcellNumber();
        assertFalse(results);
    }
}
