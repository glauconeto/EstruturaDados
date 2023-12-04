package com.glauco.estruturadados.array.labs;

import com.glauco.estruturadados.array.List;

public class Exer01 {
    public static void main(String[] args) {
        List<String> lista = new List<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("E"));
    }
}