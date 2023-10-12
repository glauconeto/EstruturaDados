package com.glauco.estruturadados.array.teste;

import com.glauco.estruturadados.array.Array;

public class Aula04 {
	public static void main(String[] args) throws Exception {
		Array a1 = new Array(10);

		a1.adiciona("elemento 1");
		a1.adiciona("elemento 2");
		a1.adiciona("elemento 3");

        System.out.println(a1.tamanho());

        System.out.println(a1);
	}
}