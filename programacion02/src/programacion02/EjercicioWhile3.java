package programacion02;

import java.util.Scanner;

public class EjercicioWhile3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();

		while (num != 0) {

			if (num % 2 == 0) {
				System.out.println("Es par");

			}

			System.out.println("Introduce otro numero (0 para salir): ");
			num = sc.nextInt();

		}

		sc.close();
	}

}
