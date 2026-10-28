package programacion02;

import java.util.Random;
import java.util.Scanner;

public class EjercicioDoWhile5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();

		int num1;
		int num2;
		int resultadoUser;
		int resultadoReal;
		int aciertos=0;

		do {
			num1 = rm.nextInt(100) + 1;
			num2 = rm.nextInt(100) + 1;
			resultadoReal = num1 + num2;
			System.out.printf("Cuanto es %d + %d ?", num1, num2);
			resultadoUser = sc.nextInt();

		} while (resultadoReal==resultadoUser);

		System.out.println("¡Fallaste! El resultado correcto era " + resultadoReal);
		System.out.printf("Has realizado %d operaciones correctamente.\n", aciertos);
		sc.close();
	}

}
