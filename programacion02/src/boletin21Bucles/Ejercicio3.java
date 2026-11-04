package boletin21Bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Introducir una cadena de caracteres e indicar si es un palíndromo. Una
		 * palabra palíndroma es aquella que se lee igual adelante que atrás.
		 */

		Scanner sc = new Scanner(System.in);

		String cadena = "";
		String cadenaInvertida = "";


		do {
			System.out.println("Introduce una cadena de texto(min 3 caracteres)");
			cadena = sc.next();
			cadena = cadena.toLowerCase();


		} while (cadena.length() < 3);

		for (int i = cadena.length() - 1; i >= 0; i--) {

			String letra = cadena.substring(i, i + 1);

			cadenaInvertida = cadenaInvertida + letra;
		}

		if (cadena.equals(cadenaInvertida)) {
			System.out.println("¡Es un palíndromo!");
		} else {
			System.out.println("No es un palíndromo.");
		}

		sc.close();

	}

}
