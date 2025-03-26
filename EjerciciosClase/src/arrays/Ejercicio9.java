package arrays;

import java.util.Arrays;

public class Ejercicio9 {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3};
		int arr2[] = {1, 2, 3};
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("IGUALES");
		}
		else {
			System.out.println("NO SON IGUALES");
		}
	}

}
