package MontageIndia;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class MontageIn {

private static WebElement element;

public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.montageindia.com/auth/user/login");

Thread.sleep(1000);

driver.findElement(By.xpath("//button[normalize-space()='Continue with Email']")).click();

Thread.sleep(1000);

driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("teeesst@gmail.com");

Thread.sleep(3000);

driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Test@123456");

Thread.sleep(4000);

driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/button\r\n"+ "")).click();

Thread.sleep(4000);

driver.findElement(By.xpath("//a[@href='/image']")).click();

Thread.sleep(5000);

driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[2]/div/div[3]/div/div/div/div/div[2]/div[1]/div/div[1]/div/img")).click();

Thread.sleep(5000);

//driver.findElement(By.xpath("//input[@placeholder='Find your perfect stock']")).sendKeys("Images");

driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div/div[3]")).click();

Thread.sleep(5000);

driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/button")).click();

Thread.sleep(5000);

driver.findElement(By.xpath("//*[@id=\"cart-popup\"]/div[2]/a")).click();

Thread.sleep(4000);

WebElement stateDropdown = driver.findElement(By.id("state-select"));
Select select = new Select(stateDropdown);
select.selectByVisibleText("Assam");

Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/table/tfoot/tr/td[5]/div/button[2]")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div[8]/div/div[6]/button[1]")).click();

Thread.sleep(2000);



}

}



Thread.sleep(2000);

}

}
