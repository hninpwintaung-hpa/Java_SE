package homework.hashMap;

import java.util.HashMap;
import java.util.Map;

public class CityPopulationEx9 {

	Map<String, Integer> cityPopulationMap = new HashMap<>();

	public void addCityPopulation(String cityName, int population) {
		cityPopulationMap.put(cityName, population);
	}

	public static void main(String[] args) {
		CityPopulationEx9 cityPopulation = new CityPopulationEx9();

		cityPopulation.addCityPopulation("New York City", 8336817);
		cityPopulation.addCityPopulation("Los Angeles", 3977683);
		cityPopulation.addCityPopulation("Chicago", 2695598);
		cityPopulation.addCityPopulation("Houston", 2320268);

		String cityWithHighestPopulation = cityPopulation.findCityWithHighestPopulation();

		System.out.println("City with the highest population: " + cityWithHighestPopulation);

	}

	public String findCityWithHighestPopulation() {
		String cityWithHighestPopulation = null;
		int highestPopulation = Integer.MIN_VALUE;

		for (Map.Entry<String, Integer> entry : cityPopulationMap.entrySet()) {
			if (entry.getValue() > highestPopulation) {
				highestPopulation = entry.getValue();
				cityWithHighestPopulation = entry.getKey();
			}
		}

		return cityWithHighestPopulation;
	}
}
