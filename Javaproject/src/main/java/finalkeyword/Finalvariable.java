package finalkeyword;

public class Finalvariable extends Finalvariable2{
	final int a=12;
/*public Finalvariable() {
	a=12;
}*/	
public final void add()	{
	
	System.out.println("Java");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalvariable fin=new Finalvariable();
		fin.add();
		System.out.println(fin.a);
		fin.sum();
	}

}
