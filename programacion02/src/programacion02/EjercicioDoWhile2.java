package programacion02;

import java.util.Scanner;

public class EjercicioDoWhile2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String caracter;

		do {
			System.out.println("Introduce una vocal");
			caracter = sc.next().toLowerCase();

		} while (!caracter.equals("a") && !caracter.equals("e") && !caracter.equals("i") && !caracter.equals("o")
				&& !caracter.equals("u"));

		System.out.printf("¡Correcto! Has introducido una vocal: %s ", caracter);

		sc.close();

	}

}
