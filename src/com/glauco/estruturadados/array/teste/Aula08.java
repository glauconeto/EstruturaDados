package com.glauco.estruturadados.array.teste;

import com.glauco.estruturadados.array.Array;

public class Aula08 {
    public static void main(String[] args) {
        Array array = new Array(3);

		array.adiciona("B");
		array.adiciona("C");
		array.adiciona("E");
		array.adiciona("F");
		array.adiciona("G");

        System.out.println(array);
    }
}
