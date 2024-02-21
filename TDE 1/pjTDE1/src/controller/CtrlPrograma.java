package controller;

import java.util.Scanner;

public class CtrlPrograma {
//	** Erro **
	public static String zenitPolar(String str) { // Z-P / E-O / N-L / I-A / T-R
		String[] abc = { "P", "O", "L", "A", "R", "Z", "E", "N", "I", "T" };
		String[] zenit = { "Z", "E", "N", "I", "T", "P", "O", "L", "A", "R" };

		str = str.toUpperCase();

		for (int i = 0; i < str.length(); i++) {
			str = str.replace(abc[i], zenit[i]);
		}
		System.out.println(str);

		return str;
	}

	public static boolean checkPrimo(int num) {
		if (num <= 1) {
			return false;
		} else {
			for (int divisor = 2; divisor < num; divisor++) {
				if (num % divisor == 0)
					return false;
			}
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String numEx, zenitStr;
		int primoNum;

		System.out.println("Digite o código correspondente");
		System.out.println("Menu de exercícios:");
		System.out.println("1 - Codificação ZenitPolar");
		System.out.println("2 - Checagem número primo");

		numEx = scan.nextLine();

		switch (numEx) {
		case "1":
			System.out.println("Codificação ZenitPolar");
			System.out.println("Digite algo: ");
			zenitStr = scan.nextLine();

			zenitPolar(zenitStr);
			break;
		case "2":
			System.out.println("\nChecagem número primo");
			System.out.println("Digite um número inteiro: ");
			primoNum = Integer.parseInt(scan.nextLine());

			System.out.println(checkPrimo(primoNum));
			break;
		default:
			System.out.println("\nCódigo incorreto");
		}
		System.out.println("**Encerrando Aplicação**");
	}
}
