package week8;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class week8 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver", "C:\\Users\\nenav\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();

	        driver.get("https://www.google.com");

	        Thread.sleep(1000);

	        WebElement searchBar=driver.findElement(By.name("q"));

	        searchBar.sendKeys("cmrit hyderabad");

	        searchBar.sendKeys(Keys.ENTER);

	        Thread.sleep(1000);

	        WebElement img = driver.findElement(By.xpath("//a[normalize-space()='Images']"));

	        img.click();
	        
	        WebElement img1=driver.findElement(By.xpath("//img[@alt='CMR Institute of Technology | Top Engineering College in Hyderabad']"));

	        Actions a = new Actions(driver);

	        a.contextClick(img1).build().perform();

	        Robot r=new Robot();

	        r.keyPress(KeyEvent.VK_DOWN);

	        Thread.sleep(1000);

	        r.keyPress(KeyEvent.VK_DOWN);

	        Thread.sleep(1000);

	        r.keyPress(KeyEvent.VK_DOWN);

	        Thread.sleep(1000);

	        r.keyPress(KeyEvent.VK_DOWN);

	        Thread.sleep(1000);

	        r.keyPress(KeyEvent.VK_DOWN);

	        Thread.sleep(1000);

	        r.keyPress(KeyEvent.VK_DOWN);

	        Thread.sleep(1000);

	        r.keyPress(KeyEvent.VK_DOWN);

	        Thread.sleep(1000);

	        r.keyPress(KeyEvent.VK_ENTER);

	        Thread.sleep(1000);

	        r.keyPress(KeyEvent.VK_ENTER);

	        System.out.println("downloaded");

	       
	}

}