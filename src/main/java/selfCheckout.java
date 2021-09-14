/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.Scanner;
public class selfCheckout {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final double TAX = 0.055;

        System.out.print("Enter the price of item 1: ");
        double item1 = sc.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        int quant1 = sc.nextInt();

        System.out.print("Enter the price of item 2: ");
        double item2 = sc.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        int quant2 = sc.nextInt();

        System.out.print("Enter the price of item 3: ");
        double item3 = sc.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        int quant3 = sc.nextInt();


        double subTot = ((item1*quant1)+(item2*quant2)+(item3*quant3));
        double total = subTot + (subTot * TAX);
      float tax = (float)(total - subTot);

        System.out.print("Subtotal: $"+subTot+"\nTax: $"+tax+"\nTotal: $"+total);


    }
}
