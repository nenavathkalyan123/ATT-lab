package week6;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week6  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\nenav\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ajio.com/");
	Thread.sleep(1000);
	WebElement ajiolink=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/span"));
	ajiolink.click();
	WebElement facebookbtn=driver.findElement(By.xpath("//span[normalize-space()='Facebook']"));
	facebookbtn.click();
	Thread.sleep(1000);
	Set<String>parentWindow=driver.getWindowHandles();
	Iterator<String> iterator=parentWindow.iterator();
	while(iterator.hasNext()) {
		String childWindow=(String) iterator.next();
		if(!parentWindow.equals(childWindow)) {
			driver.switchTo().window(childWindow);
		}
	}
	WebElement emailormobileno=driver.findElement(By.xpath("//input[@id='email']"));
	emailormobileno.sendKeys("bhumi27@gmail.com");
	WebElement pwd=driver.findElement(By.xpath("//input[@id='pass']"));
	pwd.sendKeys("@123");
	WebElement loginBtn=driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/form/div/div[4]/label[2]/input"));
	loginBtn.click();
	}

}
