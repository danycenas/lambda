package com.mitocode.ejercicio9.optional;

import java.util.Optional;

public class Programa {

	public static void main(String[] args) {

//		Optional op = Optional.empty();
//		System.out.println(op.get());

		Optional<String> op2 = Optional.of("Dany");

		String nombre = op2.get();
		System.out.println(nombre);

//		Para validar si existe
		System.out.println(op2.isPresent());

//		Cuando el valor es null asigna un valor predeterminado
		Optional<String> op3 = Optional.ofNullable(null);

		nombre = op3.orElse("Dany Default");
		System.out.println(nombre);

//		Para indicar una exception que consideremos
		Optional<String> op4 = Optional.ofNullable(null);

		nombre = op4.orElseThrow(NumberFormatException::new);
		System.out.println(nombre);

	}

}
