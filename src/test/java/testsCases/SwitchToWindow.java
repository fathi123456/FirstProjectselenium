package testsCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/browser-windows");

		driver.manage().window().maximize();

		/*
		 * store and print and stok the first window handle=driver.getwindowhandle();
		 */
		String handle = driver.getWindowHandle();
		System.out.println(handle);

		driver.findElement(By.id("windowButton")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			System.out.println(handle1);

			driver.quit();
		}

		//

	}

}
