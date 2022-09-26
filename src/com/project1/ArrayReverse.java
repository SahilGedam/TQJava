package com.project1;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = new char[5];
		System.out.println("enter elements in char value");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.next().charAt(0);
		}
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.println(c[i]);
		}
	}
}
