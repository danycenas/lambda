package com.mitocode.ejercicio1.lambda.intro;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa1 {

	public static void main(String[] args) {

		// Parte I
		String[] colores = { "negro", "amarillo", "verde", "azul", "violeta" };
		List<String> lista1 = Arrays.asList(colores);

		Collections.sort(lista1);
		System.out.println("Lista ascendente: " + lista1);

		Collections.sort(lista1, Collections.reverseOrder());
		System.out.println("Lista descendente: " + lista1);

		// Parte II
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {

				return o1.compareTo(o2);
			}
		};

		Collections.sort(lista1, comparator);
		System.out.println("Lista con Comparator: " + lista1);

	}
}
