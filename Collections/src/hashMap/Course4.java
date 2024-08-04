package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Course4 {
	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<>();
		hashmap.put(10, "java");
		hashmap.put(20, "sql");
		hashmap.put(30, "oops");
		hashmap.put(40, "Sql");
		hashmap.put(50, "oracle");
		hashmap.put(60, "DB");
		hashmap.put(10, "selenium");
		hashmap.put(50, "psql");
		hashmap.put(40, "Hadoop");
		for (Map.Entry<Integer, String> se : hashmap.entrySet()) {
			System.out.println(se.getKey() + " : " + se.getValue());
		}

	}

}
