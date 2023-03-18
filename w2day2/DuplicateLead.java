package w2day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class DuplicateLead {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// to launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		// to load the url 
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aadhitya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Siddharth");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Comment");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aadhi21@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sta = new Select(state);
		sta.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajesh");
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		// TODO Auto-generated method stub

	}

}
