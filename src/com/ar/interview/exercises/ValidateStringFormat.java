package com.ar.interview.exercises;

/**
 * -Dado un string validar que este bien formado, tomando en cuenta los simbolos {} [] (). Es decir, debe estar abierto y cerrado.
 */

public class ValidateStringFormat {
	
	public static void main(String[] args) {
		boolean cadenaOk = validateString("asdasdas");
		boolean cadenaNotOk = validateString("asdasdas(");
		System.out.println(cadenaOk);
		System.out.println(cadenaNotOk);
	}

	public static boolean validateString(String word) {
		int stackCorchetes = 0;// []
		int stackParentesis = 0;// ()
		int stackLlaves = 0;// {}
		for (int i = 0; i < word.length(); i++) {
			Character c = word.charAt(i);
			if (c.equals('{')) {
				stackLlaves++;
			} else if (c.equals('[')) {
				stackCorchetes++;
			} else if (c.equals('(')) {
				stackParentesis++;
			}
			if (c.equals('}')) {
				stackLlaves--;
				if (stackLlaves < 0) {
					return false;
				}
			} else if (c.equals(']')) {
				stackCorchetes--;
				if (stackCorchetes < 0) {
					return false;
				}
			} else if (c.equals(')')) {
				stackParentesis--;
				if (stackParentesis < 0) {
					return false;
				}
			}
		}

		return (stackCorchetes == 0) && (stackLlaves == 0) && (stackParentesis == 0);
	}
}