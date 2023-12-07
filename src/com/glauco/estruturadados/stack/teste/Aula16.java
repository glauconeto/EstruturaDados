package com.glauco.estruturadados.stack.teste;

import com.glauco.estruturadados.stack.Stack;

public class Aula16 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<Integer>();

        System.out.println(pilha.topo());
        System.out.println(pilha);

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        pilha.empilha(4);
        pilha.empilha(5);

        System.out.println(pilha.topo());
        System.out.println(pilha);
    }
}
