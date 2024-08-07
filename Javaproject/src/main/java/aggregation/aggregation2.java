package aggregation;

public class aggregation2 {
	aggregation1 agr;
	String name;
	public aggregation2(aggregation1 agr,String name) {
		this.agr=agr;
		this.name=name;
		
	}
	
	public void display() {
		
		System.out.println(agr.a);
		
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aggregation1 ag1=new aggregation1(12);
		aggregation2  ag2=new aggregation2(ag1,"Sruthy");
		ag2.display();
	}

}
