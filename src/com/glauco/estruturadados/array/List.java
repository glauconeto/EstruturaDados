package com.glauco.estruturadados.array;

public class List<T> {
    /**
     * Array de elementos, do tipo genérico.
     */
    private T[] elementos;
    /**
     * Tamanho do array
     */
    private int tamanho;

    /**
     * Inicializa o objeto com a capacidade passada e 
     * tamanho 0.
     * 
     * @param capacidade
     */
    public List(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    
    /**
     * Verifica se o tamanho do array é maior que a capacidade do array.
     * 
     * @param String elemento
     * @return boolean
     */
    public boolean adiciona(T elemento) {
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
     * Itera os valores do array para que mova pra frente os itens existentes 
     * para adicionar o elemento novo.
     * 
     * @param posicao
     * @param elemento
     * @return boolean
     */
    public boolean adiciona(int posicao, T elemento) {
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
     * Pesquisa por um elemento e retorna true se existe.
     * 
     * @param String elemento
     */
    public boolean contem(T elemento) {
        return busca(elemento) > -1;
    }

    /**
     * Aumenta o dobro da capacidade atual do array.
     */
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
     * Busca um por um elemento no array, 
     * caso não exista, retorna uma exceção.
     * 
     * @param posicao
     * @return
     */
    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}

        return this.elementos[posicao];
    }

    /**
     * Realiza um algoritmo de busca sequencial para 
     * verificar se o elemento existe.
     * 
     * @param elemento
     * @return
     */
    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Remove um elemento de qualquer posição.
     * 
     * @param posicao
     */
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }

        this.tamanho--;
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
