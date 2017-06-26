package com.ar.interview.exercises;

/**
 * 	Escribir un programa que imprima a pantalla los n�meros del 1 al 100, uno en cada l�nea, pero:
	- Si el n�mero es m�ltiplo de 3, en lugar del n�mero hay que imprimir �Coca�.
	- Si el n�mero es m�ltiplo de 5, en lugar del n�mero hay que imprimir �Cola�.
	- Si el n�mero es m�ltiplo de 3 y de 5, en lugar del n�mero hay que imprimir �CocaCola�.
 */

public class MultipleNumbers {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) 
				System.out.println("Coca");
			else if (i % 5 == 0)
				System.out.println("Cola");
			else if (i % (3 * 5) == 0)
				System.out.println("CocaCola");
			else
				System.out.println(i);
		}

	}

}
