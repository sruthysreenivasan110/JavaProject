package exception;

public class ExceptionTryCatch {
public void division() {
	try {
		int a=20/0;
	System.out.println(a);
}
	catch(Exception a) {
		System.out.println("exception handling" +a);
	
}
	finally {
		System.out.println("exception");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTryCatch ex=new ExceptionTryCatch();
		ex.division();
	}

}
