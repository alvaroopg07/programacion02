package programacion02;

import java.util.Scanner;

public class EjercicioFor9 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que muestre un menú. Cuando seleccionamos una de las
		 * opciones, las ejecuta y vuelve a mostrar el menú. Cuando insertamos cualquier
		 * otro entero, termina.
		 */

		Scanner sc = new Scanner(System.in);

		for (int opcion = 1; opcion >= 1 && opcion <= 4;) {
			System.out.println("1. Opción 1.");
			System.out.println("2. Opción 2.");
			System.out.println("3. Opción 3.");
			System.out.println("4. Opción 4.");
			System.out.println("5. Salir.");

			opcion = sc.nextInt();

			if (opcion >= 1 && opcion < 5) {
				System.out.printf("Ejecutando la opción %d .\n", opcion);
			} else {
				System.out.println("Saliendo.....");
				break;
			}
		}

		sc.close();
	}

}
