package programacion02;

import java.util.Scanner;

public class EjercicioFor3 {

	public static void main(String[] args) {
		/*
		 * Pedir diez números enteros por teclado y mostrar la media.
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		int num;
		int suma = 0;
		double media;

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un valor");
			num = sc.nextInt();
			suma = suma + num;
		}
		media = suma / 10.0;
		System.out.printf("La media es: %f \n", media);

		sc.close();
	}

}
