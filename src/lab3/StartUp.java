/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

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
         * Lab 3 Part 1
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
           
	   while(line != null){
               
               
               
               if(counter == 2){
                   
                  String[] a = line.split(",");
                  System.out.println("City: " + a[3]);
                  
               }
               
               line = in.readLine();
                  counter +=1;
                  
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
