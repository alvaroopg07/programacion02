package programacion02;

import java.util.Scanner;

public class EjercicioDoWhile1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		do {
			System.out.println("Introduce un numero");
			num = sc.nextInt();

		} while (num < 1 || num > 10);

		System.out.printf("¡Correcto! Has introducido el número: %d ", num);

		sc.close();

	}

}
