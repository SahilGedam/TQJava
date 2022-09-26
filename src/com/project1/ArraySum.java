package com.project1;

import java.util.*;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		System.out.println("enter elements in int value");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = a[i] + sum;

		}
		System.out.println(sum);
	}

}
