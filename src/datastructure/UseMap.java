package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<String, List<String>> map = new HashMap<>();

		List<String> setone = new ArrayList<>();
		setone.add("Playstation");
		setone.add("Xbox");
		setone.add("Nintendo");

		List<String> settwo = new ArrayList<String>();
		settwo.add("Batman");
		settwo.add("Superman");
		settwo.add("Azrael");

		List<String> setthree = new ArrayList<String>();
		setthree.add("Breaking Bad");
		setthree.add("Game of Thrones");
		setthree.add("The Office");

		map.put("A", setone);
		map.put("B", settwo);
		map.put("c", setthree);

		System.out.println("The corresponding values are: ");
		for(Map.Entry<String, List<String>> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " " + entry.getValue());

		}


	}
}

