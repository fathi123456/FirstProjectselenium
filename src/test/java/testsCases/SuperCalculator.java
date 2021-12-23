package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperCalculator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://juliemr.github.io/protractor-demo/");

		driver.manage().window().maximize();
		WebElement el1 = driver.findElement(By.xpath("//input[@ng-model='first']"));
		WebElement el2 = driver.findElement(By.xpath("//input[@ng-model='second']"));

		el1.sendKeys("5");
		el2.sendKeys("12");

		WebElement button = driver.findElement(By.id("gobutton"));
		button.click();
		Thread.sleep(3000);
		WebElement resultat = driver.findElement(By.xpath("//*[@class='ng-binding']"));
		System.out.println(resultat.getText());

	}

}
