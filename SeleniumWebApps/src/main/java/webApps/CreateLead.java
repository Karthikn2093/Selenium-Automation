package webApps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Inf-1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mike");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gatting");
		
		Select select = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		select.selectByVisibleText("Employee");
		
		Select sel = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		sel.selectByValue("9001");
		
		Select sel1 = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		sel1.selectByIndex(5);
		
		Select sel2 = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		sel2.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("Title of the page is: " + driver.getTitle());
		
		driver.quit();

	}

}
