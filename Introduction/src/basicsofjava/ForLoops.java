package basicsofjava;

public class ForLoops {

	public static void main(String[] args) {
		
		int [] arr = {1, 2, 3, 4, 5};
		
		String [] names = {"Rahul", "Shetty", "Acadamy"};		
		
		
		for (int i = 0; i <arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		
		for (int i = arr.length - 1; i >= 0; i--) {
			
			System.out.println(arr[i]);
		}
		
		for( int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		

	    }
		
		
		for (String s : names) {
			System.out.println(s);
		}
		
		for (int n : arr) {
			System.out.println(n);
		}

 }
}