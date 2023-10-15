package com.glauco.estruturadados.array.teste;

import com.glauco.estruturadados.array.Array;

public class Aula07 {
    public static void main(String[] args) {
        Array array = new Array(10);

		array.adiciona("B");
		array.adiciona("C");
		array.adiciona("E");
		array.adiciona("F");
		array.adiciona("G");

        System.out.println(array);

        array.adiciona(0, "A");

        System.out.println(array);

        array.adiciona(3, "D");

        System.out.println(array);
    }
}
