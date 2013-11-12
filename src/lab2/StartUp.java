/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Corbin
 */
public class StartUp {
    
    public static void main(String[] args) {
        
         /**
         * Lab 2 Part 1
         * Prints second costumer in file to console
         */
       int counter = 1;
        
	File data = new File(File.separatorChar + "temp" + File.separatorChar 
                        + "Contacts.txt");
        File change = new File(File.separatorChar + "temp" + File.separatorChar 
                        + "Contacts.txt");

        BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
           String answer = JOptionPane.showInputDialog("Please Select a costumer");
           int ans = Integer.parseInt(answer);
           boolean found = false;
           
           if(ans >=1 || answer != null){
           
	   while(line != null){
               
               
               
               if(ans == counter){
                   
                  String[] a = line.split(",");
                  System.out.println("First Name: " + a[0]);
                  System.out.println("Last Name: " + a[1]);
                  System.out.println("Address: " + a[2]);
                  System.out.println("City: " + a[3]);
                  System.out.println("State: " + a[4]);
                  System.out.println("Zip: " + a[5]);
                  System.out.println("Phone: " + a[6]);
                  System.out.println("\n");
                  found = true;
                  
               }
               
               line = in.readLine();
                  counter +=1;
                  
    }
         }  else if (found = false){
               System.out.println("Costumer not found");
           
           }
//           }
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        
        
    }

}