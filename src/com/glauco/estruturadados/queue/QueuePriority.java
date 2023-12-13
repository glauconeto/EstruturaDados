package com.glauco.estruturadados.queue;

public class QueuePriority<T> extends Queue<T> {
    @SuppressWarnings("unchecked")
    public void enfileira(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        int i;

        for (i = 0; i < this.tamanho; i++) {
            if (chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }
        this.adiciona(i, elemento);
    }
}
