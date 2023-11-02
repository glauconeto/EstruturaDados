package com.glauco.estruturadados.array.teste;

import com.glauco.estruturadados.array.Array;

public class Aula05 {
    public static void main(String[] args) {
        Array array = new Array(3);

		array.adiciona("elemento 1");
		array.adiciona("elemento 2");
		array.adiciona("elemento 3");

        System.out.println(array.busca(2));
    }
}
