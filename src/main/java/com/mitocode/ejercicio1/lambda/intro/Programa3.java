package com.mitocode.ejercicio1.lambda.intro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa3 {

	public static void main(String[] args) {

		List<Empleado> lista = new ArrayList<>();

		Empleado e1 = new Empleado("Dany", 2000, 29);
		Empleado e2 = new Empleado("Juan", 1500, 25);
		Empleado e3 = new Empleado("Pedro", 2300, 32);

		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		
		//Order por edad
		lista.sort((o1, o2) -> o1.getEdad() - o2.getEdad());
		System.out.println("Lista ordenada por edad: ");
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
		
		//Order por sueldo
		lista.sort( new Comparator<Empleado>() {

			@Override
			public int compare(Empleado o1, Empleado o2) {
				// TODO Auto-generated method stub
				if (o1.getSueldo() < o2.getSueldo()){
		            return 1;
		        }
		        if (o1.getSueldo() > o2.getSueldo()){
		            return -1;
		        }
		        else{
		            return 0;
		        }
			}
		});
		System.out.println("Lista ordenada por sueldo: ");
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}


	}
}
