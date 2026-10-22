package programacion02;

import java.util.Scanner;

public class EjercicioDoWhile3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;

		do {
			System.out.println("Introduce el primer numero");
			num1 = sc.nextInt();

			System.out.println("Introduce el segundo numero");
			num2 = sc.nextInt();

		} while (num1 != num2);

		System.out.println("Los dos numereos son iguales");

		sc.close();

	}

}
