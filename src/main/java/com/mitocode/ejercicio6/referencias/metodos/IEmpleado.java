package com.mitocode.ejercicio6.referencias.metodos;

@FunctionalInterface
public interface IEmpleado {

	Empleado crear(String nombres, double sueldo, int edad);

}
