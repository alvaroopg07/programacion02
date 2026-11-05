package actividadesEvaluables;

import java.util.Scanner;

public class Actividad22 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que lea una cadena por teclado y convierta las
		 * mayúsculas a minúsculas y viceversa.
		 */
		Scanner sc = new Scanner(System.in);

		String cadena = "";
		String resultado = "";
		String letra = "";

		do {
			System.out.println("Introduce una cadena de texto:");
			cadena = sc.next();
		} while (cadena.equals(""));

		for (int i = 0; i < cadena.length(); i++) {

			 letra = cadena.substring(i, i + 1);

			if (letra.equals(letra.toUpperCase())) {
				resultado += letra.toLowerCase();
			} else {
				resultado += letra.toUpperCase();
			}
		}

		System.out.printf("La cadena invertida es: %s\n", resultado);
		sc.close();
	}

}
