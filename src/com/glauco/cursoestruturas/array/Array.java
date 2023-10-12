package com.glauco.cursoestruturas.array;

public class Array {
    private String[] elementos;
    private int tamanho;

    public Array(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // Método que funciona, porém apenas adiciona a quantidade de elementos informados,
    // podendo haver elementos vagos.
    /* public void adiciona(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    } */

    // Método que verifica se o tamanho do array é maior que a capacidade do array.
    /* public boolean function adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

            return true;
        }
        
        return false;
    } */

    // Método que verifica se o tamanho do array é maior que a capacidade do array.
    public void function adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Array já cheio, não é possível adicionar novos elementos!");
        }

    }
}