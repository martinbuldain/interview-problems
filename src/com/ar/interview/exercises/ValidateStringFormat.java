package com.ar.interview.exercises;

/**
 * 
 * @author Martin
 * 
 *         -Dado un string validar que este bien formado, tomando en cuenta los
 *         simbolos {} [] ().
 */

public class ValidateStringFormat {

	public boolean validateString(String word) {
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