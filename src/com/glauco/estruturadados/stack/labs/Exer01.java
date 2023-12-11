package com.glauco.estruturadados.stack.labs;

import java.util.Scanner;
import com.glauco.estruturadados.stack.Stack;

public class Exer01 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite um número: ");

            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("Empilhando número: " + num);
                pilha.empilha(num);
            } else {
                Integer desempilhado = pilha.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Número ímpar, desempilhando elemento da pilha "
                            + desempilhado);
                }
            }
        }

        sc.close();

        System.out.println("Todo os números lidos, desempilhando número da pilha");

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando elemento da pilha "
                    + pilha.desempilha());
        }

        System.out.println("Todos os elementos foram desempilhados");
    }
}
