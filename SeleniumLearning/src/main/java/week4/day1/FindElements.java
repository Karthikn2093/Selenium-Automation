package week4.day1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		
		driver.findElement(By.xpath("//i[@class='pi pi-table layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("(//span[text()='Table'])[2]")).click();
		Thread.sleep(3000);
		
		List<WebElement> findElements = driver.findElements(By.xpath("//tbody//tr//td[5]"));
				
		ArrayList empList = new ArrayList();
			
		for (int i = 1; i <findElements.size(); i++) {
			
			if(findElements.get(i).getText().equalsIgnoreCase("Unqualified")) {
				
				empList.add(driver.findElement(By.xpath("//tbody//tr["+i+"]//td[3]")).getText());
				
			}
			
		}
		
		System.out.println(empList);
	
		driver.quit();

	}

}
