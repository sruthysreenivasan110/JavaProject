package polymorphisam;

public class poly2 extends poly{

	public int add(){
		int sum=super.add();
		
		if(sum % 10 == 0){
			System.out.println("The sum is divisible by 10");
			
		}
		else{
			System.out.println("The sum is not divisible by 10");
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		poly2 obj=new poly2();
		obj.add();
	}

}
