package CMRIT.CMRIT_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CMRIT_StudentResults {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys("CMRIT");
		searchBar.sendKeys(Keys.ENTER);
		
		WebElement cmritLink = driver.findElement(By.xpath("(//h3[contains(text(),'Home - CMR Institute Of Technology , Hyderabad, Te')])[1]"));
		cmritLink.click();
		
		Thread.sleep(3000);
		
		Actions builder = new Actions(driver);
		
		WebElement student = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]"));
		builder.moveToElement(student).perform();
		student.click();
		Thread.sleep(2000);
		WebElement studentLogin = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[9]/ul[1]/li[1]/a[1]"));
		studentLogin.click();
		WebElement userName = driver.findElement(By.xpath("(//input[@id='txtUserName'])[1]"));
		Thread.sleep(2000);
		userName.sendKeys("20R01A05K6p");
		
		WebElement nxtBtn = driver.findElement(By.name("btnNext"));
		nxtBtn.click();
		
		WebElement password = driver.findElement(By.xpath("(//input[@placeholder='Enter Password'])[1]"));
		password.sendKeys("20R01A05K6P");
		
		WebElement submit = driver.findElement(By.xpath("(//input[@name='btnSubmit'])[1]"));
		submit.click();
		}
}
