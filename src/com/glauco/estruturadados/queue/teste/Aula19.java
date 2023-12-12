package com.glauco.estruturadados.queue.teste;

import com.glauco.estruturadados.queue.Queue;

public class Aula19 {
    public static void main(String[] args) {
        Queue<Integer> fila = new Queue<>();
        
        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());
    }
}
