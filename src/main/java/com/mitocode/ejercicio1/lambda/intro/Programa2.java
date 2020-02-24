package com.mitocode.ejercicio1.lambda.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa2 {

	public static void main(String[] args) {
	
		// Parte I
		// Que pasa si queremos ordenar una lista de tipo Empleado
		List<Empleado> lista = new ArrayList<>();
		
		Empleado e1 = new Empleado("Dany", 2000, 29);
		Empleado e2 = new Empleado("Juan", 1500, 25);
		Empleado e3 = new Empleado("Pedro", 2300, 32);

		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		
//		Creamos un operator String y lo cambiamos a Empleado
//		No puedo ordenar una collection con comparator String
//		Collections.sort(lista2);
//		lista2.sort(comparator);
		
		Comparator<Empleado> comparator = new Comparator<Empleado>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {

				return -o1.getNombres().compareTo(o2.getNombres());
			}
		};
				
		Collections.sort(lista, comparator);
		System.out.println("Lista de empleados: ");
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
		
		// Parte II
		// Usando una clase interna anonima
		
		Collections.sort(lista, new Comparator<Empleado>() {

			@Override
			public int compare(Empleado o1, Empleado o2) {
				
				return o1.getNombres().compareTo(o2.getNombres());
			}
		});
		System.out.println("Lista de empleados con clase interna anonima: ");
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
		
		// Parte III
		// Simplificar el codigo para llegar a una lambda
		
		lista.sort((o1, o2) -> o1.getNombres().compareTo(o2.getNombres()));
		System.out.println("Lista de empleados con lambda: ");
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}

	}

}
