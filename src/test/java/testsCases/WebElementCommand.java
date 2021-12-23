package testsCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement userName = driver.findElement(By.id("txtUsername"));
		String attribue = userName.getAttribute("id");
		System.out.println("the attribue is :" + attribue);
		userName.clear();

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement userPassword = driver.findElement(By.id("txtPassword"));

		// String password = userpassword.getAttribute("id");

		Dimension dimension = userPassword.getSize();
		System.out.println("hight : " + dimension.height + " width " + dimension.width);
		userPassword.clear();

		Point point = userPassword.getLocation();
		System.out.println("X cordinate : " + point.x + "Y cordinate : " + point.y);

		// Verifier si le bouton affiché vrai ou faux
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		boolean status = btnLogin.isDisplayed();
		System.out.println(status);

		// verifier activé vrai ou faux

		boolean status1 = btnLogin.isEnabled();
		System.out.println(status1);

		List<WebElement> login = driver.findElements(By.id("btnLogin"));

		if (login.size() != 0) {
			System.out.println("button is exist");
		} else {
			System.out.println("button is not exist");
		}
		driver.quit();

	}

}
