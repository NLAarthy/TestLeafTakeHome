package w3day1;

public class Calculator {
	public void add(int a,int b) {
		int outPut2Paramaters = a+b;
		System.out.println("outPut2Paramaters: "+ outPut2Paramaters);
		
	}
	public void add(int a,int b,int c) {
		int outPut3Paramaters = a+b+c;
		System.out.println("outPut3Paramaters : "+outPut3Paramaters);
		
}
	public void multiple(double a,double b) {
	double outPut4Paramaters=a*b;
		System.out.println("outPut4Paramaters :"+outPut4Paramaters);
				
		
}
	public void multiple(int a,double b)
	{
		int outPut5Paramaters=(int) (a*b);
		double outPut6Paramaters=a*b;
		System.out.println("outPut6Paramaters :" +outPut6Paramaters);
		System.out.println("outPut5Paramaters :" +outPut5Paramaters);
	}
	public static void main(String[]args) {
		Calculator lo=new Calculator();
		lo.add(5, 6 ,7 );
        lo.multiple(-1.79769313486231E3, 3.666666666);		
		lo.multiple(9, 4.789000000);
		lo.add(5, 54);
		System.out.println("add");
		System.out.println("multiple");

		
	}
	
}

		