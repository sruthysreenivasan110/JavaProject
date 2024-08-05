package polymorphisam;

public class child extends parent{
public void add() {
	int c =a-b;
	System.out.println(c);
	  super.add();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child chi = new child();
		chi.add();
	}

}
