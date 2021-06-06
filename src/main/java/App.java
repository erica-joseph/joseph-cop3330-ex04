import java.util.Scanner;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        int count = 0;
        System.out.print( "Enter a noun: " );
        String noun= sc.nextLine();

        System.out.print( "Enter a verb: " );
        String verb= sc.nextLine();

        System.out.print( "Enter an adjective: " );
        String adj= sc.nextLine();

        System.out.print( "Enter an adverb: " );
        String adv= sc.nextLine();

        System.out.print("Do you "+ verb + " " + "your " + adj + " " + noun+ " "+ adv + ""+"? " + "That's hilarious!");
    }
}

