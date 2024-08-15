package abstraction;

public class MultipileC implements MultipileInterfaceA,MultipileInterfaceB {

	public static void main(String[] args) {
		
		 MultipileC c=new  MultipileC();
				 c.print();
		 c.show();
	}
	
	public void print() {
	System.out.println("hello world");
	}
	public void show() {
		System.out.println("java");
	}

}
