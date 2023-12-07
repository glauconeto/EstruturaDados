package com.glauco.estruturadados.stack;

class EstruturaEstatica<T> {
    protected T[] elementos;
    protected int tamanho;

    @SuppressWarnings("unchecked")
    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

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
    protected boolean adiciona(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}

        this.aumentaCapacidade();

        // Move todos os elementos
        for (int i = this.tamanho; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
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