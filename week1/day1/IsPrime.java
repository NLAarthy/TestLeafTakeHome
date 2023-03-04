package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		for (int i=2; i<n-1;i++) {
			if(n == i/n) {
				System.out.println("yes Prime");
			}else {
				System.out.println("not Prime");
			}
			
		}
	}

}
