package w2day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebookloginpage {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//driver.close();
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aarthy");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Muthazhagan");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("iuhub@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("iuhub@gmail.com");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Aadhirt11");
		WebElement Month =driver.findElement(By.id("month"));
		Select sec=new Select(Month);
		sec.selectByIndex(2);
		WebElement Day =driver.findElement(By.id("day"));
		Select wons=new Select(Day);
		wons.selectByIndex(10);
		WebElement Year =driver.findElement(By.id("year"));
		Select dins=new Select(Year);
		dins.selectByIndex(37);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

		

		



		

		
		
		


		
	
				
	}

}
