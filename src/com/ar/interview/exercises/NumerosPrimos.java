package com.ar.interview.exercises;

import java.util.HashMap;
import java.util.Map;

/**
 * Dado un número entero natural, ésta clase calcula el factorial de numeros primos y los retorna en base elevado a la potencia correspondiente
 * dentro de una estructura Map<Integer, Integer>.
 *
 */
public class NumerosPrimos {
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = primeFactors(44);

		System.out.println("Numeros primos de 44");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey().toString() + "^" + entry.getValue());
        }
        
        System.out.println("Numeros primos de 3");
        map = primeFactors(3);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	System.out.println(entry.getKey().toString() + "^" + entry.getValue());
        }
        
        System.out.println("Numeros primos de 32");
        map = primeFactors(32);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	System.out.println(entry.getKey().toString() + "^" + entry.getValue());
        }
    }

	public static Map<Integer, Integer> primeFactors(int number) {
        int n = number;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 2; i <= n / i; i++) {
        	int contador = 0;
            while (n % i == 0) {
            	map.put(i, contador);
            	if (map.containsKey(i)) {
					contador++;
					map.put(i, contador);
				}else {
					map.put(i, contador);
				}
                n /= i;
            }
        }
        if (n > 1) {
        	map.put(n, 1);
        }
        return map;
    }
	
}
