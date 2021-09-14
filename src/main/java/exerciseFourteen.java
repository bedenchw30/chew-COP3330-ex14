/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 beden chew
 */
import java.util.Scanner;
public class exerciseFourteen {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double ordamount = input.nextDouble();

        input.nextLine();

        System.out.print("What is the state? " );
        String state=input.nextLine();

        if(state.equals("WI")){
            
            System.out.println("The subtotal is $"+ ordamount +".");
            double tax = ordamount * 0.055;

            System.out.println("The tax is $"+tax+".");
            double taxtot= ordamount + tax;

            System.out.println("The total is $" +taxtot+".");
        }
        else
            System.out.println("The total is $"+ordamount+".");
    }

}
