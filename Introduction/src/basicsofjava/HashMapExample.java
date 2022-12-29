package basicsofjava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm = new HashMap <Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "goodbye");
		hm.put(2, "morning");
		hm.put(3, "evening");
		System.out.println(hm.get(2));
		hm.entrySet();
		Set sethm = hm.entrySet();
		Iterator it = sethm.iterator();
		while(it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
