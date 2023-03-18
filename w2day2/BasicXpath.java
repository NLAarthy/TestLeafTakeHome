package w2day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicXpath {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeOptions option =new ChromeOptions();
		option.addArguments("remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
driver.get("http://leaftaps.com/opentaps");
driver.manage().window().minimize();
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmfa");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
String title =driver.getTitle();
System.out.println(title);
driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
driver.findElement(By.xpath("//a[(text(),'Leads')]")).click();
driver.findElement(By.xpath("//a[(text(),'Create Leads')]")).click();
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
driver.findElement(By.xpath("//input[contains(@id,'firstName']")).sendKeys("Subraja");
driver.findElement(By.xpath("//input[contains(@id,'lastName']")).sendKeys("S");
driver.findElement(By.xpath("//input[@name='submitButton']")).click();









	}

}
