package w3day1;

public class AxisBank extends BankInfo {

	void deposit() {
		System.out.println("Over Ride deposit Method in subclass");
	}

	public static void main(String[] args) {
		AxisBank Obj = new AxisBank();
		Obj.deposit();

	}

}
