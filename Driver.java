package THPT3;

import java.util.*;
import java.io.*;
/**
 * This is the Driver class for THPT3.  This class has a main method.
 * The operation of this class is to read in a name for an input file,
 * to create an output file, a while loop cycles through the lines of text
 * of the input file and sends them to the Converter method.  Converted strings
 * are returned and then printed to the screen and to the output file.  
 * 
 * @author Arion Almond     Lab: L06
 * @version 3/6/2014
 */
public class Driver
{
    public static void main(String[]args)throws IOException
    {
        String lines;
        StringBuilder cLines = new StringBuilder();
        StringBuilder converted = new StringBuilder();  //one string and two stringbuilders are set
        
        String fileName;
        
        Scanner input = new Scanner(System.in);
        Scanner inputFile;
        System.out.println("Enter the name of the file: ");  //This process is used to allow the user to enter a filename to be imported
        fileName = input.nextLine();
        inputFile = new Scanner(new File(fileName));
        
        
        File file = new File("C:\\outSentence.txt");
        PrintWriter outputFile = new PrintWriter(file);  //This creates an output file 
        
        //Leaving this in to play with the code on my local system.
        //inputFile = new Scanner(new File("E:\\OneDrive\\ITCS 1213\\THPT3\\inputFile.txt"));
         
        while(inputFile.hasNext())//read the file while there is data to be read
        {
            lines = inputFile.nextLine();    //imports the line to the string
            cLines = new StringBuilder(lines);  //import the string to the stringbuilder
            
            Converter convert = new Converter();  //sending data to the convert method
            convert.Converter(lines,cLines);        
            
            converted = convert.getConvert();    //returning the data converted

            System.out.println(converted);      //print to screen 
            outputFile.println(converted);      //print to outputfile
        }
        outputFile.close();
        inputFile.close();
    }
}
