package dia3;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {

		Stack list = new Stack();
		list.add(1);
		list.add("A");
		list.add("B");

		System.out.println(list);

		System.out.println(list.peek());

		System.out.println(list.pop());
		System.out.println(list);

	}

}
