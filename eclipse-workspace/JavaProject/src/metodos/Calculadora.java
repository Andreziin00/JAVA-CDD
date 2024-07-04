package metodos;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		SomarMetodos calc = new SomarMetodos();
		int flag = 0;
		while (flag == 0) {
			int mod = 0;
			System.out.print("digite qual operacao deseja fazer: somar [1] subtrair [2] multiplicar [3] sair [4]: ");
			flag = scanner.nextInt();

			if (flag == 4) {
				System.out.println("finalizando o programa!");
			}

			if (flag == 1) {
				System.out.print("quantos index?: 2 operandos [1], 3 operandos [2]");
				mod = scanner.nextInt();
				if (mod == 1) {
					System.out.println("digite o primeiro numero: ");
					int n1 = scanner.nextInt();
					System.out.println("digite o segundo numero: ");
					int n2 = scanner.nextInt();
					System.out.printf("soma: %d \n", calc.somar(n1, n2));
					flag = 0;
					mod = 0;
				}
			}

			if (flag == 2) {
				System.out.print("quantos index?: 2 operandos [1], 3 operandos [2]");
				mod = scanner.nextInt();
				if (mod == 1) {
					System.out.println("digite o primeiro numero: ");
					int n1 = scanner.nextInt();
					System.out.println("digite o segundo numero: ");
					int n2 = scanner.nextInt();
					System.out.printf("subtração: %d \n", calc.sub(n1, n2));
					flag = 0;
					mod = 0;
				}
			}

			if (flag == 3) {
				System.out.print("quantos index?: 2 operandos [1], 3 operandos [2]");
				mod = scanner.nextInt();
				if (mod == 1) {
					System.out.println("digite o primeiro numero: ");
					int n1 = scanner.nextInt();
					System.out.println("digite o segundo numero: ");
					int n2 = scanner.nextInt();
					System.out.printf("multiplicacao: %d \n", calc.mult(n1, n2));
					flag = 0;
					mod = 0;
				}
			}

			if (flag == 1) {
				System.out.print("quantos index?: 2 operandos [1], 3 operandos [2]");
				mod = scanner.nextInt();
				if (mod == 2) {
					System.out.println("digite o primeiro numero: ");
					int n1 = scanner.nextInt();
					System.out.println("digite o segundo numero: ");
					int n2 = scanner.nextInt();
					System.out.println("digite o terceiro numero: ");
					int n3 = scanner.nextInt();
					System.out.printf("soma: %d \n", calc.somar(n1, n2, n3));
					flag = 0;
					mod = 0;
				}
			}

			if (flag == 2) {
				System.out.print("quantos index?: 2 operandos [1], 3 operandos [2]");
				mod = scanner.nextInt();
				if (mod == 2) {
					System.out.println("digite o primeiro numero: ");
					int n1 = scanner.nextInt();
					System.out.println("digite o segundo numero: ");
					int n2 = scanner.nextInt();
					System.out.println("digite o terceiro numero: ");
					int n3 = scanner.nextInt();
					System.out.printf("subtração: %d \n", calc.sub(n1, n2, n3));
					flag = 0;
					mod = 0;
				}
			}

			if (flag == 3) {
				System.out.print("quantos index?: 2 operandos [1], 3 operandos [2]");
				mod = scanner.nextInt();
				if (mod == 2) {
					System.out.println("digite o primeiro numero: ");
					int n1 = scanner.nextInt();
					System.out.println("digite o segundo numero: ");
					int n2 = scanner.nextInt();
					System.out.println("digite o terceiro numero: ");
					int n3 = scanner.nextInt();
					System.out.printf("multiplicação: %d \n", calc.mult(n1, n2, n3));
					flag = 0;
					mod = 0;
				}
			}

		}
	}

}
