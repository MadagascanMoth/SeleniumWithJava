package basicsofjava;

public class MultiDimensionalArray {

	public static void main(String[] args) {


	int array [] [] = new int [2][3];
	array[0][0] = 1;
	array[0][1] = 2;
	array[0][2] = 3;
	array[1][0] = 4;
	array[1][1] = 5;
	array[1][2] = 6;
	
	System.out.println(array[1][0]);
	
	int array1 [] [] = {{1, 2, 3},{4, 5, 6}};
	
	for(int i = 0; i < 2; i++) {
		
		for(int j = 0; j < 3; j++) {
			System.out.println(array[i][j]);
			
		}
		
			}
	

	}

}
