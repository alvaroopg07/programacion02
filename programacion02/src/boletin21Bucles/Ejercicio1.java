package boletin21Bucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * Pide una cadena y un carácter por teclado (valida que sea un carácter) y
		 * muestra cuantas veces aparece el carácter en la cadena.
		 * 
		 */
		String caracter = "";

		System.out.println("Introduce una cadena de texto");
		String cadena = sc.nextLine();
		do {

			System.out.println("Introduce un carácter a buscar:");
			caracter = sc.next();

		} while (caracter.length() != 1);

		int contador = 0;

		for (int i = 0; i < cadena.length(); i++) {

			String c = cadena.substring(i, i + 1);

			if (c.equalsIgnoreCase(caracter)) {
				contador++;
			}
		}

		System.out.printf("El caracter %s aparece %d veces en la cadena %s \n", caracter, contador, cadena);

		sc.close();
	}

}
