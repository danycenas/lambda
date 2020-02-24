package com.mitocode.ejercicio3.scope;

public class Programa3 {

	static int suma;
	double suma2;

	public void variablesGlobales() {
		// VARIABLES GLOBALES -> STATICAS Y NO ESTATICAS se pueden usar y modificar en el scope de una lambda

		IOperacion op = (x, y) -> {
			suma = x + y;
			suma2 = suma;
			return suma;
		};

		System.out.println("Lambda: " + op.suma(5, 3));
		System.out.println("Variable global suma: " + suma);
		System.out.println("Variable global suma2: " + suma2);
	}

	public static void main(String[] args) {
		Programa3 p = new Programa3();
		p.variablesGlobales();
	}

}
