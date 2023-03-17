package com.tmf.generics;

public class Swapping<T> {
	T a,b;
	
	public Swapping(T a,T b) {
		this.a = a;
		this.b = b;
	}
	
	public void swap() {
		T c = a;
		a = b;
		b = c;
	}
	
	public void show() {
		System.out.println("a = "+a+" and b = "+b);
	}
	
}
