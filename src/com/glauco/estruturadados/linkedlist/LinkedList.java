package com.glauco.estruturadados.linkedlist;

public class LinkedList<T> {
    /**
     * Elemento de início.
     */
    private Node<T> inicio;
    /**
     * Último elemento.
     */
    private Node<T> ultimo;
    /**
     * Tamanho da lista.
     */
    private int tamanho;

    /**
     * Método para adicionar elemento.
     * 
     * @param T elemento
     */
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

    /**
     * Retorna o tamanho da lista.
     * 
     * @return tamanho
     */
    public int getTamanho() {
        return this.tamanho;
    }

    /**
     * Método para limpar a lista.
     */
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

    private Node<T> buscaNo(int posicao) {
        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        Node<T> noAtual = this.inicio;

        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }

    public T buscaPorPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    public int busca(T elemento) {
        Node<T> noAtual = this.inicio;
        int pos = 0;

        while (noAtual != null) {
            if (noAtual.getElemento().equals(elemento))
                return pos;

            pos++;
            noAtual = noAtual.getProximo();
        }

        return -1;
    }

    /**
     * Método toString para mostrar a lista.
     */
    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        // builder.append("ListaEncadeada [inicio=").append(inicio).append("]");

        Node<T> atual = this.inicio;
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(", ");
            atual = atual.getProximo();
        }

        builder.append(atual.getElemento()).append("]");

        return builder.toString();
    }
}
