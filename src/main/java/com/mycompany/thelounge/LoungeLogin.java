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
    
    public LoungeLogin(String firstName, String lastName, String userName, String Password, String cellNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.Password = Password;
        this.cellNumber = cellNumber; 
    }
    public boolean checkuserName(){
        return userName.contains("_")&& userName.length() <= 5;
    }
    public boolean checkPassword(){
        if(Password.length() <8){
            return false;
        }
        boolean hasCapital = Password.matches(".*[A-Z].*");
        boolean hasNumber = Password.matches(".*[0-9].*");
        boolean hasSpecialCharacter = Password.matches(".*[^a-zA-Z0-9].*");
        
        return hasCapital && hasNumber && hasSpecialCharacter;
    }
    public boolean checkcellNumber(){
        String regex = "^\\+27\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cellNumber);
        return matcher.matches();
    }
    public String authenticateUser(String userName, String Password, String cellNumber){
        if(!checkuserName()){
            return "Username is not correctly formatted. Ensure that your username contains an underscore and is five characters length at most";
        }
        if(checkPassword()){
            return "Password is not correctly formatted. Enter at leas eught character, a capital letter, a number and a special Character";
        }
        if(checkcellNumber()){
            return "Cellphone number is incorrectly formattedor does not contain internation code";
        }
        this.userName = userName;
        this.Password = Password;
        this.cellNumber = cellNumber; 
        
        return "Username and Password successfully captured";
    }
}
