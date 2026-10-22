package programacion02;

import java.util.Scanner;

public class EjercicioDoWhile4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		double suma = 0.0;
		double promedio = 0.0;
		int valor;

		do {
			System.out.println("Ingresa un valor: ");
			valor = sc.nextInt();
			suma = suma + valor;
			num++;
		} while (num < 10);
		promedio = suma / 10;
		System.out.printf("La suma de los valores es de: %.2f \n", suma);
		System.out.printf("El promedio es de : %.2f\n", promedio);

		sc.close();
	}

}
