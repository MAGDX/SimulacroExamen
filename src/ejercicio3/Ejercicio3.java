package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	final static int MAX_NUMEROS = 10;
	static int[] aNumeros = new int[MAX_NUMEROS];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sumatorio = 0;
		int n;
		int cont = 0;

		for (int i = 0; i < MAX_NUMEROS; i++) {
			
			System.out.println("Inserte el numero " + (i + 1) + "/" + MAX_NUMEROS + ": ");
			n = Integer.parseInt(sc.nextLine());

			aNumeros[i] = n;

			if (n % 7 == 0) {
				cont++;
			}
			sumatorio += n;
		}
		
		System.out.println("Has insertado " + cont + " multiplos de 7.");
		float media = sumatorio / MAX_NUMEROS;
		System.out.printf("La media es %.2f ", media);

		sc.close();
	}
}