package repasoExamen;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		/*
		 * Diseñar un programa que muestre, para cada número introducido por teclado, si
		 * es par. El proceso se repetirá hasta que el número introducido sea 0.
		 */
		Scanner sc = new Scanner(System.in);

		int numero = 0;
		System.out.println("Introduce un numero");
		numero = sc.nextInt();

		while (numero != 0) {
			if (numero % 2 == 0) {
				System.out.println("El numero introducido es par");

			}
			System.out.println("Introduce otro número (0 para terminar):");
			numero = sc.nextInt();

		}
		sc.close();
	}

}
