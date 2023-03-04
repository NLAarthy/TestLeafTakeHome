package week1.day1;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

public class LearnSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserType = "IE";

		switch (browserType) {
		case "Chrome":
			System.out.println("open Chrome browser");
			break;
		case "IE":
			System.out.println("open IE");
			break;
		case "Safari":
			System.out.println("open firebox browser");
			break;
		case "Tesla":
			System.out.println("open opera browser");
			break;
		case "HotBro":
			System.out.println("open saferi browser");
			break;
		default: 
			System.out.println("this is :"+browserType );


		}
	}

}
