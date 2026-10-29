package programacion02;

import java.util.Scanner;

public class EjercicioFor8 {

	public static void main(String[] args) {
		/*
		 * Pedir 5 calificaciones de alumnos y decir al final cuantos suspensos hay.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int suspensos = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.printf("Introduce la %d calificacion\n", i);
			double calificacion = sc.nextDouble();

			if (calificacion < 5) {
				suspensos++;
			}
		}

		System.out.printf("Hay un total de : %d suspensos", suspensos);

		sc.close();
	}

}
