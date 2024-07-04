package FOR;

import java.util.Scanner;

public class javaEX07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double acumulo = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("digite a nota do aluno: ");
			double value = input.nextDouble();
			acumulo += value;
		}
		double media = acumulo / 5;
		System.out.printf("media: " + media);
	}

}
