package boletin21Bucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		/*
		 * Pide una cadena y dos caracteres por teclado (valida que sea un carácter),
		 * sustituye la aparición del primer carácter en la cadena por el segundo
		 * carácter.
		 */
		Scanner sc = new Scanner(System.in);

		String cadena = "";
		String caracter1 = "";
		String caracter2 = "";

		System.out.println("Introduce una cadena de texto");
		cadena = sc.next();

		do {
			System.out.println("Introduce el carácter a sustituir:");
			caracter1 = sc.next();

		} while (caracter1.length() != 1);

		do {
			System.out.println("Introduce el nuevo carácter:");
			caracter2 = sc.next();

		} while (caracter2.length() != 1);

		String cadenaFinal = cadena.replace(caracter1, caracter2);

		System.out.println("La cadena resultante es:");
		System.out.println(cadenaFinal);

		sc.close();

	}
}