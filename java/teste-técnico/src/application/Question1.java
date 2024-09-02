package application;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		scanner.close();

		if (pertenceFibonacci(numero)) {
			System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
		}
	}

	public static boolean pertenceFibonacci(int numero) {
		int a = 0;
		int b = 1;

		if (numero == a || numero == b) {
			return true;
		}

		while (true) {
			int proximo = a + b;
			if (proximo == numero) {
				return true;
			} else if (proximo > numero) {
				return false;
			}
			a = b;
			b = proximo;
		}
	}
}
