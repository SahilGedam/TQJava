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
		for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}

}
