package com.ar.interview.exercises;

/**
 * 
 * @author Martin
 * 
 Se tiene la siguiente clase escrita en Java, que representa un árbol:
	class Tree {
		Tree getRightChild() {
 			// El método ya está implementado
		}

		Tree getLeftChild() {
			// El método ya está implementado
 		}

		int count() {
			// Implementar!
		}
	}
 */

public class CountTreeNodes {
	
	int count() {
		Tree leftTree = getLeftChild();
		Tree rigtTree = getRightChild();
		
		return 1 + (leftTree != null ? leftTree.count() : 0) + (rigtTree != null ? rigtTree.count() : 0);
	}

}
