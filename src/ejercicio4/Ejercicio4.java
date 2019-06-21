package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String tipo;
		String ref;
		int asientosOcupados;
		int aniosActivos;

		System.out.println("Inserte el tipo de tren: ");
		tipo = sc.nextLine();
		System.out.println("Inserte la referencia de tren: ");
		ref = sc.nextLine();
		System.out.println("Inserte el numero de asientos ocupados: ");
		asientosOcupados = Integer.parseInt(sc.nextLine());
		System.out.println("Inserte el numero de años que el tren esta en circulación: ");
		aniosActivos = Integer.parseInt(sc.nextLine());

		Tren t1 = new Tren(tipo, ref, asientosOcupados, aniosActivos);

		System.out.println(t1);

		if (t1.estaLleno()) {
			System.out.println("Tren lleno.");
		} else {
			System.out.println((Tren.CAPACIDAD_MAXIMA - asientosOcupados) + " billete/s restante/s.");
		}

		if (t1.esViejo()) {
			System.out.println("Fuera de circulación.");
		} else {
			System.out.println("En circulación.");
		}
		sc.close();
	}
}