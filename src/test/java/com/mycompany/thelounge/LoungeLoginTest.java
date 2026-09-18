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
    
    String firstName= "Kyle";
    String lastName = "Black";
    String userName = "kyl_1";
    String Password = "Ch&&sec@ke99!";  
    String cellNumber = "+27838968976";
    
    @Test
    public void TestUsernameCorrectlyFormattedMessage(){
        obj.setFirstName(firstName);
        obj.setLastName(lastName);
        obj.registerUser(userName, Password, cellNumber);
        
        String expected = "Welcome Kyle Black, it is great to see you again";
        String results = obj.returnLoginStatus(userName, Password);
        assertEquals(expected, results);
    }
    
    @Test
    public void TestUsernameIncorrectlyFormattedMessage(){
        String Invalidusername = "kyle!!!!!!!";
        String expected = "Username is not correctly formatted; please ensure that youur username contains an underscore and is not more than five characters in length";
        String results = obj.registerUser(Invalidusername, Password, cellNumber);
        assertEquals(expected,results);
    }
    
    @Test
    public void TestPasswordComplexityMessage(){
        
        String expected ="Password successfully captured";
        String results = obj.registerUser(userName, Password, cellNumber);
        assertEquals(expected,results);
    }
    
    @Test
    public void TestPasswordIncomplexityMessage(){
        String Invalidpassword = "password";
        String expected = "Password is not correctly formatted; please ensure that the password contains at leat eight character, a capital letter, a number and, a speacial character";
        String results = obj.registerUser(userName, Invalidpassword, cellNumber);
        assertEquals(expected,results);
    }
    
    @Test
    public void TestcellphoneNumberCorrectlyFormattedMessage(){
        String expected ="Cell number successful captured";
        String results = obj.registerUser(userName, Password, cellNumber);
        assertEquals(expected,results);
    }
    
    @Test
    public void TestcellphoneNumberIncorrectlyFormattedMessage(){
        String InvalidcellNumber ="0838968976";
        String expected ="Cell number successful captured";
        String results = obj.registerUser(userName, Password, InvalidcellNumber);
        assertEquals(expected,results);
    }
    
    @Test
    public void TestLoginSuccess(){
        obj.setFirstName(firstName);
        obj.setLastName(lastName);
        obj.registerUser(userName, Password, cellNumber);
        
        boolean results = obj.loginUser(userName, Password);
        assertTrue(results);
    }
    
    @Test
    public void TestLoginFailure(){
        String Invalidusername = "kyle!!!!!!!";
        String Invalidpassword = "password";
        boolean results = obj.loginUser(Invalidusername, Invalidpassword);
        assertFalse(results);
    }
    
    @Test
    public void TestUsernameCorrectformat(){
        boolean results = obj.checkuserName(userName);
        assertTrue(results);
    }
    
    @Test
    public void TestUsernameIncorrectformat(){
        String Invalidusername = "kyle!!!!!!!";
        boolean results = obj.checkuserName(Invalidusername);
        assertFalse(results);
    }
    
    @Test
    public void TestPasswordComplexity(){
        boolean results = obj.checkPasswordComplexity(Password);
        assertTrue(results);
    }
    
    @Test
    public void TestPasswordIncomplexity(){
        String InvalidPassword = "password";
        boolean results = obj.checkPasswordComplexity(Password);
        assertFalse(results);
    }
    
    @Test
    public void TestCellPhoneSuccess(){
        boolean results = obj.checkcellNumber(cellNumber);
        assertTrue(results);
    }
    
    @Test
    public void TestCellPhoneFailure(){
        String InvalidcellNumber = "0838968976";
        boolean results = obj.checkcellNumber(InvalidcellNumber);
        assertFalse(results);
    }
}
