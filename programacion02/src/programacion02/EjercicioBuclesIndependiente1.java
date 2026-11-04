package programacion02;

public class EjercicioBuclesIndependiente1 {

	public static void main(String[] args) {

		/*
		 * Diseñar una programa que muestre las tablas de multiplicar del 1 al 10.
		 * 
		 */

		for (int i = 1; i <= 10; i++) {

			System.out.printf("Tabla del: %d\n", i);

			for (int j = 1; j <= 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);

			}
			System.out.println("---------------------------");
		}
	}

}
