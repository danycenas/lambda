package com.mitocode.ejercicio6.referencias.metodos;

public class Programa2 {

	public static void main(String[] args) {

//		Invocamos a la interfaz funcional, entonces usando una clase anonima
		IEmpleado iemp = new IEmpleado() {

			@Override
			public Empleado crear(String nombres, double sueldo, int edad) {
				// TODO Auto-generated method stub
				return new Empleado(nombres, sueldo, edad);
			}
		};

		Empleado e1 = iemp.crear("Dany", 1500, 29);
		System.out.println(e1);

//		Usando lambda
		IEmpleado iemp2 = (nombres, sueldo, edad) -> (new Empleado(nombres, sueldo, edad));
		Empleado e2 = iemp2.crear("Juan", 1200, 22);
		System.out.println(e2);

//		Usando referencia de metodos
		IEmpleado iemp3 = Empleado::new;
		Empleado e3 = iemp3.crear("Pedro", 1800, 25);
		System.out.println(e3);

	}

}
