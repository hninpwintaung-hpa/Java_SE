package lecture9;

import java.util.HashMap;
import java.util.Map;

public class CountriesMap {

	private Map<String, String> countryMap = new HashMap<>();

	public static void main(String[] args) {
		CountriesMap map = new CountriesMap();
		
		map.addCountryAndCapital("United States","Washinton D.C");
		map.addCountryAndCapital("Thailand", "Bangkok");
		map.addCountryAndCapital("France","Paris");
		
		map.getCapitalByCountry("Thailand");
	}

	public void addCountryAndCapital(String country, String capital) {
            countryMap.put(country, capital);
	}
	
	public void getCapitalByCountry(String country) {
		System.out.println(countryMap.get(country));
	}
}
