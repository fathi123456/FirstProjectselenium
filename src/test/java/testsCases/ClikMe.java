package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClikMe {

	public static void main(String[] args) {

		// open chrome
				System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				// open url
				driver.get("http://demoqa.com/buttons");

				driver.manage().window().maximize();

				Actions action = new Actions(driver);
				WebElement btnClickMe = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]"));
				action.contextClick(btnClickMe).perform();	
		
		
	}

}
