package com.sample;

public class ArrayInitialization {

	public static void main(String[] args) {
		int[][] array1 = new int[2][2];
		array1[0] = new int[2];
		array1[1] = new int[]{ 1, 2, 3, 4, };
		for (int[] a: array1) {
			for (int j: a) {
				System.out.print(j + ", ");
			}
			System.out.println();
		}

		int[][] array2= {
			{ 1, 2 },
			{ 3, 4, 5 }
		};
		System.out.println(array2[0].length + ", " + array2[1].length);
	}
}
