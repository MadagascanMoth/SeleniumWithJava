package basicsofjava;

public class NestedLoops {

	public static void main(String[] args) {
		
		for( int i = 1; i <= 4 ; i++) {
			
			System.out.println("Outer Loop Started");
			
			for(int j = 1; j <= 4; j++) {
				
				System.out.println("Inner Loop");
			}
			System.out.println("Outer loop finished");
			
		}

	}

}
