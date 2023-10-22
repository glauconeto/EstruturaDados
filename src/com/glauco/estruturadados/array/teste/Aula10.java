package com.glauco.estruturadados.array.teste;

import com.glauco.estruturadados.array.ArrayObjetos;

public class Aula10 {
    public static void main(String[] args) {
        ArrayObjetos array = new ArrayObjetos(3);

        Contato c1 = new Contato("Contato 1", "1234-567", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2345-5678", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "3412-5677", "contato3@email.com");
        Contato c4 = new Contato("Contato 3", "3412-5677", "contato3@email.com");

        array.adiciona(c1);
        array.adiciona(c2);
        array.adiciona(c3);

        System.out.println("Tamanho = " + array.tamanho());

        int pos = array.busca(c4);
        if (pos > -1)
            System.out.println("Elemento existe no vetor");
        else
            System.out.println("Elemento não existe no vetor");

        System.out.println(array);
    }
}
