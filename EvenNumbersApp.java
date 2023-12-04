package EvenNumbers;

import java.util.Scanner;

public class EvenNumbersApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the n value");
		int a= scan.nextInt();
		Evennumbers.neven(a);

	}

}
