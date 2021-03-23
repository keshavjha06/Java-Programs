package javacoreprograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		// capitalCities.remove("England");
		// capitalCities.clear();

		System.out.println(capitalCities.size());

		// To access an item,use get() and refer to its key
		// System.out.println(capitalCities.get("England"));

		// To remove an item, use remove() and refer to the key
		// System.out.println(capitalCities.remove("England"));

		// keySet() method if we want only keys, for each loop
		for (String k : capitalCities.keySet()) {
			System.out.println(k);
		}

		// values() method if we want only values, for each loop
		for (String i : capitalCities.values()) {
			System.out.println(i);
		}

		//3. immutableMap with only one single entry:

		Map<String, Integer> map3 = Collections.singletonMap("test", 100);
		System.out.println(map3.get("test"));
		map3.put("abc", 200); //unsupportedoperationexception

		
	
	}

}
