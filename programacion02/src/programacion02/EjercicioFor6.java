package programacion02;

import java.util.Scanner;

public class EjercicioFor6 {

	public static void main(String[] args) {
		/*
		 * Diseñar un programa que pida al usuario un número positivo y lo muestre
		 * unidad a unidad. Por ejemplo, para el número 123, debe mostrar primero el 3,
		 * a continuación el 2, y por último el 1.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Escriba un número positivo: ");
		int num = sc.nextInt();

		for (int n = num; n > 0; n = n / 10) {
			int unidad = n % 10;
			System.out.println(unidad);
		}

		sc.close();
	}
}