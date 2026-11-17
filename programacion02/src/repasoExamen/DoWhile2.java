package repasoExamen;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		/*
		 * Realiza un validador de caracteres en Java que lea un String que debe ser una
		 * vocal. NOTA: investiga la función .toUpperCase() o .toLowerCase() de String.
		 */
		Scanner sc = new Scanner(System.in);

		String vocal = "";

		do {
			System.out.println("Introduce una vocal");
			vocal = sc.next();
		} while (!vocal.equalsIgnoreCase("A") && !vocal.equalsIgnoreCase("E") && !vocal.equalsIgnoreCase("I")
				&& !vocal.equalsIgnoreCase("O") && !vocal.equalsIgnoreCase("U"));
		System.out.printf("Has introducido la vocal: %s", vocal);
		sc.close();
	}

}
