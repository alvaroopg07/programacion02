package repasoExamen;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		/*
		 * Realiza un validador de enteros en Java que lea un número entero cuyo rango
		 * debe estar entre 1 y 10
		 */
		Scanner sc = new Scanner(System.in);
		int numero = 0;

		do {
			System.out.println("Introduce un numero");
			numero=sc.nextInt();
		} while (numero<0 || numero>10);
		
		System.out.printf("¡Número validado correctamente! Has introducido: %d",numero );
		
		sc.close();
	}

}
