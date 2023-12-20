package com.glauco.estruturadados.linkedlist;

public class LinkedList<T> {
    private Node<T> inicio;
    private Node<T> ultimo;
    private int tamanho;

    public void adiciona(T elemento) {
        Node<T> celula = new Node<T>(elemento);

        if (this.tamanho == 0)
            this.inicio = celula;
        else
            this.ultimo.setProximo(celula);

        this.ultimo = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void limpa() {
        for (Node<T> atual = this.inicio; atual != null;) {
            Node<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Node<T> atual = this.inicio;

        for (int i = 0; i < this.tamanho - 1; i++) {
           builder.append(atual.getElemento()).append(", ");
           atual.getProximo(); 
        }

        builder.append(atual.getElemento()).append("]");

        /* builder.append(atual.getElemento()).append(", ");

        * while (atual.getProximo() != null) {
        *     atual = atual.getProximo();
        * } 
        */

        return builder.toString();
    }
}
