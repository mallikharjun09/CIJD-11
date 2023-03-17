package com.tmf.ce.examples;

import java.util.List;
import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		List lst = new ArrayList();
		lst.add(15);
		lst.add("Welcome");
		lst.add(465465456465465L);
		lst.add(45.362f);
		lst.add(true);
		lst.add("Welcome");
		lst.add(24);
		lst.add("Welcome15645484");
		lst.add(15);
		lst.add(24);
		
		/*
		 * for(int i=0;i<lst.size();i++) {
		 *       System.out.println(lst.get(i));
		 * }
		 */
		/*
		for(Object x : lst) {
			System.out.println(x);
		}
		*/
		
		//System.out.println(lst);
		
		lst.forEach(i->System.out.println(i));
	}
}
