package homework.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class CountryPopulations {
	
	public static void main(String[] args) {
        Map<String , String> countryPopulations = new TreeMap<>();
        
        countryPopulations.put("Myanmar", "54 Million");
        countryPopulations.put("Thailand", "70 Million");
        countryPopulations.put("United States", "331 Million");
        
//        for(Map.Entry<String , String> map:countryPopulations.entrySet()) {
//        	System.out.println(map.getKey()+ ":" + map.getValue());
//        }
        
        countryPopulations.forEach((country,populations)->System.out.println(country + ":" +populations));

	}
}
