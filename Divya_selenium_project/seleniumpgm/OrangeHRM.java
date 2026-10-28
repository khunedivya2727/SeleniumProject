package seleniumpgm;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(6000);
		//URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		//PIM
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("firstName")).sendKeys("Divya");
		Thread.sleep(4000);
		driver.findElement(By.name("middleName")).sendKeys("Bharat");
		Thread.sleep(4000);
		driver.findElement(By.name("lastName")).sendKeys("Khune");
		Thread.sleep(4000);

        File file=new File("C:\\Users\\admin\\Pictures\\test.jpg");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[type=file]")).sendKeys(file.getAbsolutePath());
		Thread.sleep(4000);
		
		//driver.findElement(By.className("oxd-switch-input oxd-switch-input--active --label-right")).click();
		//Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		
	
		
		

	}

}
