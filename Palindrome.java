package Palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		int result=0;
		while(number>0)
		{
			int remainder=number%10;
			result = result+remainder;
			number=number/10;
		}
		System.out.println("The sum of digits of a number "+result);
	}
}
