package dia3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class forEach {

	public static void main(String[] args) {

		List list = new ArrayList<>();
		list.add(1);
		list.add("A");
		list.add("B");

		// antes java 8
		list.forEach(new Consumer<Object>() {

			@Override
			public void accept(Object n) {

				System.out.println(n);
			}
		});

		// depois java 8
		list.forEach((n) -> System.out.println(n));
	}

}
