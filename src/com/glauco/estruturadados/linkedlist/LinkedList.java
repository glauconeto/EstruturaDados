package com.glauco.estruturadados.linkedlist;

public class LinkedList<T> {
    private Node<T> inicio;
    private Node<T> ultimo;
    private int tamanho;

    public void adiciona(T elemento) {
        Node<T> celula = new Node<T>(elemento);

        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }

        this.ultimo = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("LinkedList [inicio = ").append(inicio).append("]");
        return builder.toString();
    }
}
