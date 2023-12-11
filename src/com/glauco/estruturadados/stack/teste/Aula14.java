package com.glauco.estruturadados.stack.teste;

import com.glauco.estruturadados.stack.Stack;

public class Aula14 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<Integer>();

        for (int i = 0; i <= 11; i++) {
            pilha.empilha(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
