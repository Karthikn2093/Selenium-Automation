package webApps;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@name='courses']//tr//td[2]"));
		
		ArrayList priceList = new ArrayList();
		
		for (int i = 2; i < findElements.size(); i++) {
			
			if(findElements.get(i).getText().contains("Selenium")) {
				String text = driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]//td[3]")).getText();
				System.out.println(text);
				priceList.add(text);
			}
			
		}
		System.out.println(priceList);
		Thread.sleep(3000);
		driver.quit();
	}

}
