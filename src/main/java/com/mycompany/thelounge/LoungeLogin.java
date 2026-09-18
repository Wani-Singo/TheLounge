/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thelounge;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author Student
 */
public class LoungeLogin {
    public String firstName;
    public String lastName;
    public String userName;
    public String Password;  
    public String cellNumber;
    
    public LoungeLogin(){}
    public LoungeLogin(String firstName, String lastName, String userName, String Password, String cellNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.Password = Password;
        this.cellNumber = cellNumber; 
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public boolean checkuserName(){
        if(userName == null) return false;
        return userName.contains("_")&& userName.length()<= 5;
    }
    public boolean checkPasswordComplexity(){
        if(Password == null|| Password.length() <8){
            return false;
        }
        boolean hasCapital = Password.matches(".*[A-Z].*");
        boolean hasNumber = Password.matches(".*[0-9].*");
        boolean hasSpecialCharacter = Password.matches(".*[^a-zA-Z0-9].*");
        
        return hasCapital && hasNumber && hasSpecialCharacter;
    }
    public boolean checkcellNumber(){
        if(cellNumber == null) return false;
        String regex = "^\\+27\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cellNumber);
        return matcher.matches();
    }
    public String registerUser(String userName, String Password, String cellNumber){
        if(!checkuserName()){
            return "Username is not correctly formatted. Ensure that your username contains an underscore and is at most five characters long";
        }
        if(!checkPasswordComplexity()){
            return "Password is not correctly formatted. Enter at least eight character, a capital letter, a number and a special Character";
        }
        if(!checkcellNumber()){
            return "Cellphone number is incorrectly formatted or does not contain internation code";
        }
        this.userName = userName;
        this.Password = Password;
        this.cellNumber = cellNumber; 
        
        return "Username and Password successfully captured";
    }
    public boolean loginUser(String entereduserName, String enteredPassword){
        if(this.userName == null || this.Password == null){
            return false;
        }
        return userName.equals(entereduserName) && Password.equals(enteredPassword);
    }
    public String returnLoginStatus(String entereduserName, String enteredPassword){
        if(loginUser(entereduserName, enteredPassword)){
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again";
        }else{
            return "Username or password incorrect. Please try again";
        }
    }
}
