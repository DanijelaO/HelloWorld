package main.helloworld;

import java.util.Scanner;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Danijela Savic");
        
        int age = 18;
        
        if (age >= 18) {
            System.out.println ("Osoba je punoletna.");
        } else {
            System.out.println ("Osoba je maloletna.");
        }
        System.out.println ("Unesi broj godina.");
        Scanner input = new Scanner(System.in);
        int userAge = input.nextInt();
        
        System.out.println("Korisnik je uneo: " + userAge);
        
        if (userAge > 18) {
            System.out.println ("Osoba je punoletna.");
        } else {
            System.out.println ("Osoba je maloletna.");
        }
        
        System.out.println ("---------.");
        System.out.println ("Unesi broj godina.");
        Scanner input2 = new Scanner(System.in);
        int personAge = input2.nextInt();
        
        if (personAge > 0 && personAge <= 5) {
            System.out.println("Baby");
        }
        else if (personAge >= 6 && personAge <= 11) {
            System.out.println("Kid");
        }
        else if (personAge >= 12 && personAge <= 17) {
            System.out.println("Teen");
        }
        else if (personAge >= 18) {
            System.out.println("Adult");
        }
        else { 
            System.out.println("Invalid");
        }
        
        
    }
    
}
