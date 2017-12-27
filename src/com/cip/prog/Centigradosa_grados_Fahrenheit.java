package com.cip.prog;

/*
 * La clase Scanner de Java provee métodos para leer valores de entrada
 * de varios tipos y está localizada en el paquete java.util.Los valores de entrada
 * pueden venir de varias fuentes, ya sea desde teclado o desde fichero */

import java.util.Scanner;

public class Centigradosa_grados_Fahrenheit {

	public static void main(String[] args) {

		/*
		 * Para utilizar esa clase tenemos que crear primero un objeto de ella para
		 * poder invocar sus métodos
		 */
		/*
		 * Scanner sc= new Scanner(System.in);
		 * 
		 * /* En la declaración de una variable debe indicarse explícitamente el
		 * identificador de la variable y el tipo de dato asociado. El tipo de dato
		 * determina el espacio reservado en memoria, los diferentes valores que puede
		 * tomar la variable y las operaciones que pueden realizarse con ella
		 */
		/*
		 * Float C;
		 * 
		 * Float F;
		 * 
		 * // Indicamos la pregunta que debe hacernos
		 * 
		 * System.out.println("Introduzca los grados centigrados ");
		 * 
		 * /* Se le indica que lea el dato de C (centigrados) que le hemos dado El
		 * método next() sirve para leer una palabra sola
		 */
		/*
		 * C = sc.nextFloat();
		 * 
		 * // Se le indica la operacion que debe realizar
		 * 
		 * F = (C * 9 / 5) + 32;
		 */
		// De esta manera se nos presentara el resultado

		/*
		 * System.out.println(C + " grados Centigrados" + " es igual a " + F +
		 * " grados Fahrenheit ");
		 * 
		 * /* Al darle a run para que compile nos pedirá que introduzcamos los grados
		 * Centigrados para inmediatamente despues de operar como hemos programado nos
		 * mostrará el resultado de los Fahrenheit equivalente
		 */
		/*
		 * sc.close();
		 */

		
		
		
		// Esta segunda parte del programa calcula el caso contrario de grados
		// Fahrenheit
		// a grados Centígrados

		Scanner sc = new Scanner(System.in);

		Float Centigrados;

		Float Fahrenheit;

		System.out.println("Introduzca los grados Fahrenheit ");

		Fahrenheit = sc.nextFloat();

		Centigrados = (float) ((Fahrenheit - 32) / 1.8);

		System.out.println(Fahrenheit + " grados Fahrenheit" + " es igual a " + Centigrados + " grados  Centigrados  ");

		sc.close();

	}

}
