package seleniumpgm;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertwithWaitEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(3000);

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));

		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
	}

}
