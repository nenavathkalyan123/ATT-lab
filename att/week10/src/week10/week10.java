package week10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class week10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				        System.setProperty("webdriver,chrome.driver", "C:\\Users\\nenav\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		        WebDriver d=new ChromeDriver();
		        d.get("http://gmail.com/");
		        Thread.sleep(2000);
		        WebElement createAccount=d.findElement(By.xpath("//span[normalize-space()='Create account']"));
		        createAccount.click();
		        Thread.sleep(2000);
		        WebElement mySelft=d.findElement(By.xpath("(//span[normalize-space()='For my personal use'])[1]"));
		        mySelft.click();
		        Thread.sleep(2000);
		        WebElement firstName=d.findElement(By.name("firstName"));
		        firstName.sendKeys("Kumar01");
		        Thread.sleep(2000);
		        WebElement lastName=d.findElement(By.name("lastName"));
		        lastName.sendKeys("Ravi");
		        Thread.sleep(2000);
		        WebElement bn1=d.findElement(By.xpath("(//span[normalize-space()='Next'])"));
		        bn1.click();
		        Thread.sleep(3000);
		        Select month=new Select(d.findElement(By.xpath("//select[@id='month'][1]")));
		        month.selectByValue("8");
		        Thread.sleep(2000);
		        WebElement day=d.findElement(By.xpath("(//input[@id='day'])[1]"));
		        day.sendKeys("06");
		        Thread.sleep(2000);
		        WebElement year=d.findElement(By.xpath("(//input[@id='year'])[1]"));
		        year.sendKeys("2003");
		        Select gender=new Select(d.findElement(By.xpath("(//select[@id='gender'])[1]")));
		        gender.selectByValue("1");
		        Thread.sleep(2000);
		        WebElement bn2=d.findElement(By.xpath("(//span[normalize-space()='Next'])"));
		        bn2.click();
		        Thread.sleep(2000);
		        WebElement uid=d.findElement(By.name("Username"));
		        uid.sendKeys("Kmrthaklb");
		        WebElement bn3=d.findElement(By.xpath("(//span[normalize-space()='Next'])"));
		        bn3.click();
		        Thread.sleep(2000);
		        WebElement pswd=d.findElement(By.name("Passwd"));
		        pswd.sendKeys("Cmrit123@");
		        WebElement cpswd=d.findElement(By.name("PasswdAgain"));
		        cpswd.sendKeys("Cmrit123@");
		        WebElement bn4=d.findElement(By.xpath("(//span[normalize-space()='Next'])"));
		        bn4.click();
			}

		}
