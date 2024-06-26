package week7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week7 {

	public static void main(String[] args) {
	


	

		System.setProperty("webdrive.chrome.driver", "C:\\Users\\nenav\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement srb=driver.findElement(By.name("q"));
		srb.sendKeys("CMRIT");
		srb.sendKeys(Keys.ENTER);
		}
		}