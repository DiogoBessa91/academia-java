package dia3;

import java.util.Arrays;
import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {

		HashMap<String, Object> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", Arrays.asList("1", "2"));

		System.out.println(map);

		map.clear();

		System.out.println(map);

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("A", "1");
		map1.put("B", Arrays.asList("1", "2"));

		System.out.println("A -> " + map1.get("A"));
		System.out.println("B -> " + map1.get("B"));

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("A", "1");
		map2.put("B", Arrays.asList("1", "2"));

		System.out.println(map2);
	}

}
