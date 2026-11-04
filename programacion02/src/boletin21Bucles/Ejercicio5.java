package boletin21Bucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que vaya pidiendo números positivos hasta que se
		 * introduzca un cero y nos diga cuantos números se han introducido, la media de
		 * los impares y el mayor de los pares. El cero sólo se utiliza para indicar el
		 * final de la introducción de datos pero no se incluye en el cómputo.
		 */
		Scanner sc = new Scanner(System.in);

		int total = 0;
		int sumaImpares = 0;
		int contadorImpares = 0;
		int mayorPares = 0;

		System.out.println("Introduce un numero:");
		int num = sc.nextInt();

		while (num != 0) {

			total++;

			if (num % 2 == 0) { // SI ES PAR...

				// Comprobamos si es el mayor de los pares
				if (num > mayorPares) {
					mayorPares = num;
				}

			} else { // SI NO ES PAR, ES IMPAR...

				// Sumamos el impar y lo contamos
				sumaImpares = sumaImpares + num;
				contadorImpares++;
			}

			// Pedimos el siguiente número DENTRO del bucle
			System.out.println("Introduce un numero (0 para salir):");
			num = sc.nextInt();
		}

		System.out.println("Total de números introducidos: " + total);
		System.out.println("El mayor número par es: " + mayorPares);

		// Calculamos la media asegurándonos de que no dividimos entre 0
		if (contadorImpares > 0) {
			double media = (double) sumaImpares / contadorImpares;
			System.out.println("La media de los números impares es: " + media);
		} else {
			System.out.println("No se introdujeron números impares.");
		}

		sc.close();
	}

}