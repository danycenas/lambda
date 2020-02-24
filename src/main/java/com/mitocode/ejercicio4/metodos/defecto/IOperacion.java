package com.mitocode.ejercicio4.metodos.defecto;

public interface IOperacion {

	int suma(int x, int y);

	default void metodoDefecto() {
		System.out.println("Metodo por defecto sin parametros");
	}

	default void metodoDefectoConParametros(String operacion) {
		System.out.println("Metodo por defecto con parametros: " + operacion);
	}

	default double getPI() {
		return Math.PI;
	}
}
