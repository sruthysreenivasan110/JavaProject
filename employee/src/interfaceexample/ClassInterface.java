package interfaceexample;

public class ClassInterface implements InterfaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassInterface cla=new ClassInterface();
				cla.print();
		cla.show();
	}

	public void print() {
		System.out.println("My PROGRAM");
	}
	
	public void show() {
		System.out.println("Java");
		
	}
}
