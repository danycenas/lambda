package com.mitocode.ejercicio3.scope;

public class Programa2 {

	public void variablesLocales() {

//		VARIABLES LOCALES
//		la variable (z) en una clase anonima se comporta como final, su valor no se puede cambiar
		int z = 0;

		// Clase anonima
		IOperacion op = new IOperacion() {

			@Override
			public int suma(int x, int y) {
				return x + y + z;
			}
		};

		// Lambda
		IOperacion op2 = (x, y) -> {
//			z = x + y + z;
			return x + y + z;
		};

		System.out.println("Clase anonima: " + op.suma(5, 3));

		System.out.println("Lambda: " + op2.suma(5, 3));

	}

	public static void main(String[] args) {

		Programa2 p = new Programa2();
		p.variablesLocales();

	}

}
