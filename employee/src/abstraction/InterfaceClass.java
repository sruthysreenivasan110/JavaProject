package abstraction;

public class InterfaceClass implements InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass in=new InterfaceClass ();
		in.display();
		//interfacename in = new classneme
		InterfaceExample ie = new InterfaceClass();// object creation of interface-9iol
		ie.display();//
	}

	public void display() {
		
		int c=a+b;
		System.out.println(c);
	}
}
