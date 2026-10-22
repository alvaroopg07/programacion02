package programacion02;

import java.util.Scanner;

public class EjercicioWhile2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		double suma = 0.0;
		double promedio = 0.0;

		while (num < 10) {
			System.out.println("Ingresa un valor: ");
			int valor = sc.nextInt();
			suma = suma + valor;
			num++;
		}
		promedio = suma / 10;
		System.out.printf("La suma de los valores es de: %.2f \n", suma);
		System.out.printf("El promedio es de : %.2f\n", promedio);

		sc.close();
	}

}
