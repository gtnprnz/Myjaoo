/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * HashMap exercise
 */
public class Exercise {
	/**
	 * Extract non-duplicated values in input and return them as a Collection, for
	 * example:
	 * <li>in {2, 3, 4, 4, 4, 5, 5, 5, 6, 7} -> out {2, 3, 6, 7}
	 * <li>in {4, 5, 4, 2, 5, 3, 6, 7} -> out {2, 3, 6, 7}
	 * 
	 * @param data a bunch of integers
	 * @return only the non-duplicated values from input
	 */
	public Collection<Integer> singles(int[] data) {
		HashMap<Integer, Integer> nonDuplicated = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : data) {
			if (nonDuplicated.containsKey(i)) {
				nonDuplicated.put(i, nonDuplicated.get(i) + 1);
			} else {
				nonDuplicated.put(i, 1);
			}
		}
		for (Integer i : nonDuplicated.keySet()) {
			if (nonDuplicated.get(i) == 1) {
				list.add(i);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Collection<Integer> result = new Exercise().singles(new int[] { 2, 3, 4, 4, 5, 5, 6, 7 });
		System.out.println(result);
	}
}
