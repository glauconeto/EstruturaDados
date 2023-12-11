package com.glauco.estruturadados.stack.teste;

import com.glauco.estruturadados.stack.Stack;

public class Aula17 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<Integer>();

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha);

        System.out.println("Desempilhando elemento: " + pilha.desempilha());
    }
}
