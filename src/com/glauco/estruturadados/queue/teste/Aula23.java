package com.glauco.estruturadados.queue.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {
    public static void main(String[] args) {
        Interface1 c = new Classe1();

        c.adiciona();
        c.remove();
        // c.teste();

        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);

        System.out.println(fila);
        System.out.println(fila.peek());
        System.out.println(fila.remove());
        System.out.println(fila);
    }
}
