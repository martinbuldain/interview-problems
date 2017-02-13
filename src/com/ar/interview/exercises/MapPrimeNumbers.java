package com.ar.interview.exercises;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Martin
 *
 *         Dado un numero natural, retornar un Map<String, Integer> en donde:
          -el primer parárametro es el factor
          -y el segundo parametro es la potencia Ejemplo: 10 = 2^1 * 5^1 100 = 2^2 * 5^2
 */

public class MapPrimeNumbers {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		Integer number = 8;
		map = factorize(number);

		// Iterar un Map con JDK 1.8
		map.forEach((k, v) -> System.out.println("Factor : " + k + " Potencia : " + v));

	}

	public static Map<String, Integer> factorize(Integer n) {

		Map<String, Integer> result = new HashMap<>();

		int divisor = 2;

		if (n > 1) {
			for (int i = 0; i <= n+1; i++) {
				if (n % divisor == 0) {
					n = n / divisor;
					String key = String.valueOf(divisor);
					if (result.containsKey(key))
						result.put(key, result.get(key) + 1);
					else
						result.put(key, 1);
				} else
					divisor++;

			}
		}

		return result;

	}

}
