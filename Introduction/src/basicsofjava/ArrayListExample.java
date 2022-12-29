package basicsofjava;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>  arrList = new ArrayList<Integer>();
		arrList.add(5);
		ArrayList<String>  arrListString = new ArrayList<String>();
		arrListString.add("Rahul");
		arrListString.add("academy");
		arrListString.add("classes");
		System.out.println(arrList);
		System.out.println(arrListString);
		arrListString.add(3,"shetty");
		arrListString.remove(1);
		System.out.println(arrListString);
		System.out.println(arrListString.get(2));
		System.out.println(arrListString.contains("java"));
		System.out.println(arrListString.indexOf("Rahul"));
		System.out.println(arrListString.isEmpty());
		System.out.println(arrListString.size());
	}

}
