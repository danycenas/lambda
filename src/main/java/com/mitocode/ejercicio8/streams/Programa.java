package com.mitocode.ejercicio8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

//		filtrar
		System.out.println("Lista filtrada por D");
		Stream<Empleado> stream = lista.stream();
		stream.filter(x -> x.getNombres().startsWith("D")).forEach(System.out::println);

//		ordenar
		System.out.println("Lista ascendente:");
		lista.stream().sorted((x,y) -> x.getNombres().compareTo(y.getNombres())).forEach(System.out::println);
		
		System.out.println("Lista descedente:");
		lista.stream().sorted((x,y) -> y.getNombres().compareTo(x.getNombres())).forEach(System.out::println);
		
//		transformar usando map
		System.out.println("Lista transformada:");
		lista.stream().map((x) -> x.getNombres().toUpperCase()).forEach(System.out::println);
		
//		imcrementar la edad en 2
		lista.stream().map((x) -> x.getEdad() + 2).forEach(System.out::println);
		
//		limit
		lista.stream().limit(2).forEach(System.out::println);
		
//		count
		long count = lista.stream().count();
		System.out.println("Count: " + count);
	}

}
