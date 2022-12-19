package basicsofjava;

public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo method = new MethodsDemo();	
		method.getData(); // to call a method you have to create an object first and then call it by name
		
		MethodsDemo2 method2 = new MethodsDemo2();
		method2.getData2();// this one comes from the other class and the call is the same
		
		getDataStatic(); // this one is static - it can be called without creating an object in the same class
		
		

	}
	//we are not writing methods in main 
	
	public String getData() {
		System.out.println("Hello Wrold");
		return"Rahul Shetty Academy";
	}
	
	public static String getDataStatic() {
		System.out.println("Hello Wrold");
		return"Rahul Shetty Academy";
	}
	
	
	

}
