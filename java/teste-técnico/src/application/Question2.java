package application;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma string: ");
		String entrada = scanner.nextLine();
		scanner.close();

		int quantidade = contaLetraA(entrada);

		if (quantidade > 0) {
			System.out.println("A letra 'a' ocorre " + quantidade + " vez(es) na string.");
		} else {
			System.out.println("A letra 'a' não ocorre na string.");
		}
	}

	public static int contaLetraA(String entrada) {
		int quantidade = 0;
		for (char c : entrada.toLowerCase().toCharArray()) {
			if (c == 'a') {
				quantidade++;
			}
		}
		return quantidade;
	}
}