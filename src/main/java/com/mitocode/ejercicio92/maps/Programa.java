package com.mitocode.ejercicio92.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {

		Map<String, String> paises = new HashMap<String, String>();

		paises.put("PE", "Peru");
		paises.put("CO", "Colombia");
		paises.put("CH", "Chile");
		paises.put("EC", "Ecuador");
		
//		Imprimir con lambda
		paises.forEach((k,v) -> System.out.println("key: " + k + ", value: " + v));
		
//		Otro forma
		paises.entrySet().stream().forEach(System.out::println);
		
//		Agregar elemento si no se encuentra, put actualiza  si lo encuentra
		paises.putIfAbsent("MX", "Mexico");
		
//		si encuentra la llave, realiza algo
		paises.computeIfPresent("MX", (k,v) -> k + v);
		System.out.println(paises.get("MX"));
		
//		valor por defecto, si NN existe lo pinta sino devuelve un valor Pais
		String valor = paises.getOrDefault("NN", "Pais");
		System.out.println(valor);
		
		
//		Extraemos a otro mapa
		Map<String, String> paises2 = paises.entrySet().stream()
				.filter(e -> e.getValue().contains("Peru")).collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		System.out.println("Mapa nuevo: ");
		paises2.entrySet().stream().forEach(System.out::println);
	}

}
