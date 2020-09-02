package test02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Total count of numbers");
		int num = s.nextInt();
		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.println("Enter " + (i + 1) + " number");
			arr[i] = s.nextInt();
		}
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximum Num = " + max);
		
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum Num = " + min);
		s.close();

	}

}
