package homework.hashMap;

import java.util.HashMap;
import java.util.Map;

public class CountryMap {
   private Map<String, String> countryCapitalMap = new HashMap<>();
   
   public static void main(String[] args) {
	   CountryMap countryMap = new CountryMap();
	   
	    countryMap.addCountryAndCapital("Thailand", "Bangkok");
	    countryMap.addCountryAndCapital("Korea", "Seoul");
	    countryMap.addCountryAndCapital("France", "Paris");
	    
	   countryMap.getCapitalByCountry("Korea");
   }
   
   public void addCountryAndCapital(String country, String capital) {
	   countryCapitalMap.put(country, capital);
   }
   public void getCapitalByCountry(String country) {
	   System.out.println(countryCapitalMap.get(country));
   }
}
