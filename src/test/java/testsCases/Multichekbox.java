package testsCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multichekbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/select-menu");

		driver.manage().window().maximize();

		List<WebElement> cars = driver.findElements(By.name("cars"));
		for (WebElement element : cars) {
			System.out.println(element.getText());
			driver.quit();

		}
		

		
	}

}
