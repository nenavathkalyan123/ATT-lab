package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class week3 {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","C:\\Users\\CFA\\Desktop\\22r01a6744\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("Create new account")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.name("firstname")). sendKeys("kalyan");
		    Thread.sleep(2000);
		    WebElement surname=driver.findElement(By.name("lastname"));
		    surname.sendKeys("achu");
		    Thread.sleep(500);
		    WebElement mobileNoorEmailid=driver.findElement(By.name("reg_email__"));
		    mobileNoorEmailid.sendKeys("1234567890");
		    Thread.sleep(500);
		    WebElement password=driver.findElement(By.name("reg_passwd__"));
		    password.sendKeys("123achu");
		    Select dateDropdown=new Select(driver.findElement(By.name("birthday_day")));
		    dateDropdown.selectByValue("29");
		    Thread.sleep(500);
		    Select monthDropdown=new Select(driver.findElement(By.name("birthday_month")));
		    monthDropdown.selectByValue("10");
		    Thread.sleep(200);
		    Select yearDropdown=new Select(driver.findElement(By.name("birthday_year")));
		    yearDropdown.selectByValue("2004");
		    Thread.sleep(500);
		    WebElement maleRadioBtn=driver.findElement(By.xpath("(//label[normalize-space()='Male'])[1]"));
		    maleRadioBtn.click();
		    Thread.sleep(500);
		    WebElement SignUpBtn=driver.findElement(By.name("websubmit"));
		    SignUpBtn.click();


	}

}
