package com.glauco.estruturadados.queue.labs;

import com.glauco.estruturadados.queue.QueuePriority;

public class Exer03 {
    private static final int VERDE = 2;
    private static final int AMARELO = 1;
    private static final int VERMELHO = 0;

    public static void main(String[] args) {
        QueuePriority<Pessoa> fila = new QueuePriority<>();

        fila.enfileira(new Pessoa("Pessoa 1", VERDE));
        fila.enfileira(new Pessoa("Pessoa 2", VERMELHO));
        fila.enfileira(new Pessoa("Pessoa 3", VERMELHO));
        fila.enfileira(new Pessoa("Pessoa 4", AMARELO));
        fila.enfileira(new Pessoa("Pessoa 5", VERDE));
        fila.enfileira(new Pessoa("Pessoa 6", AMARELO));

        PSAtendimento atendimento = new PSAtendimento(fila);
        PSNovosPacientes pacientes = new PSNovosPacientes(fila);
        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);

        t1.start();
        t2.start();
    }
}
