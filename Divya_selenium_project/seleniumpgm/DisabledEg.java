package seleniumpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class DisabledEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://proposalfinder.com/create-wedding-profile");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"basic-edit edit section-btn\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"cp-fname\"]")).sendKeys("sam");
		Thread.sleep(3000);
		driver.findElement(By.id("cp-mname")).sendKeys("Tej");
		Thread.sleep(3000);
		driver.findElement(By.id("cp-lname")).sendKeys("kurkure");
		Thread.sleep(3000);
		
		JavascriptExecutor JS= (JavascriptExecutor)driver;
		
		WebElement gender=driver.findElement(By.id("cp-gender"));
		JS.executeScript("arguments[0].removeAttribute(\"disabled\")",gender);
		Select s1 = new Select(gender);
		s1.selectByVisibleText("Female");
		
		WebElement religion=driver.findElement(By.id("cp-religion"));
		JS.executeScript("arguments[0].removeAttribute(\"disabled\")",religion);
		Select s2 = new Select(religion);
		Thread.sleep(3000);
		s2.selectByVisibleText("Hindu");
		
//		WebElement caste=driver.findElement(By.id("cp-caste"));
//		JS.executeScript("arguments[0].removeAttribute(\"disabled\")",caste);
//		Select s3 = new Select(caste);
//		s1.selectByVisibleText("Hindu");
		
		
		WebElement mstatus=driver.findElement(By.id("cp-mstatus"));
		Select s4 = new Select(mstatus);
		s4.selectByVisibleText("Unmarried");
		
		WebElement living=driver.findElement(By.id("cp-hc-living-together"));
		JS.executeScript("arguments[0].removeAttribute(\"disabled\")",living);
		Select s5 = new Select(living);
		s5.selectByVisibleText("No");
		
		WebElement mtongue=driver.findElement(By.id("cp-mothertongue"));
		Select s6 = new Select(mtongue);
		s6.selectByVisibleText("Marathi");
		
		WebElement height=driver.findElement(By.id("height-value"));
		Select s7 = new Select(height);
		s7.selectByVisibleText("4 ft 0 inch");
		
		WebElement diet=driver.findElement(By.id("cp-diet"));
		Select s8 = new Select(diet);
		s8.selectByVisibleText("Occasionally Non-Veg");
		
		driver.findElement(By.id("cp-weight")).sendKeys("50");
		
		WebElement graduation=driver.findElement(By.id("cp-gtype"));
		JS.executeScript("arguments[0].removeAttribute(\"disabled\")",graduation);
		Select s9 = new Select(graduation);
		s9.selectByVisibleText("Graduate");
		
		
		
		
		
		
		
		

	}

}
