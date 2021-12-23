package testsCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClockDemo {

	public static void main(String[] args) {

		// open chrome
		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open url
		driver.get("http://demoqa.com/buttons");

		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(btnRightClick).perform();
        
		// TODO 
		String message2 = driver.findElement(By.id("rightClickMessage")).getText();
        Assert.assertEquals(message2 , "You have done a right click"); 
        
        System.out.println("You have done a right click");

		driver.quit();

	}

}
