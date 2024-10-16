package week2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To set up driver instead of System.setProperty("webdriver.chrome.driver,"path of the driver");
		WebDriverManager.chromedriver().setup();
		
		
		//To open Chrome Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.quit();
		
		

	}

}
