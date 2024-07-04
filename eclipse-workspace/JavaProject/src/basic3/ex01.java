package basic3;

import java.util.Scanner;

import java.util.StringTokenizer;	

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String str = " texto para retirar os espacos ";
		
		String strSemEspacos = str.trim();
		
		System.out.println(strSemEspacos);

		System.out.println(str);
		System.out.println();
		
		System.out.print("digite o seu nome completo: ");
		String nomeCompleto = scanner.nextLine();
		
		StringTokenizer tokenizer = new StringTokenizer(nomeCompleto);
		int numberTokens = tokenizer.countTokens();
		System.out.println("quantidade de palavras: "+ numberTokens);
		
		
		
		
		

	}

}
