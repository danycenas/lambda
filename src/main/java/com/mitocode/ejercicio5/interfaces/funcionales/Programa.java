package com.mitocode.ejercicio5.interfaces.funcionales;

public class Programa {

	public static void main(String[] args) {

		IOperacion op = (x, y) -> (x + y);

		System.out.println("Lambda - Suma: " + op.suma(5, 3));
	}

}
