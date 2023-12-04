package com.glauco.estruturadados.array.labs;

import java.util.ArrayList;

import com.glauco.estruturadados.array.List;

public class Exer05 {
    public static void main(String[] args) {
        ArrayList<String> arrayLista = new ArrayList<String>(4);

        arrayLista.add("A");
        arrayLista.add("B");
        arrayLista.add("C");
        arrayLista.add("D");
        arrayLista.add("E");

        System.out.println(arrayLista);

        arrayLista.clear();

        System.out.println(arrayLista);

        List<String> lista = new List<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);
        lista.limpar();

        System.out.println(lista);
    }
}
