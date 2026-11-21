package repasoExamen;

public class Funcion1 {

	public static void main(String[] args) {

		System.out.println(sumar(4, 2));
		System.out.println(doble(8));

	}

	public static int sumar(int num1, int num2) {

		int suma = num1 + num2;

		return suma;
	}
	public static int doble(int num) {
		int doble = num*2;
		return doble;
	}
}
