/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Ihosvany Marquez
 */


package Exercise8;

import java.util.Scanner;


public class Solution8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = scan.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = scan.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = scan.nextInt();

        int total = slices * pizzas;

        System.out.println(people + " people with " + pizzas + " pizzas (" + total + " slices in total)");

        int dividedSlices = total/people;

        if(total/people == 1)
        {
            System.out.println("Each person gets " + dividedSlices +" piece of pizza.");
        }
        else
        {
            System.out.println("Each person gets "+ dividedSlices +" pieces of pizza.");
        }
            System.out.println("There are "+(total % people)+" leftover pieces.");

    }
}
