package com.tmf.io;

public class MarksException extends Exception{
	public void showErrorMessage() {
		System.out.println("Marks should be in between 0 to 100");
	}
}
