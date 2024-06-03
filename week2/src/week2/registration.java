package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdrive.chrome.driver","C:\\Users\\STUDENT\\Downloads\\chromedriver-win64 (11)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(2000);
		Actions builder=new Actions(driver);
		WebElement customerLogin=driver.findElement(By.xpath("(//a[normalize-space()='customer Login'])[2]"));
		builder.moveToElement(customerLogin).perform();
		Thread.sleep(2000);
		WebElement register =driver.findElement(By.xpath("(//a[normalize-space()='Register'])[2]"));
		register.click();
		Thread.sleep(2000);
		WebElement firstname=driver.findElement(By.id("acc_first_name"));
		firstname.sendKeys("CSD");
		Thread.sleep(2000);
		WebElement lastname=driver.findElement(By.id("acc_last_name"));
		lastname.sendKeys("B");
		Thread.sleep(2000);
		WebElement emailId=driver.findElement(By.id("acc_user_email"));
		emailId.sendKeys("csdb@gmail.com");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("acc_user_password"));
		password.sendKeys("12345");
		Thread.sleep(2000);
		WebElement passconfirmation=driver.findElement(By.id("acc_user_passconfirmation"));
		passconfirmation.sendKeys("12345");
		Thread.sleep(2000);
		WebElement mobileno=driver.findElement(By.id("acc_user_mobileno"));
		mobileno.sendKeys("1234567890");
		Thread.sleep(2000);
		WebElement registerbtn =driver.findElement(By.xpath("(//a[normalize-space()='Register'])"));
		registerbtn.click();
		Thread.sleep(2000);
	}

}
