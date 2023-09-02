package homework.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class Exercise7 {
  
	public static void main(String[] args) {
		Map<String , Object> citiesPopulationsMap = new TreeMap<>();
		
		citiesPopulationsMap.put("New York City",new City("New York City", 8336817));
        citiesPopulationsMap.put("Los Angeles",new City("Los Angeles", 3977683));
        citiesPopulationsMap.put("Chicago",new City("Chicago", 2695598));
        citiesPopulationsMap.put("Houston",new City("Houston", 2320268));
        
        findCityWithHighestPopulation(citiesPopulationsMap);
	}
	
	public static void findCityWithHighestPopulation(Map<String , Object> citiesPopulationsMap) {
		 String cityWithHighestPopulation = null;
	        int highestPopulation = Integer.MIN_VALUE;

	        for (Map.Entry<String, Object> entry : citiesPopulationsMap.entrySet()) {
	            Object value = entry.getValue();
	            if (value instanceof City) {
	                City city = (City) value;
	                if (city.getPopulation() > highestPopulation) {
	                    highestPopulation = city.getPopulation();
	                    cityWithHighestPopulation = city.getName();
	                }
	            }
	        }
	        System.out.println("City with the highest population: " + cityWithHighestPopulation);
	}
}
