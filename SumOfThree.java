package hk222su_assign1;

import java.util.Scanner;

public class SumOfThree {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter three digit number: ");
		int numberOne = input.nextInt();
		int numberTwo = input.nextInt();
		int numberThree = input.nextInt();
		int sumOfNumbers = numberOne + numberTwo + numberThree;
		System.out.print("The sum of the digits is: " + sumOfNumbers);
	}
}
