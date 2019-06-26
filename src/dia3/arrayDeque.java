package dia3;

import java.util.ArrayDeque;

public class arrayDeque {

	public static void main(String[] args) {

		ArrayDeque queue = new ArrayDeque<>();
		queue.addFirst(new Pessoa("Antonio", 32));
		queue.addFirst(new Pessoa("Fabio", 25));
		queue.addFirst(new Pessoa("João", 16));
		queue.addFirst(new Pessoa("José", 32));
		queue.addFirst(new Pessoa("Maria", 10));

		System.out.println(queue.peek());
		System.out.println(queue.getLast());

		ArrayDeque queue1 = new ArrayDeque<>();
		queue1.addFirst(new Pessoa("Antonio", 32));
		queue1.addFirst(new Pessoa("Fabio", 25));
		queue1.addFirst(new Pessoa("João", 16));
		queue1.addFirst(new Pessoa("José", 32));
		queue1.addLast(new Pessoa("Maria", 10));

		System.out.println(queue1.getFirst());
	}

}
