package basicsofjava;

public class AustralianTraffic implements CentralTraffic {

	public static void main(String[] args)  {
		
		
		CentralTraffic australia = new AustralianTraffic();
		australia.redStop();
		australia.flashingYellow();
		australia.redStop();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		// code
		System.out.println("Red Stop implementation");
		
	}

	@Override
	public void redStop() {
		
		
		
	}

	@Override
	public void flashingYellow() {
		// TODO Auto-generated method stub
		
	}

}
