/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 */

package org.example;
import  java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Necessary Variable Declaration
        Scanner input = new Scanner(System.in);
        int principal, years, compound;
        double rate,a, newRate;

        //Query
        System.out.println("What is the principal amount?");
        principal = input.nextInt();

        System.out.println("What is the rate (in percent)?");
        rate = input.nextDouble();

        System.out.println("What is the number of years?");
        years = input.nextInt();

        System.out.println("What is the number of times the interest is compounded yearly?");
        compound = input.nextInt();

        //Calculation
        newRate = rate / 100;
        a = principal * Math.pow((1 + newRate/compound),(compound * years));

        //Final output
        System.out.println(principal + " invested at " + rate + " for " + years + " years compounded " + compound + " times per year is:");
        System.out.format("$%.2f", a);
    }
}
