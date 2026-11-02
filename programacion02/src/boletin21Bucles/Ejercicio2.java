package boletin21Bucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String cadena = "";
		String caracter1 = "";
		String caracter2 = "";

		System.out.println("Introduce una cadena de texto");
		cadena = sc.nextLine();
		
		do {
			System.out.println("Introduce el carácter a sustituir:");
			caracter1 = sc.nextLine();


			if (caracter1.length() != 1) { 
				System.out.println("Error. Debes introducir un solo carácter.");
			}
		} while(caracter1.length() != 1);
		
		
		do {
			System.out.println("Introduce el nuevo carácter:");
			caracter2 = sc.nextLine();

			if (caracter2.length() != 1) { 
				System.out.println("Error. Debes introducir un solo carácter.");
			}
		} while(caracter2.length() != 1);
		
		char char1 = caracter1.charAt(0);
		char char2 = caracter2.charAt(0); 
		
		String cadenaFinal = "";
		
		for (int i = 0; i < cadena.length(); i++) {
			char letraActual = cadena.charAt(i);
			
			if (letraActual == char1) {
				cadenaFinal = cadenaFinal + char2;
			} else {
				cadenaFinal = cadenaFinal + letraActual;
			}
		}
		
		System.out.println("La cadena resultante es:");
		System.out.println(cadenaFinal);
		
		sc.close();
		
		/*

		OTRA FORMA:
		Java
		tiene una herramienta que hace esto automáticamente sin usar bucles.


		String cadenaFinal = cadena.replace(char1, char2);
		*/
	}
}