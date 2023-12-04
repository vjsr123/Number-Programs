package PowerN;

import java.util.Scanner;

public class PowerNApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base number");
		int a = scan.nextInt();
		System.out.println("Enter the exponent number");
		int b = scan.nextInt();
		PowerN.powern(a,b);
		
		// TODO Auto-generated method stub

	}

}
