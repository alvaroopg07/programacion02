package boletin24;

import java.util.Random;
import java.util.Scanner;

public class ActividadFunciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		adivinaNumero(sc, rm);
		sc.close();
	}

	public static void adivinaNumero(Scanner sc, Random rm) {
		int numeroSecreto = rm.nextInt(100) + 1;
		int intentos = 10;
		int intentosUsados = 0;
		boolean acertado = false;

		System.out.println("¡Bienvenido al juego! He pensado un número del 1 al 100.");
		System.out.println("Tienes 10 intentos para adivinarlo.");

		while (intentos > 0 && !acertado) {
			System.out.println("Introduce tu numero");
			int numero = sc.nextInt();
			intentos--;
			intentosUsados++;

			if (numeroSecreto == numero) {
				acertado = true;
				System.out.printf("ENHORABUENA!! Has encontrado el número en %d intentos.\n", intentosUsados);
			} else if (numeroSecreto > numero) {
				System.out.println("El numero a adividar es mayor");
			} else {
				System.out.println("El numero es menor");
			}
			if (intentos > 0) {
				System.out.printf("Te quedan %d intentos.\n", intentos);
			}

		}
		if (!acertado) {
			System.out.println("¡Oh no! Te has quedado sin intentos.");
			System.out.printf("El número secreto era el: %d", numeroSecreto);
		}

	}
}
