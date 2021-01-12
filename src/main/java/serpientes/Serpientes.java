package serpientes;

import java.util.Scanner;

public class Serpientes {

	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String introducido;
		do {
			System.out.println("----------------------------");
			int temperatura = medicionesTemperatura();
			int k = medicionesConsecutivas();
			int[] mediciones = medidas(temperatura);
			// resultado(mediciones, k);
			resultado2(mediciones, k);
			System.out.println("------------\n" 
					+ "¿Desea realizar otra medición? (Si/No)");
			s.nextLine();
			introducido = s.nextLine();
		} while (introducido.equals("Si"));

	}

	// Indicamos el número de mediciones de temperatura realizadas
	// Debe estar entre 1 y 100.
	public static int medicionesTemperatura() {
		int mediciones = 0;
		do {
			System.out.println("Introduzca el numero de mediciones " 
					+ "realizadas (este número debe ser 1 ≤ n ≤ 100)");
			mediciones = s.nextInt();
		} while (mediciones < 0 || mediciones > 101);
		return mediciones;
	}

	// Indicamos el número de mediciones consecutivas por debajo del
	// umbral que una serpiente es capaz de soportar entre dos mediciones
	// con temperatura alta.
	public static int medicionesConsecutivas() {
		System.out.println("Introduzca el número de mediciones consecutivas" 
				+ " por debajo del umbral (k): ");
		int k = s.nextInt();
		return k;
	}

	// Introducimos las medidas de temperatura:
	// 0 en caso de estar por debajo del umbral.
	// 1 en caso de estar por encima.
	public static int[] medidas(int longitud) {
		int[] temperatura = new int[longitud];
		int posible; // Usado para comprobar si el valor añadido es 1 ó 0.
		System.out.println("Introduzca las " + longitud + " mediciones:");
		for (int i = 0; i < longitud; i++) {
			posible = s.nextInt();
			if (posible != 0 && posible != 1) {
				System.out.println("El valor añadido no es válido.\n" 
						+ "Recuerde meter valores 1 ó 0");
				i--;
			} else {
				temperatura[i] = posible;
				System.out.println("El valor se ha añadido correctamente.");
			}
		}
		return temperatura;
	}

//	ESTE METODO NO FUNCIONA CORRECTAMENTE
	// Buscamos el periodo de longitud óptimo y el comienzo de la medición.
//	public static void resultado(int[] mediciones, int k) {
//		int longitudOptima = -1, comienzoMedicion = -1;
//		int tope = k, ceros = 0;
//		int posibleLongitud = 0, posibleComienzo = -1;
//		for (int i = 0; i < mediciones.length; i++) {
//			posibleLongitud++;
//			if (mediciones[i] == 1) {
//				if (posibleComienzo == -1) {
//					posibleComienzo = i + 1;
//				}
//				ceros = 0;
//			} else {
//				ceros++;
//				if (ceros > k) {
//					if (posibleLongitud > longitudOptima) {
//						longitudOptima = posibleLongitud;
//						comienzoMedicion = posibleComienzo;
//					}
//					posibleLongitud = 0;
//					posibleComienzo = -1;
//					ceros = 0;
//				}
//			}
//			if (posibleLongitud > longitudOptima) {
//				longitudOptima = posibleLongitud;
//				comienzoMedicion = posibleComienzo;
//			}
//		}
//		System.out.println("------------\n" 
//				+ "Resultado: El periodo óptimo tiene longitud " + longitudOptima
//				+ " y comienza en la medición " + comienzoMedicion);
//	}

	public static void resultado2(int[] mediciones, int k) {
		int longitudOptima = -1, comienzoMedicion = -1;
		int posibleFinal = -1, posibleComienzo = -1, longitudPosible = -1;
		int ceros = 0;
		// Recorremos las mediciones
		for (int i = 0; i < mediciones.length; i++) {
			// Comprobamos si existe una longitud optima anterior
			if ((posibleComienzo == -1) && (mediciones[i] == 1)) {
				// Introducimos el comienzo de nuestra longitud
				posibleComienzo = i + 1;
				longitudOptima = 1;
				comienzoMedicion = posibleComienzo;
			} else if (mediciones[i] == 1) {
				// Introducimos el final de nuestra longitud
				posibleFinal = i + 1;
				longitudPosible = posibleFinal - posibleComienzo  + 1;
				/* 
				 * PRUEBA 1
				System.out.println("Mostramos la longitud posible: " + longitudPosible);
				
				PRUEBA2
				// Comprobamos si es optima y valida
				System.out.println("El valor de cero es: "+ ceros + " El valor de k es: " + k 
						+ " Resultado:" + (ceros == k));
				*/
				if ((ceros <= k) && (longitudOptima <= longitudPosible)) {
					System.out.println("ENTRO AQUÍ ");
					longitudOptima = longitudPosible;
					comienzoMedicion = posibleComienzo;
				} else {
					// Si no es optima o valida cambiamos el valor de inicio de longitud
					posibleComienzo = i + 1;
				}
				//Ponemos el contador de ceros al valor inicial
				ceros = 0;
			}else {
				//Incrementamos el contador si es cero
				/* 
				 * PRUEBA 3
				 * System.out.println("Hemos encontrado un 0. Llevamos " + ceros);
				 */
				ceros++;
			}
		}
		System.out.println("------------\n" 
				+ "Resultado: El periodo óptimo tiene longitud " + longitudOptima
				+ " y comienza en la medición " + comienzoMedicion);
	}

}
