package com.glauco.estruturadados.queue;

import com.glauco.estruturadados.base.EstruturaEstatica;

public class Queue<T> extends EstruturaEstatica<T> {
    /**
     * Método construtor, definindo a capacidade com 10.
     */
    public Queue() {
        super();
    }

    /**
     * Construtor, inicia a capacidade.
     * 
     * @param int capacidade
     */
    public Queue(int capacidade) {
        super(capacidade);
    }

    /**
     * Adiciona um elemento no final da fila.
     * 
     * @param T elemento
     */
    public void enfileira(T elemento) {
        super.adiciona(elemento);
    }

    /**
     * Método para verificar o primeiro elemento da fila.
     */
    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }

        return this.elementos[0];
    }

    public T desenfileira() {
        final int POS = 0;

        if (this.estaVazia()) {
            return null;
        }

        T elementoARemover = this.elementos[POS];

        this.remove(POS);

        return elementoARemover;
    }
}
