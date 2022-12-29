package basicsofjava;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("Constructor");
	}
	
	public ConstructorDemo (int a, int b) {
		System.out.println("Constructor parametarized");
		
	}
	
	public void getData() {
		
		System.out.println("I am a method");
		
	}

	public static void main(String[] args) {
		
		ConstructorDemo constructor = new ConstructorDemo();
		ConstructorDemo constructorInt = new ConstructorDemo(4, 5);
			
		
		

	}

}
