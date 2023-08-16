package Pakage;

public class ex {

	public int weight;
	public String name;
	
	
	public ex() {
		weight=55;
		name="미미";
	}
	

	public ex(int w,String n) {
		System.out.println("몸무게는"+w);
		System.out.println("이름"+n);
		weight=w;
		name=n;
	}
}