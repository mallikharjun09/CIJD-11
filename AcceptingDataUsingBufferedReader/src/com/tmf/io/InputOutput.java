package com.tmf.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputOutput {
	public static void read() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int marks[] = new int[6];
		String subjects[] = {"English","Math","Science","Social","Language","Computer"};
		for(int i=0;i<6;i++) {
			int x = 0;
			try {
				System.out.println("Please enter subject "+subjects[i]+" Marks");
				x = Integer.parseInt(br.readLine());
				if(x<0 || x>100) {
					MarksException ex = new MarksException();
					throw ex;
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Please Enter integers only...");
				x = Integer.parseInt(br.readLine());
			}
			catch(MarksException e) {
				e.showErrorMessage();
				x = Integer.parseInt(br.readLine());
			}
			marks[i] = x;
		}
		System.out.println("Subject wise marks, total and average..");
		int total = 0;
		double avg = 0;
		for(int i=0;i<6;i++) {
			System.out.println(subjects[i]+" marks are "+marks[i]);
			total += marks[i];
		}
		System.out.println("Total marks are "+total);
		System.out.println("Average marks are "+(total/6.0));
		
	}
	
	public static void main(String[] args)throws IOException {
		read();
	}
}







