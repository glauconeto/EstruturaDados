package com.glauco.estruturadados.stack;

import com.glauco.estruturadados.base.EstruturaEstatica;

public class Stack<T> extends EstruturaEstatica<T> {
    /**
     * Método construtor, definindo a capacidade com 10.
     */
    public Stack() {
        super();
    }

    /**
     * Construtor, inicia a capacidade.
     * 
     * @param int capacidade
     */
    public Stack(int capacidade) {
        super(capacidade);
    }

    /**
     * Adiciona um elemento ao topo.
     * 
     * @param T elemento
     */
    public void empilha(T elemento) {
        this.adiciona(elemento);
    }

    /**
     * Exibe o elemento do topo da pilha.
     * 
     * @return T topo
     */
    public T topo() {
        if (this.estaVazia()) {
            return null;
        }

        return this.elementos[tamanho-1];
    }

    /**
     * Remove o último elemento da pilha
     * 
     * @return T elemento.
     */
    public T desempilha() {
        if (this.estaVazia()) {
            return null;
        }

        /*T elemento = this.elementos[tamanho-1];
        tamanho--;
        
        return elemento;*/

        return this.elementos[--tamanho];
    }
}
