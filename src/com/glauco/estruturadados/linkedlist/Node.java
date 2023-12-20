package com.glauco.estruturadados.linkedlist;

public class Node<T> {

    /**
     * Elemento atual.
     */
    private T elemento;
    /**
     * Próximo elemento.
     */
    private Node<T> proximo;
    
    /**
     * Define o elemento atual.
     * 
     * @param T elemento
     */
    public Node(T elemento) {
        this.elemento = elemento;
    }

    /**
     * Define o elemento atual e próximo elemento.
     * 
     * @param T elemento
     * @param Node<T> proximo
     */
    public Node(T elemento, Node<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    /**
     * Retorna o elemento atual.
     * 
     * @return T elemento
     */
    public T getElemento() {
        return elemento;
    }

    /**
     * Define o elemento atual
     * 
     * @param elemento
     */
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    /**
     * retorna o proximo elemento da lista.
     * 
     * @return Node
     */
    public Node<T> getProximo() {
        return proximo;
    }

    /**
     * Define o próximo elemento da lista.
     * 
     * @param proximo
     */
    public void setProximo(Node<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Node [elemento = ").append(elemento).append(", proximo = ").append(proximo).append("]");
        return builder.toString();
    }
}
