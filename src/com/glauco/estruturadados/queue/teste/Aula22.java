package com.glauco.estruturadados.queue.teste;

import com.glauco.estruturadados.queue.Queue;

public class Aula22 {
	public static void main(String[] args) {
		Queue<Integer> fila = new Queue<>();

		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);

		System.out.println(fila);
		System.out.println(fila.desenfileira());
		System.out.println(fila);
		System.out.println(fila.desenfileira());
		System.out.println(fila);
		System.out.println(fila.desenfileira());
		System.out.println(fila);
	}

}
