package lecture9;

import java.util.SortedMap;
import java.util.TreeMap;

public class MapExercise2 {
  
	public static void main(String[] args) {
		SortedMap<String , String> map= new TreeMap<>();
		
		map.put("2222", "ghi");
		map.put("1111", "def");
		map.put("3333", "abc");
		map.put("4444", "mno");
		map.put("5555", "pqr");
		map.put("3456", "stu");
		
		SortedMap<String, String> hMap= map.headMap("3333");
		
		hMap.forEach((k,v)->System.out.println(k + "|" + v));
		
		System.out.println("Tail Map .....................");
		
		SortedMap<String, String> tMap= map.tailMap("3333");
		
		tMap.forEach((k,v)->System.out.println(k + "|" + v));
	}
	
}
