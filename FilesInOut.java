import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;
import java.util.Scanner;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) throws FileNotFoundException {
        // Replace this with statements to set the file name (input) and file name (output).
        // Initially it will be easier to hardcode suitable file names.
    	
    	
    	
    	//create input file
    	File inputFile = new File ("input.txt");
    	Scanner in = new Scanner (inputFile);
    	
    	//create output file
    	PrintWriter out = new PrintWriter("output.txt");
   
    	//standard title case
    	while(in.hasNextLine())
    	{
    		String fName = in.next();   //read first input for the first name
    		String lName = in.next();   //read next input for last name
    		String DOB = in.next();		//read next input for DOB
    		String day = DOB.substring(0, 2);	//break up the DOB string into day, month and year
    		String month = DOB.substring(2, 4);
    		String year = DOB.substring(4);
    		
    		String output = fName.substring(0, 1).toUpperCase() + fName.substring(1) + " " + 
    					lName.substring(0, 1).toUpperCase() + lName.substring(1) + "\t\t" + day + 
    					"/" + month + "/" + year;  //correctly formatted output - substring the first letter of name to put in uppercase
    		out.print("\n" + output);  //print output into out file
    	}
    	out.close();
    	in.close();
    	
    	
    	//uppercase output
    	//same as above but put whole name in uppercase - not yet first letter
    	do 
    	{
    		String fName = in.next();
    		String lName = in.next();
    		String DOB = in.next();
    		String day = DOB.substring(0, 2);
    		String month = DOB.substring(2, 4);
    		String year = DOB.substring(4);
    		String output = fName.toUpperCase() + " " + lName.toUpperCase() + "\t\t" + day + "/" + month + "/" + year;
    		out.print("\n" + output);
    	}
    	while(in.hasNextLine()); 
    	out.close();
    	in.close();
    	
    	
    	//middle name output case
    	do 
    	{
    		String Name2 = in.next();
    		String Name1 = in.next();
    		String output = Name1.toUpperCase() + " " + Name2.toUpperCase() ;
    		if(in.hasNextInt())  //if the next value is an integer then substring the DOB as usual
    		{
    			String DOB = in.next();
        		String day = DOB.substring(0, 2);
        		String month = DOB.substring(2, 4);
        		String year = DOB.substring(4);
        		output = output + "\t\t" + day + "/" + month + "/" + year; //add to output
    		}
    		else  //if the next is not an int then first add another name and then add DOB
    		{
    			String name3 = in.next();  //read next String input
    			
    			//add DOB as usual
    			String DOB = in.next();
        		String day = DOB.substring(0, 2);
        		String month = DOB.substring(2, 4);
        		String year = DOB.substring(4);
        		output = output + name3.toUpperCase() + "\t\t" + day + "/" + month + "/" + year; //add to output
    		}
    		
    		out.print("\n" + output);
    	}
    	while(in.hasNextLine()); 
    	out.close();
    	in.close();
    	
    	
    	
        System.out.println("You need to add your own code to do anything");

    } // main

} // FilesInOut
