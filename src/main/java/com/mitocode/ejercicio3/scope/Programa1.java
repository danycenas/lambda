package com.mitocode.ejercicio3.scope;

public class Programa1 {

//	variables globales o de instancia
	int entero; // default value: 0
	float flotante; // default value: 0.0
	double decimal; // default value: 0.0
	boolean estado; // default value: false
	String cadena; // default: null
	Object objeto; // default: null

	public void variablesGlobales() {
		System.out.println("int = " + entero);
		System.out.println("float = " + flotante);
		System.out.println("double = " + decimal);
		System.out.println("boolean = " + estado);
		System.out.println("String = " + cadena);
		System.out.println("Object = " + objeto);
	}
	
//	variables locales o de metodo tenemos que inicializarlas
	public void variablesLocales() {
		int entero;
		float flotante; 
		double decimal;
		boolean estado;
		String cadena;
		Object objeto;
//		System.out.println("int = " + entero);
	}

	public static void main(String[] args) {
		Programa1 p = new Programa1();
		p.variablesGlobales();
	}
}
