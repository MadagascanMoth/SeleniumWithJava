package basicsofjava;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		
		
		int[] a = {4, 5, 5, 5, 4,6, 6, 9,4,5};
		
		ArrayList<Integer> a1 =new ArrayList<Integer>();
		for(int i=0;i < a.length; i++ ) {
			int k =0;
			if(!a1.contains(a[i])) {
				a1.add((a[i]));
				k++;
				for(int j= i+1; j<a.length; j++) {
					if(a[i] ==a[j]) {
						k++;
						
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
				if(k==1) {
					System.out.println(a[i] + " is a unique number");
				}
			}
			
			
		}
	
		
		
		
			

	}

}
