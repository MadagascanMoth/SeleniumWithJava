package basicsofjava;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet <String> hs = new  HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		hs.add("it");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator <String> i =  hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	

	}

}
