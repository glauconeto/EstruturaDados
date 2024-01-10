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
        Node<T> celula = new Node<>(elemento);

        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }

        this.ultimo = celula;
        this.tamanho++;
    }

    public void adicionaInicio(T elemento) {
        if (this.tamanho == 0) {
            Node<T> novoNo = new Node<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
            
        } else {
            Node<T> novoNo = new Node<>(elemento, this.inicio);
            this.inicio = novoNo;
        }

        this.tamanho++;
    }

    public void adiciona(int posicao, T elemento) {
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }

        if (posicao == 0) { // Está vazia
            this.adicionaInicio(elemento);
        } else if (posicao == this.tamanho)
            this.adiciona(elemento);
        else { // Meio
            Node<T> noAnterior = buscaNo(posicao);
            Node<T> proximo = noAnterior.getProximo();
            Node<T> novoNo = new Node<>(elemento, proximo);
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }

    public T removeInicio() {
        if (this.tamanho == 0) {
            throw new RuntimeException("Lista está vazia");
        }

        T removido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;

        if (this.tamanho == 0) {
            this.ultimo = null;
        }

        return removido;
    }

    public T removeFinal() {
        if (this.tamanho == 0) {
            throw new RuntimeException("Lista está vazia.");
        }

        if (this.tamanho == 1) {
            return this.removeInicio();
        }

        Node<T> penultimoNo = this.buscaNo(this.tamanho - 2);
        T removido = penultimoNo.getProximo().getElemento();
        penultimoNo.setProximo(null);

        this.ultimo = penultimoNo;
        this.tamanho--;

        return removido;
    }

    private boolean posicaoNaoExiste(int posicao) {
        return !(posicao >= 0 && posicao <= this.tamanho);
    }

    public T remove(int posicao) {
        if (this.posicaoNaoExiste(posicao)) {
            throw new IllegalArgumentException("Posição não existe.");
        }

        if (posicao == 0) {
            return this.removeInicio();
        }

        if (posicao == this.tamanho - 1) {
            return this.removeFinal();
        }

        Node<T> noAnterior = this.buscaNo(posicao - 1);
        Node<T> atual = noAnterior.getProximo();
        Node<T> proximo = atual.getProximo();

        noAnterior.setProximo(proximo);
        atual.setProximo(null);
        this.tamanho--;

        return atual.getElemento();
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
        if (this.posicaoNaoExiste(posicao)) {
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
            if (noAtual.getElemento().equals(elemento)) {
                return pos;
            }

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
        Node<T> atual = this.inicio;

        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(", ");
            atual = atual.getProximo();
        }

        builder.append(atual.getElemento()).append("]");

        return builder.toString();
    }
}
