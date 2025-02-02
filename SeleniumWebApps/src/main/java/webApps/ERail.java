package webApps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ERail {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS" + Keys.TAB);
		
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Beng" + Keys.TAB);
		
		Thread.sleep(4000);
		
		int size = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr")).size();
		System.out.println(size);
		
		ArrayList<String> trainNames = new ArrayList<String>();
		
		for (int i = 2; i < size; i++) {
			
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]//td[2]//a")).getText();
			trainNames.add(text);
			
		}
		
		System.out.println(trainNames.size());
		
		Set<String> setNames = new HashSet<String>(trainNames);
		
		if(trainNames.size() == setNames.size()) {
			System.out.println("Train Names are Unique");
		}else {
			System.out.println("Train Names are Not Unique");
		}
		System.out.println(setNames.size());
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
