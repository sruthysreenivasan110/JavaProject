package student;

public class Adress {

	StudentDetails stu;
	String Housename;
	public Adress(StudentDetails stu,String Housename) {
		this.stu=stu;
		this.Housename=Housename;
		
		
	}
	
public void display() {
		
		System.out.println(stu.name);
		System.out.println(stu.roll);
		System.out.println(Housename);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails stu1 = new StudentDetails("sruthy",48);
		Adress ad= new Adress(stu1,"Kalathil");
		ad.display();
	}

}
