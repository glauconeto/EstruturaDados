package com.glauco.estruturadados.queue.teste;

import com.glauco.estruturadados.queue.Queue;

public class Aula21 {
	public static void main(String[] args) {
		Queue<Integer> fila = new Queue<>();

		fila.enfileira(3);
		fila.enfileira(1);
		fila.enfileira(2);

		System.out.println(fila.espiar());

		System.out.println(fila.toString());
	}

}