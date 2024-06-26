package week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class week11 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nenav\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            Actions builder = new Actions(driver);
            driver.get("https://www.google.co.in/");
            WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
            searchBar.sendKeys("Myntra");
            searchBar.submit();

            WebElement myntraLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h3[contains(text(),'Myntra: Online Shopping for Women, Men, Kids Fashi')])[1]")));
            myntraLink.click();

            WebElement profileHyperLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Profile'])[1]")));
            profileHyperLink.click();

            WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='login / Signup'])[1]")));
            loginBtn.click();

            WebElement mobileNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='tel'])[1]")));
            mobileNo.sendKeys("9948621019");

            WebElement continueBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='submitBottomOption'])[1]")));
            continueBtn.click();

            WebElement otp01 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='otp0'])[1]")));
            otp01.sendKeys("1");

            WebElement otp02 = driver.findElement(By.xpath("(//input[@name='otp1'])[1]"));
            otp02.sendKeys("2");

            WebElement otp03 = driver.findElement(By.xpath("(//input[@name='otp2'])[1]"));
            otp03.sendKeys("3");

            WebElement otp04 = driver.findElement(By.xpath("(//input[@name='otp3'])[1]"));
            otp04.sendKeys("4");
        } finally {
            driver.quit();
        }
    }
}
