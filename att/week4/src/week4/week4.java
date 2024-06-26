package week4;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class week4 {

	public static void main(String[] args) {
		HashMap<String, Object>prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 0);
		ChromeOptions op=new ChromeOptions();
		op.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nenav\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver(op);
		d.manage().window().maximize();
		d.get("https://www.axisbank.com/");
		WebElement pop=d.findElement(By.xpath("/html/body/div[1]/div[1]/(span)"));
		pop.click();
	}

}