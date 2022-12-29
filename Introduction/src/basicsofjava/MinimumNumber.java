package basicsofjava;

public class MinimumNumber {

	public static void main(String[] args) {
		
		
		int array [] [] = {{2,4,5}, {3, 4, 7}, {1, 2, 9}};
		
		int min = array[0] [0];
		
		
		for(int i = 0; i<3; i++) {
			
			for(int j=0; j<3;j++) {
				
				if(array[i][j] < min) {
					
					min = array[i][j];
				}
			}
			
		}
		System.out.println(min);
		
		
		
	int array1 [] [] = {{2,4,5}, {3, 4, 7}, {1, 2, 9}};
		
		int min1 = array[0] [0];
		int mincoloumn =0;
		
		
		for(int i = 0; i<3; i++) {
			
			for(int j=0; j<3;j++) {
				
				if(array1[i][j] < min) {
					
					min = array[i][j];
					mincoloumn = j;
				}
			}
			
		}
		
		int max = array[0][mincoloumn];
		int k = 0;
		while(k<3) {
			if(array1[k][mincoloumn]>max) {
				max = array1[k][mincoloumn];
				
			}
			k++;
		}
		
		System.out.println(max);
		

	}

}
