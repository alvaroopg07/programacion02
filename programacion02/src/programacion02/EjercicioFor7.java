package programacion02;

import java.util.Scanner;

public class EjercicioFor7 {

	public static void main(String[] args) {
		/*
		 * Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se
		 * denota 5! y es igual a 5x4x3x2x1 = 120.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un numero positivo");
		int num=sc.nextInt();
		int factorial=1;
		
		for (int i = num; i >0; i--) {
			factorial=factorial*i;
			
		}
		
		System.out.printf("El factorial de %d es de: %d", num,factorial);

		
		
		sc.close();
	}

}
