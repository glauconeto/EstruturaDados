package com.glauco.estruturadados.stack.labs;

import java.util.Scanner;

import com.glauco.estruturadados.stack.Stack;

public class Exer02 {
    public static void main(String[] args) {
        Stack<Integer> par = new Stack<Integer>();
        Stack<Integer> impar = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();

            if (num == 0) {
                // Pilha par
                Integer desempilhado = par.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Desempilhando da pilha ímpar: " + desempilhado);
                }

                // Pilha ímpar
                desempilhado = impar.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha ímpar vazia");
                } else {
                    System.out.println("Desempilhando da pilha par: " + desempilhado);
                }
            } else if (num % 2 == 0) {
                System.out.println("Número par, empilhando na pilha par: " + num);
                par.empilha(num);
            } else {
                System.out.println("Número ímpar, empilhando na pilha ímpar: " + num);
                impar.empilha(num);
            }
        }

        sc.close();

        System.out.println("Desempilhando todos os números da pilha par");
        
        while(!par.estaVazia()) {
            System.out.println("Desempilhando da pilha par: " + par.desempilha());
        }

        System.out.println("Desempilhando todos os números da pilha par");
        
        while(!impar.estaVazia()) {
            System.out.println("Desempilhando da pilha ímpar: " + impar.desempilha());
        }
    }
}
