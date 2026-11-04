package programacion02;

import java.util.Scanner;

public class EjercicioBuclesDependiente1 {

	public static void main(String[] args) {
		/*
		 * Pedir por consola un número n y dibujar un triángulo rectángulo de n
		 * elementos de lado, utilizando para ello asteriscos (*). Por ejemplo, para n=
		 * 4:
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un numero");
		int valor = sc.nextInt();

		for (int fila = 1; fila <= valor; fila++) {

			for (int columna = fila; columna <= valor; columna++) {
				System.out.print("* ");

			}
			System.out.println("");
		}

		sc.close();
	}

}
