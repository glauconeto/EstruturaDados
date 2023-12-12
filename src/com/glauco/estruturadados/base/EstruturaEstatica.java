package com.glauco.estruturadados.base;

public class EstruturaEstatica<T> {
    protected T[] elementos;
    protected int tamanho;

    /**
     * Método construtor passando a capacidade, definindo o tamanho com 0.
     * 
     * @param int capacidade
     */
    @SuppressWarnings("unchecked")
    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    /**
     * Método construtor que define a capacidade com 10. 
     */
    public EstruturaEstatica() {
        this(10);
    }

    /**
     * Verifica se a estrutura está vazia.
     * 
     * @return tamanho
     */
    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    /**
     * Verifica se o tamanho do array é maior que a capacidade do array.
     * 
     * @param String elemento
     * @return boolean
     */
    protected boolean adiciona(T elemento) {
        aumentaCapacidade();
        
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

            return true;
        }
        
        return false;
    }

    /**
     * Adiciona um elemento em qualquer posição.
     * 
     * @param posicao
     * @param elemento
     * @return boolean
     */
    protected boolean adiciona(int posicao, T elemento){
		if (posicao < 0 || posicao > tamanho){
			throw new IllegalArgumentException("Posição inválida");
		}

		this.aumentaCapacidade();


		for (int i=this.tamanho-1; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}

        this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

    /**
     * Remove um elemento de uma posição.
     * 
     * @param int posicao
     */
    protected void remove(int posicao) {
        if (!(posicao >= 0 && posicao  < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i+1];
        }

        tamanho--;
    }

    /**
     * Aumenta o dobro da capacidade atual do array.
     */
    @SuppressWarnings("unchecked")
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    /**
     * Retorna o tamanho do array.
     * 
     * @return tamanho
     */
    public int tamanho() {
        return this.tamanho;
    }

    /**
     * String para retornar os elementos do array.
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");
        return s.toString();
    }
}