package com.mitocode.ejercicio91.streams.paralelos;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

		List<Empleado> lista = new ArrayList<>();

		Empleado e1 = new Empleado("Dany", 2000, 29);
		Empleado e2 = new Empleado("Juan", 1500, 25);
		Empleado e3 = new Empleado("Pedro", 2300, 32);

		lista.add(e1);
		lista.add(e2);
		lista.add(e3);

		lista.parallelStream().forEach(System.out::println);
	}

}
