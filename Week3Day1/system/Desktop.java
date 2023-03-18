package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("desktopSize");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer cp = new Computer();
		cp.model();
		Desktop dp = new Desktop();
		dp.desktopSize();
	}

}
