package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserVerifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		
		//To open Chrome Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testleaf.herokuapp.com/pages/Edit.html");
		
		driver.findElement(By.xpath("//input[@value = 'Append ']")).sendKeys("Appended text");
		System.out.println(driver.findElement(By.xpath("//input[@value = 'Append ']")).getText());
		
		driver.quit();

	}

}