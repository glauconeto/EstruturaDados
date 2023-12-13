package com.glauco.estruturadados.queue.labs;

import java.util.Random;
import com.glauco.estruturadados.queue.Queue;

public class Exer04 {
    public static void main(String[] args) {
        Queue<Integer> fila = new Queue<>();

        for (int i = 0; i < 10; i++) {
            fila.enfileira(i);
        }

        Random aleatorio = new Random();
        int num = 0;

        while (num == 0) {
            num = aleatorio.nextInt(10);
        }

        System.out.println("Número = " + num);

        while (fila.tamanho() > 1) {
            for (int i = 0; i < num; i++) {
                fila.enfileira(fila.desenfileira());
            }
            System.out.println("Eliminado = " + fila.desenfileira());
        }

        System.out.println("Ganhador: " + fila.desenfileira());
    }
}
