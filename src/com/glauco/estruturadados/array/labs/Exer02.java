package com.glauco.estruturadados.array.labs;

import java.util.ArrayList;

import com.glauco.estruturadados.array.List;

public class Exer02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>(5);
        array.add("A");
        array.add("B");
        array.add("C");

        System.out.println(array.lastIndexOf("B"));

        List<String> lista = new List<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("A");

        System.out.println(lista.ultimoIndice("A"));
    }
}
