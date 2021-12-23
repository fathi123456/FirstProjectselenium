package testsCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {

		// open chrome
		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open url
		driver.get("http://demoqa.com/buttons");

		driver.manage().window().maximize();

		// instantiad action class

		Actions action = new Actions(driver);

		// Retrieve webelement to perform doubleclick
		WebElement btnDoubClick = driver.findElement(By.id("doubleClickBtn"));

		action.doubleClick(btnDoubClick).perform();

		// TODO assert
		String message = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals(message, "You have done a double click");

		System.out.println("You have done a double click");

		driver.quit();
	}

}
