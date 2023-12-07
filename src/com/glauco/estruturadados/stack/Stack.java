package com.glauco.estruturadados.stack;

public class Stack<T> extends EstruturaEstatica<T> {
    public Stack() {
        super();
    }

    public Stack(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        this.adiciona(elemento);
    }

    public T topo() {
        if (this.estaVazia()) {
            return null;
        }

        return this.elementos[tamanho - 1];
    }
}
