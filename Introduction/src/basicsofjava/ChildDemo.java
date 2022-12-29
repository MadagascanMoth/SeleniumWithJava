package basicsofjava;

public class ChildDemo extends ParentDemo {
	
	
	
	String name = "QAclickAcademy";
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	public ChildDemo() {
		super();
		System.out.println("I am a constructor from a child class");
	}
	
	public void getData() {
		super.getData();
		System.out.println("I am a method from a child class");
	}

	public static void main(String[] args) {
	
		
		
		ChildDemo childDemo = new ChildDemo();
		childDemo.getStringData();
		childDemo.getData();
	}

}
