package com.project1;

import java.util.Scanner;

public class ArrayOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		System.out.println("enter elements in int value");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		int count=0;
		int avg;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				count++;
				sum = a[i] + sum;
			}

		}
		avg = sum / count;
		System.out.println("avererage of odd digits is = " +avg);
		System.out.println("count of odd digits is = "+count);
	}

}
