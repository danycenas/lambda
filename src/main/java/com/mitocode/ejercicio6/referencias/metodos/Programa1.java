package com.mitocode.ejercicio6.referencias.metodos;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.lang.model.type.ArrayType;

public class Programa1 {

	static void referenciarMetodoStatic() {
		System.out.println("Metodo estatico");
	}
	
	static void referenciarMetodoInstanciaObjetoArbitrario() {
		String[] colores = { "negro", "amarillo", "verde", "azul", "violeta" };
		List<String> lista1 = Arrays.asList(colores);
	}

	public static void main(String[] args) {

		IOperacion op = () -> {
		};
		op.saludar();
		
		// Referenciando a un metodo estatico, los metodos estaticos no aceptan parametros
//		existen 4 tipos
		IOperacion op2 = () ->  Programa1.referenciarMetodoStatic();
		op2.saludar();
		
//		Usando operador ::
		IOperacion op3 = Programa1::referenciarMetodoStatic;
		op3.saludar();
		
		
		String[] colores = { "negro", "amarillo", "verde", "azul", "violeta" };
		System.out.println("Lista:");
		for (String color : colores) {
			System.out.print(color + " ");
		}

		
//		Invocando al metodo al metodo compareToIgnoreCase de la instancia de la variable que viene en el array
		Arrays.sort(colores, String::compareToIgnoreCase);
		System.out.println("\n\nLista ordenada con Referencia de metodos:");
		for (String color : colores) {
			System.out.print(color + " ");
		}
		
		Comparator<String> comparator = String::compareToIgnoreCase;
		Arrays.sort(colores, comparator.reversed());
		System.out.println("\n\nLista invertida con Referencia de metodos:");
		for (String color : colores) {
			System.out.print(color + " ");
		}

	}

}
