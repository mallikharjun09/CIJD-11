package com.tmf.generics;

import java.util.List;

public class SwappingApp {
	public static void main(String[] args) {
		Swapping obj = new Swapping("Welcome","hello");
		obj.show();
		obj.swap();
		obj.show();
		
		Swapping<Integer> intObj = new Swapping<Integer>(15,18);
		intObj.show();
		intObj.swap();
		intObj.show();
		
		
	}
}


