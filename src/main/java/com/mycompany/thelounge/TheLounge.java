/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thelounge;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class TheLounge {

    public static void main(String[] args) {
       LoungeLogin obj = new LoungeLogin(firstName, lastName, userName, Password, cellNumber);
       Scanner input = new Scanner(System.in);
       
       System.out.println("----Welcome to The Lounge----");
       System.out.println("--Registration");
       
       System.out.print("Enter you First Name");
       String name = input.nextLine();
       System.out.print("Enter your Last Name");
       String lastname = input.nextLine();
      
       boolean isRegistered = false;
       while(!isRegistered){
           System.out.print("Enter Username: ");
           String userName = input.nextLine();
           System.out.print("Enter Password: ");
           String Password = input.nextLine();
           System.out.print("Enter Cellphone Number");
           String cellNumber = input.nextLine();
           
           String regMessage= obj.registerUser(userName, Password, cellNumber);
           System.out.println(regMessage);
           
           if(regMessage.equals("Username and password successfully captured")){
               isRegistered = true;
           }else{
               System.out.println("Please try registering again with the correct details");
           }
       }
      
    }
}
