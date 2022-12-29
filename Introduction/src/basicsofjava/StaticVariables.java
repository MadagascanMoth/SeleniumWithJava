package basicsofjava;

public class StaticVariables {
	
	String name; 
	String address;
	static String city = "Ruma";
	
	
    StaticVariables(String name, String address){
		this.name = name;
		this.address = address; 
		
	}
    
    public void getAddress() {
    	System.out.println(address + " " + city);
    }

	public static void main(String[] args) {
		
		StaticVariables staticVariables = new StaticVariables("Bob", "Ruma");
		StaticVariables staticVariables1 = new StaticVariables("Rabin", "Beograd");
		staticVariables.getAddress();
		staticVariables1.getAddress();
		
		

	}

}
