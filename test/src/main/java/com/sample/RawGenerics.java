package com.sample;

import java.util.List;
import java.util.ArrayList;
//import java.util.Collections;

public class RawGenerics {

	public static void main(String[] args) {
		//List p = new ArrayList();   // works with a warning
		List<Integer> p = new ArrayList<Integer>();   // works
		p.add(7);
		p.add(2);
		p.add(5);
		p.add(2);
		//p.sort();   // The method sort() is undefined for the type List
		p.sort((a, b) -> a - b);   // works
		//p.sort(null);   // works
		//Collections.sort(p);   // works
		System.out.println(p);
	}
}
