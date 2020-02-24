package com.mitocode.ejercicio7.collections;

import java.util.ArrayList;
import java.util.List;

import com.mitocode.ejercicio1.lambda.intro.Empleado;

public class Programa {

	public static void main(String[] args) {

		List<Empleado> lista = new ArrayList<>();

		Empleado e1 = new Empleado("Dany", 2000, 29);
		Empleado e2 = new Empleado("Juan", 1500, 25);
		Empleado e3 = new Empleado("Pedro", 2300, 32);

		lista.add(e1);
		lista.add(e2);
		lista.add(e3);

//		Impresion tradicional
		System.out.println("Lista - impresion tradicional: ");
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}

//		Consumer: interface funcional que tiene un unico metodo void accept 
//		espera recibir una logica que nosotros implementemos en una expr lambda o referencia de metodo
		System.out.println("Lista - impresion usando Consumer: ");
		lista.forEach(x -> System.out.println(x));

//		Usando referencia
		System.out.println("Lista - impresion usando referencia de metodos: ");
		lista.forEach(System.out::println);

//		REMOVE IF - Lambda
		lista.removeIf(x -> x.getNombres().equalsIgnoreCase("Dany"));
		System.out.println("Lista - usando removeIf: ");
		lista.forEach(System.out::println);


	}

}
