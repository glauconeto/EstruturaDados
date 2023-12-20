package com.glauco.estruturadados.linkedlist.teste;

import com.glauco.estruturadados.linkedlist.LinkedList;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.adiciona(1);

        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        // lista.limpa();
        // System.out.println(lista);
    }
}
