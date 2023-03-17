package com.tmf.SMS.course.app;

import java.util.Scanner;

import com.tmf.SMS.course.model.Course;
import com.tmf.SMS.course.services.CourseServiceImpl;

public class CourseAPP {
	public static void main(String[] args) {
		CourseServiceImpl service = new CourseServiceImpl();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter course Id  ");
		int cid = scan.nextInt();
		System.out.println("Enter course Name ");
		String cname = scan.next();
		System.out.println("Enter the required Qualification ");
		String qual = scan.next();
		System.out.println("Enter the modules to be covered ");
		String mods = scan.next();
		System.out.println("Enter the duration of the course ");
		int duration = scan.nextInt();
		System.out.println("Enter the fee for the course ");
		double fee = scan.nextDouble();
		
		Course course = new Course(cid, duration, fee, cname, mods, qual);
		
		service.addCourse(course);
		System.out.println("Course has been inserted successfully..");
	}
}
