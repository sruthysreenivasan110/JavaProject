package staticmethod;

public class Employee {
	int age;
	
	String name;
	public  Employee(int a,String n) {
	age = a;
	name = n;
System.out.println(age);
System.out.println(name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee(32,"Anu");
		
	}

}
