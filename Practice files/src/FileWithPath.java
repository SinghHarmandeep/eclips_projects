

import java.util.Random;
import java.util.Scanner;
import java.io.*;
/*
 * This program shows how to create a file, and write to it and close
 * it. It also shows how to open it and read with an instance of the
 * Scanner object. This is part of chapter 10 in your book but, we are
 * studying it now as an example of creating and using objects Java API 
 * classes PrintWriter, Scanner for reading from both the keyboard and
 * the file, and random.We will be using Random to simulate the dice 
 * rolls. The focus here is to show how to give file path name. The exceptions
 * are not handled in this program. However, the program uses the throws
 * clause for you all to add try catch blocks to make it more clean.  
 */
public class FileWithPath{
    public static void main(String[] args) throws Exception{
        
        Scanner kb = new Scanner(System.in);
        Random dice = new Random();
        
        System.out.println("Enter a name for the file to store data");
        String fname = kb.next();
        File output = new File("/Users/manusingh/Desktop/"); // Output object 
                //is a named file or directory
        //output.mkdir(); 
        output = new File("/Users/manusingh/Desktop/" + fname); 
      
        
        PrintWriter printer = new PrintWriter(output);// Connect PrintWriter to our intended file.
        printer.println("This file will show 100 random dice rolls.");
        
        for (int i=0; i<100; i++){
            printer.print((dice.nextInt(6) + 1) + " "); //Print the numbers to the file
            if(i%20 == 19) 
                printer.println();
        }
        printer.close(); //Printing output to the file is done, so close the file so it can be reused.
        
        //Now we open the output file for reading. We are going to use the Scanner.
        Scanner reader = new Scanner(output);
        String firstLine = reader.nextLine();
        System.out.println(firstLine + "dd1");
        String secondLine = reader.nextLine();
        System.out.println(secondLine + "dd2");
        reader.close(); // We are only going to read two lines, so the file is closed.
        
        String words[] = firstLine.split(" ");
        System.out.println("First word: " + words[0]
                + ", second word: " + words[1] + "...");
        String parts[] = firstLine.split("i");
        System.out.println("The word 'file' is split on i: First part: " + parts[0]
                + " Second Part " + parts[4]);
        
        String numbers[] = secondLine.trim().split(" +");
        System.out.println("The length of numbers array is: " + numbers.length);
        
        int sum = 0, x=0;
        for (String s: numbers) {
            x = Integer.parseInt(s);
            sum += x;
            System.out.println(x);
        }
        
        System.out.println("The sum of numbers in the second line is: "+ sum);
        
        //We reopen the output file one more time and add an extra line of
        //output with the average value of first numbers line. Notice the second
        //argument true in the parentheses. This argument allows the printer
        //to an additional at the end of the file.
        
        printer = new PrintWriter(new FileOutputStream(output, true));
        printer.println("The average of first line of numbers is: "
                + (double)sum/numbers.length);
        
        printer.close();
        reader.close();
        kb.close();
    }
    
    

}

