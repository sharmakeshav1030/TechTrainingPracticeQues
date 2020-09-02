package test02;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a four-digit number");
		int num = s.nextInt();
		int zeroes = 0, evenCount = 0, oddCount = 0;

		while (num > 0) {
			int i = num % 10;
			if (i == 0) {
				zeroes++;
			} else if (i % 2 == 0) { // to consider zero or not?. If no we will use i != 0.
				evenCount++;
			} else {
				oddCount++;
			}
			num = num / 10;
		}
		
		System.out.println("Zeroes = " + zeroes + "\nEvenCount = " + evenCount + "\nOdd Count = " + oddCount);

		s.close();
	}

}
