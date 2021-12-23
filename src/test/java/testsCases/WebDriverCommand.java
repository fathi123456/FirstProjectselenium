package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// open url orangeHRM
		String url = "https://opensource-demo.orangehrmlive.com/";

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		String titlePage = driver.getTitle();

		int titleLength = titlePage.length();

		System.out.println("Title of the page is : " + titlePage);
		System.out.println("Length of the page is : " + titleLength);

		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(url)) {
			System.out.println("Verifivatio successful -- the correct Url is opend");
		} else {
			System.out.println("verification failed -- an incorrect Url is opened");
		}
		System.out.println("Actual url is" + actualUrl);

		System.out.println("expected url is " + url);

		String pageSource = driver.getPageSource();
		int lengthPageSource = pageSource.length();
		System.out.println("Length ofthe source page is " + lengthPageSource);

		driver.quit();
	}

}
