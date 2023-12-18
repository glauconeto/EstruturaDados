package com.glauco.estruturadados.linkedList.teste;

import com.glauco.estruturadados.linkedList.LinkedList;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.adiciona(1);

        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);
    }
}
