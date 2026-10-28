package seleniumpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		
		String text= driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("java");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	
	
		
	}

}
