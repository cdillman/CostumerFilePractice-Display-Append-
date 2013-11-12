/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Corbin
 */
public class StartUp {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /**
         * Lab 1 Part 1
         * Prints all costumers in file to console
         */
//         int counter = 1;
//        
//	File data = new File(File.separatorChar + "temp" + File.separatorChar 
//                        + "Contacts.txt");
//        File change = new File(File.separatorChar + "temp" + File.separatorChar 
//                        + "Contacts.txt");
//
//        BufferedReader in = null;
//        try {
//	   in = new BufferedReader(new FileReader(data));
//	   String line = in.readLine();
//	   while(line != null){
//               
//               
//		  String[] a = line.split(",");
//                  System.out.println("First Name: " + a[0]);
//                  System.out.println("Last Name: " + a[1]);
//                  System.out.println("Address: " + a[2]);
//                  System.out.println("City: " + a[3]);
//                  System.out.println("State: " + a[4]);
//                  System.out.println("Zip: " + a[5]);
//                  System.out.println("Phone: " + a[6]);
//                  System.out.println("\n");
//               
//                  line = in.readLine();
//                  counter +=1;
//    }
//        } catch(IOException ioe) {
//            System.out.println("Houston, we have a problem! reading this file");
//        } finally {
//            try {
//                in.close();
//            } catch(Exception e) {
//                
//            }
//        }
       
        /**
         * Lab 1 Part 2
         * Prints second costumer in file to console
         */
//       int counter = 1;
//        
//	File data = new File(File.separatorChar + "temp" + File.separatorChar 
//                        + "Contacts.txt");
//        File change = new File(File.separatorChar + "temp" + File.separatorChar 
//                        + "Contacts.txt");
//
//        BufferedReader in = null;
//        try {
//	   in = new BufferedReader(new FileReader(data));
//	   String line = in.readLine();
//	   while(line != null){
//               
//               if(counter == 2){
//		  String[] a = line.split(",");
//                  System.out.println("First Name: " + a[0]);
//                  System.out.println("Last Name: " + a[1]);
//                  System.out.println("Address: " + a[2]);
//                  System.out.println("City: " + a[3]);
//                  System.out.println("State: " + a[4]);
//                  System.out.println("Zip: " + a[5]);
//                  System.out.println("Phone: " + a[6]);
//                  System.out.println("\n");
//               }
//                  line = in.readLine();
//                  counter +=1;
//    }
//        } catch(IOException ioe) {
//            System.out.println("Houston, we have a problem! reading this file");
//        } finally {
//            try {
//                in.close();
//            } catch(Exception e) {
//                
//            }
//        }
        
        /**
         * Lab 1 Part 3
         * Adds costumer to file and prints out all costumers
         * from file to console
         */
       int counter = 1;
        boolean append = true;
        File data = new File(File.separatorChar + "temp" + File.separatorChar 
                        + "Contacts.txt");
        File change = new File(File.separatorChar + "temp" + File.separatorChar 
                        + "Contacts.txt");
        
        System.out.println("This was added to the file"); 
        
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data, append)));

        out.println("");
        out.print("mike,");
        out.print("Smith,");
        out.print("N67 hartling rd.,");
        out.print("Milwaukee,");
        out.print("WI,");
        out.print("53029,");
        out.print("262-490-0264,");
        out.close();
        
	

        BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
               
               
		  String[] a = line.split(",");
                  System.out.println("First Name: " + a[0]);
                  System.out.println("Last Name: " + a[1]);
                  System.out.println("Address: " + a[2]);
                  System.out.println("City: " + a[3]);
                  System.out.println("State: " + a[4]);
                  System.out.println("Zip: " + a[5]);
                  System.out.println("Phone: " + a[6]);
                  System.out.println("\n");
               
                  line = in.readLine();
                  counter +=1;
    }
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

            