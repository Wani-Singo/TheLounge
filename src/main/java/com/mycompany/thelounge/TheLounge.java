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
       Scanner input = new Scanner(System.in);
       LoungeLogin obj = new LoungeLogin();
       
       System.out.println("----Welcome to The Lounge----");
       System.out.println("-----Registration-----");
       
       System.out.print("Enter you First Name: ");
       String name = input.nextLine();
       obj.setFirstName(name);
       System.out.print("Enter your Last Name: ");
       String lastname = input.nextLine();
       obj.setLastName(lastname);
      
       boolean isRegistered = false;
       while(!isRegistered){
           System.out.println("Enter Username: ");
           String userName = input.nextLine();
           System.out.println("Enter Password: ");
           String Password = input.nextLine();
           System.out.println("Enter Cellphone Number(start with +27): ");
           String cellNumber = input.nextLine();
           
           String regMessage= obj.registerUser(userName, Password, cellNumber);
           System.out.println(regMessage);
           
           if(obj.isRegistered()){
               isRegistered = true;
           }else{
               System.out.println("Please try registering again with the correct details");
           }
       }
      System.out.println("\n--Login to The Lounge");
      boolean loggedIn = false;
      while(!loggedIn){
          System.out.println("Enter Username: ");
          String entereduserName = input.nextLine();
          System.out.println("Enter password: ");
          String enteredPassword = input.nextLine();
          
          String statusMessage = obj.returnLoginStatus(entereduserName, enteredPassword);
          System.out.println(statusMessage);
          
          if(obj.loginUser(entereduserName, enteredPassword)){
              loggedIn =true;
          }
      }
      input.close();
    }
}
