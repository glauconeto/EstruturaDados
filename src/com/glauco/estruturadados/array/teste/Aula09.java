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

        System.out.println("Remover o elemento E");

        int pos = array.busca("E");
        if (pos > -1) {
            array.remove(pos);
        } else {
            System.out.println("Elemento não existe  no vetor");
        }
    }
}
