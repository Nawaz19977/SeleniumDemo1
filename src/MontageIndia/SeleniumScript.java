package MontageIndia;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumScript {

public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();

driver.get("https://www.montageindia.com/auth/admin/login");

Thread.sleep(1000);

System.out.println(driver.getTitle());

driver.manage().window().maximize();

driver.findElement(By.id("usernameOrEmail")).sendKeys("nawaz123");

Thread.sleep(3000);

driver.findElement(By.id("password")).sendKeys("nawaz1234");

Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/button")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\"r\"]/div/div[1]/ul/li[2]/a/span")).click();

Thread.sleep(4000);

driver.findElement(By.xpath("//a[normalize-space()='Create']")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[1]/ul/li[2]/ul/li[4]/a")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[1]/ul/li[2]/ul/li[5]/a")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[1]/ul/li[2]/ul/li[6]/a")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\"r\"]/div/div[1]/ul/li[3]/a/span")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[1]/ul/li[3]/ul/li[2]/a")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[1]/ul/li[3]/ul/li[3]/a")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\"r\"]/div/div[1]/ul/li[4]/a/span")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\"r\"]/div/div[1]/ul/li[4]/ul/li[2]/a")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\"r\"]/div/div[1]/ul/li[4]/ul/li[3]/a")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\"r\"]/div/div[1]/ul/li[4]/ul/li[4]/a")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\"r\"]/div/div[1]/ul/li[4]/ul/li[5]/a")).click();

Thread.sleep(3000);


}

}
