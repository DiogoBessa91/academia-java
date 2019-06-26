package dia3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class removelf {

	public static void main(String[] args) {

		List list = new ArrayList<>();
		list.add(1);
		list.add("A");
		list.add("B");
		list.add("C");
		list.add(2);

		// antes java 8
		list.removeIf(new Predicate<Object>() {

			@Override
			public boolean test(Object n) {

				return n instanceof Integer;
			}
		});
		System.out.println(list);

		// depois java 8
		list.removeIf(n -> (n instanceof String));

		System.out.println(list);

	}

}
