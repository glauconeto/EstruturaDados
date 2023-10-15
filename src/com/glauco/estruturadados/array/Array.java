package com.glauco.estruturadados.array;

/**
 * Classe Array.
 * @author Loiane Groner
 * @author Glauco Neto
 */
public class Array {
    /**
     * Array de elementos, do tipo string.
     */
    private String[] elementos;
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
    public Array(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /**
     * Funciona, porém apenas adiciona a quantidade de elementos informados,
     * podendo haver elementos vagos.
     * 
     * @param String elemento
     * @return void
     */
    /* public void adiciona(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    } */

    
    /**
     * Verifica se o tamanho do array é maior que a capacidade do array.
     * 
     * @param String elemento
     * @return void
     * 
     * @throws Exception
     */
    // public void adiciona(String elemento) throws Exception {
        //     if (this.tamanho < this.elementos.length) {
    //         this.elementos[this.tamanho] = elemento;
    //         this.tamanho++;
    //     } else {
    //         throw new Exception("Array já cheio, não é possível adicionar novos elementos!");
    //     }
    // }
    
    /**
     * Verifica se o tamanho do array é maior que a capacidade do array.
     * 
     * @param String elemento
     * @return boolean
     */
    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

            return true;
        }
        
        return false;
    }

    public boolean adiciona(int posicao, String elemento) {
        if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}

        // Move todos os elementos
        for (int i = this.tamanho; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    /**
     * Busca um por um elemento no array, 
     * caso não exista, retorna uma exceção.
     * 
     * @param posicao
     * @return
     */
    public String busca(int posicao) {
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
    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
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