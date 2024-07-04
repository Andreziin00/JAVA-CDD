package FOR;

import java.util.Arrays;

public class javaEX08 {
	public static void main(String[] args) {
		double[] arr = { 23.13, 142.55, 4.3, 23.4, 24.5, 75.3, 24.7 };
		double[] arr2 = new double[arr.length];

		// PRINTA O ARRAY 1 E ARMAZENA OS VALORES CONTRARIO NO ARR2
		for (int o = 0; o < arr.length; o++) {
			System.out.print(arr[o] + " ");
			arr2[o] = arr[(arr.length - 1) - o];
		}
		System.out.println();
		// PRINTA O ARRAY 2
		for (int o = 0; o < arr2.length; o++) {
			System.out.print(arr2[o] + " ");
		}
		System.out.println();
		Arrays.sort(arr2);
		for (int o = 0; o < arr2.length; o++) {
			System.out.print(arr2[o] + " ");
		}
	}
}
