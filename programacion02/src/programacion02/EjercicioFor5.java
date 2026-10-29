package programacion02;

import java.util.Scanner;

public class EjercicioFor5 {

	public static void main(String[] args) {
		/*
		 * Diseñar un programa que muestre la suma de los 10 primeros números impares
		 * empezando desde el 0
		 */

		Scanner sc = new Scanner(System.in);

		int suma = 0;
		
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 1) {
				suma = suma + i;

			}
		}

		System.out.printf("La suma de los 10 primeros impares es de: %d\n", suma);

		sc.close();
	}

}
