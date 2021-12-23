package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromDropDowList {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/select-menu");

		driver.manage().window().maximize();

		Select color = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		color.selectByIndex(6);
		//color.selectByValue("9");
		//color.deselectByVisibleText("Black");
		
		driver.quit();
		
	}
	
}
