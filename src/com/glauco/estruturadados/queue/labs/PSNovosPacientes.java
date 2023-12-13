package com.glauco.estruturadados.queue.labs;

import java.util.Random;

import com.glauco.estruturadados.queue.QueuePriority;

public class PSNovosPacientes implements Runnable {
    private QueuePriority<Pessoa> fila;
    private int cont = 7;
    private Random prioridade = new Random()
;
    public PSNovosPacientes(QueuePriority<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(8000);
                Pessoa p = new Pessoa("" + cont, prioridade.nextInt(3));

                fila.enfileira(p);
                cont++;
                System.out.println(p + " enfileirada.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
