package com.ar.javabasics;

import java.util.HashMap;
import java.util.Map;

/**
 * Dado un número entero natural, ésta clase calcula el factorial de numeros primos y los retorna en base elevado a la potencia correspondiente
 * dentro de una estructura Map<Integer, Integer>. Solucion 1
 *
 */
public class NumerosPrimosMap {
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = primeFactors(44);

		System.out.println("Numeros primos de 44");
		map.forEach((k, v) -> System.out.println(k + "^" + v));
        
        System.out.println("Numeros primos de 3");
        map = primeFactors(3);
        map.forEach((k, v) -> System.out.println(k + "^" + v));
        
        System.out.println("Numeros primos de 32");
        map = primeFactors(32);
        map.forEach((k, v) -> System.out.println(k + "^" + v));
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
