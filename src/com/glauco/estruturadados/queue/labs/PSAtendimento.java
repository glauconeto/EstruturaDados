package com.glauco.estruturadados.queue.labs;

import com.glauco.estruturadados.queue.QueuePriority;

public class PSAtendimento implements Runnable {
    private QueuePriority<Pessoa> fila;

    public PSAtendimento(QueuePriority<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {
        while(!fila.estaVazia()) {
            try {
                System.out.println(fila.desenfileira() + " atendida.");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Atendimento concluído");
    }
}
