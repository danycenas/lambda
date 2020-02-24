package com.mitocode.ejercicio2.lambda;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IOperacion o1 = new IOperacion() {
			
			@Override
			public int suma(int n1, int n2) {
				return n1 + n2;
			}

//			@Override
//			public int resta(int n1, int n2) {
//				return n1 - n2;
//			}
		};

		System.out.println(o1.suma(2, 5));
//		System.out.println(o1.resta(2, 5));
		
		
		// Puedo hacerlo en lambda
		IOperacion op1 = (x, y) -> (x + y);
		IOperacion op2 = (x, y) -> (x - y);
		System.out.println(op1.suma(2, 5));
		System.out.println(op2.suma(2, 5));

		
		
		
		
	}

}
