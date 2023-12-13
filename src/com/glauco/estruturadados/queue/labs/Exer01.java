package com.glauco.estruturadados.queue.labs;

import com.glauco.estruturadados.queue.Queue;

public class Exer01 {
    public static void main(String[] args) {
        Queue<Documento> filaImpressora = new Queue<>();

        filaImpressora.enfileira(new Documento("A", 1));
        filaImpressora.enfileira(new Documento("B", 4));
        filaImpressora.enfileira(new Documento("C", 3));
        filaImpressora.enfileira(new Documento("D", 7));
        filaImpressora.enfileira(new Documento("E", 2));

        while (!filaImpressora.estaVazia()) {
            Documento doc = filaImpressora.desenfileira();
            System.out.println("Imprimindo documento: " + doc.getNome());

            try {
                Thread.sleep(200 * doc.getNumFolhas()); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Todos os documentos foram impressos.");
    }
}
