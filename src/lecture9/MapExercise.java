package lecture9;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("2222", "ghi");
		map.put("1111", "def");
		map.put("3333", "abc");

		String s1 = map.get("3333");
		String s2 = map.get("9999");
		String s3 = map.getOrDefault("9999", "xyz");

		map.forEach((k, v) -> System.out.println(k + "|" + v));

		map.replaceAll((k, v) -> v.toUpperCase());

		map.forEach((k, v) -> System.out.println(k + "|" + v));

		map.replaceAll((k, v) -> v.toLowerCase());

		map.forEach((k, v) -> System.out.println(k + "|" + v));
	}
}
