package bolein23Funciones;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero");
		int num = sc.nextInt();

		long resFactorial = factorial(num);
		System.out.printf("El factorial de %d es: %d\n", num, resFactorial);

		int resFibo = fibonacci(num);
		System.out.printf("El término %d de Fibonacci es: %d\n", num, resFibo);
		
		System.out.println("Introduce el divisor para hacer una división entera:");
		int divisor = sc.nextInt();
		int resDiv = division(num, divisor);
		System.out.printf("El resultado de dividir %d entre %d es: %d\n", num, divisor, resDiv);

		int resVolteado = voltea(num);
		System.out.printf("El número volteado es: %d\n", resVolteado);

		System.out.println("Introduce el exponente para la potencia:");
		int exp = sc.nextInt();
		int resPotencia = potenciaRec(num, exp);
		System.out.printf("%d elevado a %d es: %d\n", num, exp, resPotencia);

		sc.close();
	}

	public static long factorial(int num) {
		if (num <= 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static int division(int dividiendo, int divisor) {
		if (dividiendo < divisor) {
			return 0;
		}
		return 1 + division(dividiendo - divisor, divisor);
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
	
	public static int potenciaRec(int base, int exp) {
		if (exp == 0) {
			return 1;
		}
		return base * potenciaRec(base, exp - 1);
	}
}