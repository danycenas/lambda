package com.mitocode.ejercicio5.interfaces.funcionales;

@FunctionalInterface
public interface IOperacion {

	int suma(int x, int y);

//	supongamos que deseamos anadir una nuevo metodo
//	la interface funcional es aquella que solamente define un unico metodo
//	Java formaliza con una anotacion @FunctionalInterface
//	int restar(int x, int y);
}
