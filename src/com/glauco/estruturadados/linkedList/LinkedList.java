package com.glauco.estruturadados.linkedList;

public class LinkedList<T> {
    private Node<T> inicio;
    private int tamanho;

    public void adiciona(T elemento) {
        Node<T> celula = new Node<T>(elemento);
        this.inicio = celula;
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
