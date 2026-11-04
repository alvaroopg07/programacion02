package programacion02;

import java.util.Scanner;

public class EjercicioBuclesDependienteVariante1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un numero");
		int valor = sc.nextInt();

		for (int fila = 1; fila <= valor; fila++) {
			
			for (int columna = 1; columna <= fila; columna++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

		sc.close();
	}



	}


