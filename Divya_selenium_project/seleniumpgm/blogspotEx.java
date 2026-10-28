package seleniumpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class blogspotEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();

		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("name")).sendKeys("Tejas");
		driver.findElement(By.id("email")).sendKeys("Tejas@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9807654321");
		driver.findElement(By.id("textarea")).sendKeys("ganpati pada");
		driver.findElement(By.xpath("(//label[@class=\"form-check-label\"])[2]")).click();
		driver.findElement(By.xpath("(//label[@class=\"form-check-label\"])[4]")).click();
		driver.findElement(By.xpath("(//label[@class=\"form-check-label\"])[6]")).click();
		driver.findElement(By.xpath("(//label[@class=\"form-check-label\"])[8]")).click();
		driver.findElement(By.id("country")).sendKeys("India");
		Select data=new Select(driver.findElement(By.id("colours")));
		data.selectByVisibleText("Red");
		
		Select data1=new Select(driver.findElement(By.id("animals")));
		data1.selectByVisibleText("Cat");
		
		driver.findElement(By.xpath("//button[@class=\"submit-btn\"]")).click();
		

	}

	
	}


