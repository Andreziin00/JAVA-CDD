package FOR;

import java.util.Scanner;

public class arrayFor {
	public static void main(String[] args) {
		int[] arr = new int[4];
		Scanner entrada = new Scanner(System.in);
		for (int i : arr) {
			System.out.print("digite o valor para o array: ");
			int value = entrada.nextInt();
			arr[i] = value;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
