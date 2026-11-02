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
		String cadena = "";
		String caracter = "";

		System.out.println("Introduce una cadena de texto");
		cadena = sc.nextLine();
		do {

			System.out.println("Introduce un carácter a buscar:");
			caracter = sc.nextLine();

			if (caracter.length() == 0) {
				System.out.println("Error. Debes introducir un solo carácter.");
			}

		} while (caracter.length() != 1);
		char letraABuscar = caracter.charAt(0); 
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {

			if (cadena.charAt(i) == letraABuscar) {
				contador++; 
			}
		}

		System.out.printf("El carácter  %c aparece %d veces.",letraABuscar,contador);

		sc.close();
	}

}
