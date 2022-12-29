package basicsofjava;

public class Pyramid {

	public static void main(String[] args) {
		
		int k = 1;
		for( int i = 0; i < 4; i++) {
			for( int j = 1; j <= 4-i; j++ ) {
				System.out.print(k);
				System.out.print("\t");
				k++;
				
			}
			System.out.println("");
		}
		
		
		
		// reverse pyramid
		
		int l = 1;
		for(int i = 1; i < 5 ; i++) {
			for(int j = 1; j<=i ; j++) {
				System.out.print(l);
				System.out.print("\t");
				l++;
			}
			System.out.println("");
		}
		
		// always begin with the same number
		
		
		for(int i = 1; i < 5 ; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print(j);
				System.out.print("\t");
			
				
				
			}
			System.out.println("");
		}
		

	}

}
