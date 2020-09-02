package test02;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = s.nextInt();
		int sum = 0;

		while (num > 0) {
			int i = num % 10;
			sum = sum + i;
			num = num / 10;
		}
		
		System.out.println("The sum of digits of the number is " + sum);

		s.close();
	}
}
