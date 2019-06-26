package dia3;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {

		List list = new Vector<>();
		list.add(1);
		list.add("A");
		list.add("B");

		list.clear();

		System.out.println(list);

		List list1 = new Vector<>();
		list1.add(1);
		list1.add("A");
		list1.add("B");

		System.out.println(list1.isEmpty());

		List list3 = new Vector<>();
		list3.add(1);
		list3.add("A");
		list3.add("B");

		Object[] array = list3.toArray();

		System.out.println(Arrays.toString(array));
	}

}
