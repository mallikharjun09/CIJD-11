package com.tmf.ce.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfListOfNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("Enter a number ");
		int x = scan.nextInt();
		
		while(x!=0) {
			lst.add(x);
			System.out.println("Enter a number ");
			x = scan.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<lst.size();i++) {
			sum += lst.get(i);
		}
		System.out.println("The sum is "+sum);
	}
}
