package com.ar.javabasics;

import java.util.Scanner;

/**
 * You are given N sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.
	Suppose we have six sticks of the following lengths:
		5 4 4 2 2 8
	Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation four sticks are left (of non-zero length), whose lengths are the following: 
		3 2 2 6
	The above step is repeated until no sticks are left.
	Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations.
	Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).
	Input Format:
		The first line contains a single integer N. 
		The next line contains N integers: a0, a1,...aN-1 separated by space, where  represents the length of the  stick.
	Output Format:
		For each operation, print the number of sticks that are cut, on separate lines.
	Constraints:
		1 < N < 1000
		1 < ai < 1000
	Sample Input:
		8
		1 2 3 4 3 3 2 1
	Sample Output:
		8 6 4 1
 */
public class CutTheSticks {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		System.out.println("Ingrese la longitud final del Array");
		final int N = in.nextInt();

		//Por precondicicion el array no puede tener mas de 1000 posiciones
		final int[] sticks = new int[1000];
		for (int i = 0; i < N; i++) {
			System.out.println("Ingrese un stick: ");
			final int stickLen = in.nextInt();
			sticks[stickLen]++;
		}

		int remainingSticks = N;
		for (int i = 0; i < sticks.length; i++) {
			if (sticks[i] > 0) {
				remainingSticks -= sticks[i];
				if (remainingSticks == 0) {
					break;
				}
				System.out.println(remainingSticks);
			}
		}

		in.close();
	}
}