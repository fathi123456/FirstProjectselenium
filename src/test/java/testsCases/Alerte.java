package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerte {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();

		driver.findElement(By.id("alertButton")).click();

		//accept Alert
		driver.switchTo().alert().accept();
		
		driver.quit();
		
	}

}
