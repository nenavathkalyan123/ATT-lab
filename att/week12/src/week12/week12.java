
package week12;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week12 {

		public static void main(String[] args) throws InterruptedException, AWTException { 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nenav\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
	WebDriver driver= new ChromeDriver(); 
	driver.get("https://www.google.com/"); 
	Thread.sleep(2000); 
	WebElement searchBar = driver.findElement(By.name("q")); 
	searchBar.sendKeys("Convert word to pdf online"); 
	searchBar.sendKeys(Keys.ENTER); 
	WebElement WordTopdf = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/h3")); 
	WordTopdf.click(); 
	Thread.sleep(500); 

	WebElement chooseFileBtn = driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")); 
	chooseFileBtn.click(); 
	Thread.sleep(500); 
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); 
	StringSelection str = new StringSelection("Downloads\\cisco vip assignment.docx"); 
	clipboard.setContents(str,null); 
	Thread.sleep(500); 
	Robot robot = new Robot(); 
	robot.keyPress(KeyEvent.VK_CONTROL); 
	robot.keyPress(KeyEvent.VK_V); 
	robot.keyPress(KeyEvent.VK_ENTER); 
	Thread.sleep(10000); 
	WebElement download = driver.findElement(By.xpath("//*[@id=\"processTask\"]")); 
	download.click(); 
	} 
	}
