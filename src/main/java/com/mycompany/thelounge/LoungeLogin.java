/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thelounge;

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
}
