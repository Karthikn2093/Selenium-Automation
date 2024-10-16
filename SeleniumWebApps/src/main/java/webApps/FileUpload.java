package webApps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("/src/InputFiles/sampleResume.pdf");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
