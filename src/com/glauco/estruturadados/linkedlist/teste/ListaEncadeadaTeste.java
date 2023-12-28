package com.glauco.estruturadados.linkedlist.teste;

import com.glauco.estruturadados.linkedlist.LinkedList;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        testesIniciais();
    }

    public static void testesIniciais() {
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

        // busca por elemento
        System.out.println("******* busca por elemento *******");
        System.out.println(lista.busca(1));
        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));
        System.out.println(lista.busca(0));

        // busca por posição
        System.out.println("******* busca por posição *******");
        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));
        // System.out.println(lista.buscaPorPosicao(-1));
        // System.out.println(lista.buscaPorPosicao(-1));
        // System.out.println(lista.buscaPorPosicao(4));
    }
}
