package bolein23Funciones;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero entero");
		int num = sc.nextInt();

		int resultado = digitos(num);
		System.out.printf("El número tiene %d dígitos.\n", resultado);

		int resultadoVolteado = voltea(num);
		System.out.printf("El número volteado es: %d\n", resultadoVolteado);

		if (esPrimo(num)) {
			System.out.printf("El número %d SÍ es primo.\n", num);
		} else {
			System.out.printf("El número %d NO es primo.\n", num);
		}

		int siguiente = siguientePrimo(num);
		System.out.printf("El siguiente primo mayor que %d es el %d\n", num, siguiente);

		if (esCapicua(num)) {
			System.out.printf("El numero %d si es capicua\n", num);
		} else {
			System.out.printf("El numero %d no es capicua\n", num);
		}

		System.out.println("Introduce la posición del dígito que quieres extraer (empezando por el 0):");
		int posicion = sc.nextInt();
		int digito = digitoN(num, posicion);
		System.out.printf("El dígito en la posición %d es: %d\n", posicion, digito);

		sc.close();
	}

	public static int digitos(int entero) {

		if (entero == 0) {
			return 1;
		}
		int contador = 0;
		while (entero != 0) {
			entero = entero / 10;
			contador++;
		}

		return contador;
	}

	public static int voltea(int entero) {
		int contador = 0;
		while (entero != 0) {
			int ultimoDigito = entero % 10;
			contador = (contador * 10) + ultimoDigito;
			entero = entero / 10;
		}
		return contador;
	}

	public static boolean esPrimo(int entero) {
		if (entero <= 1) {
			return false;
		}

		for (int i = 2; i < entero; i++) {
			if (entero % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static int siguientePrimo(int entero) {
		int candidato = entero + 1;

		while (!esPrimo(candidato)) {
			candidato++;
		}

		return candidato;
	}

	public static boolean esCapicua(int entero) {
		if (entero < 10) {
			return true;
		}
		if (entero == voltea(entero)) {
			return true;
		} else {
			return false;
		}
	}

	public static int digitoN(int entero, int n) {
		int volteado = voltea(entero);

		for (int i = 0; i < n; i++) {
			volteado = volteado / 10;
		}

		// Usamos Math.abs() para asegurar que devolvemos un dígito positivo incluso si
		// el número era negativo.
		return Math.abs(volteado % 10);
	}
}