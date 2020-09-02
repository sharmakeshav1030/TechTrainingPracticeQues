package test02;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseWordWise(input));
		s.close();
	}

	public static String reverseWordWise(String str) {

		String word[] = str.split(" ");
		String reverse = "";

		for (int i = word.length - 1; i >= 0; i--) {
			reverse += word[i] + " ";
		}

		return reverse;
	}
	
}
