package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int puntos;

		System.out.println("Inserte sus puntos: ");
		puntos = Integer.parseInt(sc.nextLine());

		if (ganar(puntos)) {
			System.out.println("Puedes ganar el campeonato.");
		} else {
			System.out.println("Ponte las pilas si quieres ganar.");
		}
		sc.close();
	}

	/**
	 * Funcion que calcula si el jugador tiene posibilidades de ganar el campeonato
	 * 
	 * @param puntos int Puntos de la clasificacion
	 * @return res = true si puntos es mayor que 70, res = false en caso de que puntos sea menor que 70
	 */
	private static boolean ganar(int puntos) {
		boolean res = false;

		if (puntos >= 70) {
			res = true;
		}
		return res;
	}
}