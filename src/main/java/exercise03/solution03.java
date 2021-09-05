/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Mozo
 */
/*
Psuedo
ask user for a quote using print
gather the quote with scanner(system.in)(keyboard) and assign to a string
ask who said the quote with a print
gather the author with scanner(system.in)(keyboard) and assign to another string
print out the author and quote along with the desired output
 */
package exercise03;
import java.util.Scanner;

public class solution03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the quote?");
        String quote = input.nextLine();

        System.out.println("Who said it?");
        String author = input.nextLine();

        System.out.println(author+ " says, \""+quote+"\"");
    }

}
