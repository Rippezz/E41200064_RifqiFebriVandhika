/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rippezz.com;
/**
 *
 * @author RIP SNI
 */
import java.util.Scanner;
public class TugasWO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int stuId;
        String fName, IName, stuStatus;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Full Name:");
        fName = input.nextLine();
        
        System.out.print("Enter Short Name:");
        IName = input.nextLine();
        
        System.out.print("Enter ID:");
        stuId = input.nextInt();
        
        System.out.print("Status:");
        stuStatus = input.next();
        
        System.out.println("-----------------------------");
        System.out.println("Student Name : " + fName);
        System.out.println("Nickname : " + IName);
        System.out.println("Student ID : " + stuId);
        System.out.println("Student Status : " + stuStatus);
      
        
    }
    
}
