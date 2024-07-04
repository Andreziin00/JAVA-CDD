package ex;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite um texto qualquer: ");
		String text = scan.nextLine().toUpperCase();		
		System.out.println(text);
	}

}
