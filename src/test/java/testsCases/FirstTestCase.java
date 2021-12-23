package testsCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException  {

		//open chrome
		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");	

		WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open url orangeHRM	
		driver.get("https://opensource-demo.orangehrmlive.com/");
        
		driver.manage().window().maximize();
		// fill username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		// fill passeword
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// click login
		//driver.findElement(By.id("btnLogin")).click();
		
		//clock login button with explicit wait
		WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement btnlogin;;
        btnlogin=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLogin")));
        btnlogin.click();
       
        //
        String userAdmin=driver.findElement(By.id("welcome")).getText();
        Assert.assertEquals("Welcome Paul", userAdmin);
        
		// print a log in message to the screen
		System.out.println("successeful aurtentification");
		
		Thread.sleep(3000);
		//kil browser
		//driver.close();
		driver.quit();
        

	}

}
