package com.gitdemo;

import java.util.Scanner;

public class LargestNo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept three numbers from the user
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();

        // Find the largest number
        double largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Calculate the average
        //double average = (num1 + num2 + num3) / 3;

        // Display the sum of the largest number and the average
        System.out.println("The sum of the largest number is: " + largest);
        //System.out.println("The average of the numbers is: " + average);

        scanner.close();
}
}
