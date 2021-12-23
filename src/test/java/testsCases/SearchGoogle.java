package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open url
		driver.get("https://www.google.com");

		driver.manage().window().maximize();
		WebElement googleSearch = driver.findElement(By.id("realbox"));

		googleSearch.sendKeys("selenium");
		googleSearch.sendKeys(Keys.ENTER);

	}

}
