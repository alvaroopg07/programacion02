package actividadesEvaluables;

import java.util.Scanner;

public class Actividad21 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que pida un número entero positivo y diga cuántos dígitos
		 * pares tiene y cuánto suman los dígitos pares. Usa long en lugar de int a la
		 * hora de pedir el número para admitir números largos.
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		long numero = 0;
		int contPares = 0;
		int sumPares = 0;
		long digito = 0;

		do {
			System.out.println("Introduce un numero entero positivo");
			numero = sc.nextLong();
		} while (numero <= 0);

		while (numero > 0) {
			digito = numero % 10;

			if (digito % 2 == 0) {
				contPares++;
				sumPares += digito;
			}

			numero = numero / 10;
		}

		System.out.printf("El número tiene %d dígitos pares.\n",contPares);
		System.out.printf("La suma de los dígitos pares es: %d", sumPares);

		sc.close();
	}

}
