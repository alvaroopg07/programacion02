package repasoExamen;

import java.util.Scanner;

public class Ejercicio1Repaso {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una palabra:");
		String cadena = sc.next();

		// 1. CREAMOS UNA VARIABLE NUEVA PARA GUARDAR EL RESULTADO
		String cadenaResultado = "";

		for (int i = 0; i < cadena.length(); i++) {

			String letra = cadena.substring(i, i + 1);

			// 2. COMPRAMOS LA VARIABLE 'letra' (NO 'cadena')
			if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I")
					|| letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {

				// Si es vocal, le pones el carácter nuevo (por ejemplo una 'X')
				cadenaResultado = cadenaResultado + "X";
			} else {
				// Si no es vocal, le sumas la letra normal
				cadenaResultado = cadenaResultado + letra;
			}
		}

		System.out.println("La cadena original era: " + cadena);
		System.out.println("La cadena final es: " + cadenaResultado); // IMPRIMES EL RESULTADO

		sc.close();
	}
}