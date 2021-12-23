package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src\\test\\sources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open url
		driver.get("http://demo.guru99.com/test/upload/");

		driver.manage().window().maximize();
		
		WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
		uploadFile.sendKeys("C:\\Users\\Fathi\\Desktop\\formation\\a.txt");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
        Thread.sleep(3000);
        driver.navigate().refresh();
        
        Thread.sleep(3000);
        driver.navigate().back();
        
        Thread.sleep(3000);
        driver.navigate().forward();
        
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //Vertical scroll - down by 150  pixels
        js.executeScript("window.scrollBy(0,150)");
       
     // sendKeys with javascript executor
     		//JavascriptExecutor jS = (JavascriptExecutor) driver;
     		//jS.executeScript("document.getElementById('id').value='TEXT';");
     		
       
	}
	

}
