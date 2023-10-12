package com.glauco.cursoestruturas.array;

public class Array {
    private String[] elementos;
    private int tamanho;

    public Array(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /* public void adiciona(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    } */


}