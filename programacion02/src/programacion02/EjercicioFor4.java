package programacion02;

import java.util.Scanner;

public class EjercicioFor4 {

	public static void main(String[] args) {
		/*
		 * Implementar una aplicación que pida al usuario un número comprendido entre 1
		 * y 10. Hay que mostrar la tabla de multiplicar de dicho número, asegurándose
		 * de que el número introducido se encuentra en el rango establecido.
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int num = 0;
		System.out.println("Introduzca un número (de 1 a 10): ");
		num = sc.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);

			sc.close();
		}

	}
}
