package com.glauco.estruturadados.array.teste;

import com.glauco.estruturadados.array.List;

public class Aula11 {
    public static void main(String[] args) {
        List<Contato> list = new List<Contato>(5);
        
        Contato c1 = new Contato("Contato 1", "1234-567", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2345-5678", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "3412-5677", "contato3@email.com");
        Contato c4 = new Contato("Contato 3", "3412-5677", "contato3@email.com");

        list.adiciona(c1);
        list.adiciona(c2);
        list.adiciona(c3);
        list.adiciona(c4);
    }
}