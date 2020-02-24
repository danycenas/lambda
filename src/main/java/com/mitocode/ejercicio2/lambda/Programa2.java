package com.mitocode.ejercicio2.lambda;

public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Sintaxis
//		Lambda con cuerpo
//		cuando hay mas de una linea
		IOperacion op = (int x, int y) -> {
			int z = 10;
			System.out.println("z: " + z);
			return (x - y) * z;
		};

		System.out.println("Lambda con body: " + op.suma(5, 3));

//		Lamda sin parametros
		IOperacionSinParametros opSinParams = () -> {
			int x = 5;
			int y = 3;
			int z = 10;
			return (x - y) * z;
		};
		System.out.println("Lambda sin parametros: " + opSinParams.operacion());

	}

}
