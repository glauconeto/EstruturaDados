package com.glauco.estruturadados.stack.teste;

import com.glauco.estruturadados.stack.Stack;

public class Aula15 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<Integer>();

        System.out.println(pilha.estaVazia());

        pilha.empilha(1);

        System.out.println(pilha.estaVazia());
    }
}
