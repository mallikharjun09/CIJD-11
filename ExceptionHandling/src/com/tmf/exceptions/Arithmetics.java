package com.tmf.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmetics {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int x=0,y=0;
		try {
			x = scan.nextInt();
			y = scan.nextInt();
			System.out.println(x/y);
		} catch (InputMismatchException e) {
			System.out.println("Please enter integers only");
		}catch(ArithmeticException e) {
			System.out.println("Result is undefined ");
		}
		finally {
		    System.out.println("Thank you for using my program..");
		}
	}
}
