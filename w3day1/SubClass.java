package w3day1;

public class SubClass extends SuperClass {
	  
	
	
	public void getInfo() {
		SuperClass obj = new SuperClass();
		System.out.println(obj.currentYear);
		System.out.println(obj.getInterest(100, 5));
	 
	}
	

}
