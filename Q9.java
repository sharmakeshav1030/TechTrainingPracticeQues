package test02;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = s.nextInt();
		int firstNum, lastNum;

		lastNum = num % 10;
		firstNum = num;
		
		while(firstNum >= 10)
	    {
	        firstNum /= 10;  
	    }
		
		System.out.println("Sum is: " + (firstNum + lastNum));
		s.close();
	}

}
