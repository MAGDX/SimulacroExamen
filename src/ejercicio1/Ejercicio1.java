package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	/**
	 * A partir de los pesos de 30 boxeadores de un torneo se quiere visualizar
	 * mediante un mensaje explicativo cual es la categoria de cada uno de ellos,
	 * SIN USAR ARRAYS. Todos los datos necesarios para la ejecucion que no
	 * aparezcan de forma no explicita en el enunciado se van a solicitar al usuario
	 * por teclado. Controlar la entrada erronea de los pesos (que van a ser
	 * enteros), de manera que si el usuario insertara caracteres o un numero fuera
	 * de rango de los enteros se tratara el error a traves de la excepcion
	 * correspondiente, visualizando el mensaje. "Ha introducido datos sin el
	 * formato indicado o fuera del rango" y terminando la ejecucion de forma
	 * obligatoria. Para obtener la categoria de cada boxeador se tendra en cuenta
	 * el siguiente criterio: Pesado - su peso es superior a 90 kg. Mediano - su
	 * peso esta comprendido entre 65 y 90 kg. Ligero - su peso esta comprendido
	 * entre 58 y 64 kg. Pluma - su peso esta comprendido entre 52 y 57 kg. Mosca -
	 * su peso es inferior a 52 kg.
	 * 
	 * @param args
	 */

	public static final int NUM_BOXEADORES = 30;
	public static final int PESO_MEDIANO = 90;
	public static final int PESO_LIGERO = 64;
	public static final int PESO_PLUMA = 57;
	public static final int PESO_MOSCA = 51;

	public static void main(String[] args) {
		int peso;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < NUM_BOXEADORES; i++) {
			System.out.println("Inserte el peso del boxeador " + i + ": ");
			try {

				peso = Integer.parseInt(sc.nextLine());

				if (peso > PESO_MEDIANO) {
					System.out.println("Peso pesado");
				} else if (peso > PESO_LIGERO && peso <= PESO_MEDIANO) {
					System.out.println("Peso mediano");
				} else if (peso > PESO_PLUMA && peso <= PESO_LIGERO) {
					System.out.println("Peso ligero");
				} else if (peso > PESO_MOSCA && peso <= PESO_PLUMA) {
					System.out.println("Peso pluma");
				} else if (peso >= 0 && peso <= PESO_MOSCA) {
					System.out.println("Peso mosca");
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Ha introducido datos sin el formato indicado o fuera del rango.");
			}
		}
		sc.close();
	}
}