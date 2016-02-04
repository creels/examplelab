package edu.carrollcc.cis232;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
    	System.out.print("Enter a name: ");
        String name = keyboard.nextLine();
        
        System.out.printf("Hello %s!\n", name);
        
        keyboard.close();
    }
}
