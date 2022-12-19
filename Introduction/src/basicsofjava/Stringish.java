package basicsofjava;

public class Stringish {

	public static void main(String[] args) {
		
		
		String firstString = "Rahul Shetty Academy";
		String secondString = "Rahul Shetty Academy";
		System.out.println(firstString);
		System.out.println(secondString);
		
		
		String first = new String("Rahul Shetty Academy");
		String second = new String("Rahul Shetty Academy");
		System.out.println(first);
		System.out.println(second);
		
		String s = "Rahul Shetty Academy";
		String [] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		splittedString[1].trim();
		System.out.println(splittedString[1].trim());
		
		//iterate through the string, we can do that with the characters, so we skip the blank spaces 
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			
		}
		
		for(int i = s.length()-1; i>0; i--) {
			System.out.println(s.charAt(i));
		}
		

	}

}
