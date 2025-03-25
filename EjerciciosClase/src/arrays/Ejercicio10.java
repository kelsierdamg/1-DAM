package arrays;

import java.util.Arrays;

public class Ejercicio10 {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		arr1[2]=2;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
