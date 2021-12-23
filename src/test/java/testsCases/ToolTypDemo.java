package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTypDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demoqa.com/tool-tips/");

		driver.manage().window().maximize();

		WebElement textToolTyp = driver.findElement(By.id("toolTipButton"));
		String text = textToolTyp.getText();

		if (text.equalsIgnoreCase("Hover me to see")) {
			System.out.println("pass: toolTyp matching expected value");
		} else {
			System.out.println("failed: toolTyp not matching expected value");
		}
  //placeholder
		WebElement placeHolder= driver.findElement(By.id("toolTipTextField"));
		String messagPlaceholder = placeHolder.getAttribute("placeholder");
		System.out.println("the placeHolder is : " + messagPlaceholder);
		driver.quit();
		
	}

}
