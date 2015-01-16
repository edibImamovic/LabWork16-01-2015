package ba.bitcamp.maps.sets.lists;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class HashMaps {

	public static int hash(int num) {
		return num / 10;

	}

	public static void main(String[] args) {

		String myString;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		Random rand = new Random();

		for (int i = 0; i < 100; i++) {
			int num = rand.nextInt(100);
			map.put(hash(num), num);
			
		}

		Set<Integer> set = map.keySet();
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			int key = iterator.next();
			
			System.out.println(map.get(key));
		}
	}

}
