package exception;

public class Eligiblity {
public void votingeligiblity() {
	int age=17;
	if(age>=18) {
		
		System.out.println("The candidate eligible for voting");
	}
	
	else {
		
	//System.out.println("The candidate not eligible for voting");
		throw new ArithmeticException("Not eligible");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eligiblity El=new Eligiblity();
				El.votingeligiblity();
	}

}
