package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MhouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/menu/");

		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		WebElement mouseHouver = driver.findElement(By.linkText("Main Item 2"));
		
		action.moveToElement(mouseHouver).build().perform();
		
	}

}
