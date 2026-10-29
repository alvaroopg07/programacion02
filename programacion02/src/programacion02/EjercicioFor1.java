package programacion02;

import java.util.Scanner;

public class EjercicioFor1 {

	public static void main(String[] args) {
		/*
		 * Escribir una aplicación para aprender a contar, que pedirá un número n y
		 * mostrará todos los números del 1 a n.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}

		sc.close();
	}

}
