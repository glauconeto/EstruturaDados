package com.glauco.estruturadados.array.teste;

import com.glauco.estruturadados.array.Array;

public class Aula09 {
    public static void main(String[] args) {
        Array array = new Array(3);

		array.adiciona("B");
		array.adiciona("G");
		array.adiciona("D");
		array.adiciona("E");
		array.adiciona("F");

        System.out.println(array);

        array.remove(1);

        System.out.println(array);
    }
}
