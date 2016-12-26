package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

public class ListRemove {
	public static void main(String[] args) {
		String[] array = new String[]{"A", "B", "C", "D", "E"};
		List<List<String>> lists = new ArrayList<>();
		for (int i=0; i<array.length; i++) {
			List<String> list = new ArrayList<>();
			list.addAll(Arrays.asList(array));
			// If you add Arrays.asList(array) directly, you cannot change the list
			lists.add(list);
		}
		
		int i = 0;
		for (List<String> list: lists) {
			try {
				// this throws an exception except for removing "D"
				for (String str: list) {
					if (array[i].equals(str)) {
						System.out.println(array[i] + ", " + str);
						list.remove(str);
					}
				}
			} catch (ConcurrentModificationException cme) {
				System.out.println(cme);
			}
			i++;
		}
		
		for (List<String> list: lists) {
			System.out.println(list);
		}
	}
}
