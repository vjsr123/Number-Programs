package ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be checked ");
		int num = scan.nextInt();
		
		// TODO Auto-generated method stub

	}
	public static void armstrong(int x)
	{
		int result =0;
		int count =0;
		int sum=0;
		while (x>0)
		{
		result=result+x%10;
		x=x/10;
		count++;
		}
		for(int i=1;i<=count;i++)
		{
			sum=sum+result;
		}
		
	}

}
