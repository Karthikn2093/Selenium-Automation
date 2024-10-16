package webApps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account - 3rd TestRun");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//*[@id='groupNameLocal']")).sendKeys("Debit - Local");
		driver.findElement(By.xpath("//input[contains(@id,'office')]")).sendKeys("Site-1");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("10.5 Millions");
		
		Select select = new Select(driver.findElement(By.name("industryEnumId")));
		select.selectByValue("IND_SOFTWARE");
		
		Select sel = new Select(driver.findElement(By.name("ownershipEnumId")));
		sel.selectByVisibleText("S-Corporation");
		
		Select sel1 = new Select(driver.findElement(By.name("dataSourceId")));
		sel1.selectByValue("LEAD_EMPLOYEE");
		
		Select sel2 = new Select(driver.findElement(By.name("marketingCampaignId")));
		List<WebElement> options = sel2.getOptions();
		sel2.selectByIndex(options.size()-3);
		
		Select sel3 = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		sel3.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@value = 'Create Account']")).click();
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
