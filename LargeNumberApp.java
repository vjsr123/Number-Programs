package LargeNumber;

import java.util.Scanner;

public class LargeNumberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = scan.nextInt();
		LargeNumber.largen(a);
	}

}
