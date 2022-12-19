package basicsofjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rahul");
		list.add("Shetty");
		list.add("Academy");
		list.add("remove this one");
		list.remove(3);
		System.out.println(list.get(2));
		
		for(int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String listNames : list) {
			System.out.println(listNames);
		}
		
		System.out.println(list.contains("Rahul"));
		
		String [] names = {"Rahul", "Shetty", "Acadamy"};
		List <String> listNames = Arrays.asList(names);
		System.out.println(listNames);
	}

}
