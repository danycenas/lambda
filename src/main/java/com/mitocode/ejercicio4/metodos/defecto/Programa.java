package com.mitocode.ejercicio4.metodos.defecto;

public class Programa {

	public static void main(String[] args) {

		IOperacion op = (x, y) -> (x + y);

		System.out.println("Lambda - Suma: " + op.suma(5, 3));

		op.metodoDefecto();
		
		op.metodoDefectoConParametros("Dany");
		
		System.out.println("Metodo con valor retorno: " + op.getPI());

	}

}
