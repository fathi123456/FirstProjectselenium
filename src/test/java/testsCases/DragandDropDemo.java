package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropDemo {

	public static void main(String[] args) {
		// open chrome
		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open url
		driver.get("https://demoqa.com/droppable/");

		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		WebElement fromTo = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		action.dragAndDrop(fromTo, to).perform();

		String texteTo = to.getText();
		if (texteTo.equals("Dropped!")) {

			System.out.println("Pass : source is droped to target as expected");
		} else {

			System.out.println("Failed : source coudn't target as expected ");
			
		}
		driver.quit();
	}
 
}
