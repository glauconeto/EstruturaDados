package com.glauco.estruturadados.array.teste;

import com.glauco.estruturadados.array.Array;

public class Aula06 {
    public static void main(String[] args) {
        Array array = new Array(3);

		array.adiciona("elemento 1");
		array.adiciona("elemento 2");
		array.adiciona("elemento 3");

        System.out.println(array.busca("elemento 1"));
        System.out.println(array.busca("elemento 4"));
    }
}
