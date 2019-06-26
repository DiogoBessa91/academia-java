package dia3;

import java.util.LinkedList;
import java.util.List;

public class linkedList {

	public static void main(String[] args) {
		
		List list = new LinkedList<>();
		list.add(1);
		list.add("A");
		list.add("B");
		
	
		System.out.println(list.contains("A"));
		
		List list1 = new LinkedList<>();
		list1.add(1);
		list1.add("A");
		list1.add("B");
		
		list1.remove("A");
		
		System.out.println(list1);
		
		List list3 = new LinkedList<>();
		list3.add(1);
		list3.add("A");
		list3.add("B");
		
		
		System.out.println(list3.size());

	}
}
