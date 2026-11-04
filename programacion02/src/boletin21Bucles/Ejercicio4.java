package boletin21Bucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de
		 * números a introducir). El programa debe informar de cuantos números
		 * introducidos son mayores que 0, menores que 0 e iguales a 0.
		 */
		Scanner sc = new Scanner(System.in);

		int mayores = 0;
		int menores = 0;
		int iguales = 0;

		System.out.println("¿Cuántos números vas a introducir?");
		int cantidad = sc.nextInt();
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduce un numero");
			int num=sc.nextInt();
			
			if (num>0) {
				mayores++;
			}else if (num<0) {
				menores++;
			}else if (num==0) {
				iguales++;
			}
		}

		System.out.printf("Números mayores que 0: %d \n",mayores);
		System.out.printf("Números menores que 0: %d\n", menores);
		System.out.printf("Números iguales a 0: %d\n", iguales);
		
		sc.close();
	}

}
