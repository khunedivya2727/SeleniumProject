package seleniumpgm;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoqaEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.xpath("//li[@class=\"btn btn-light active\"]")).click();
		
		
		
		driver.findElement(By.id("firstName")).sendKeys("Divya");
		driver.findElement(By.id("lastName")).sendKeys("Khune");
		driver.findElement(By.id("userEmail")).sendKeys("Divya@gmail.com");
		driver.findElement(By.xpath("(//label[@class=\"form-check-label\"])[2]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("1234556896");
		Thread.sleep(2000);
		
		Select DOB=new Select(driver.findElement(By.xpath("//input[@class=\"form-control react-datepicker-ignore-onclickoutside\"]")));
		
		DOB.selectByVisibleText("2005");
		Thread.sleep(2000);
		DOB.selectByVisibleText("September");
	    Thread.sleep(2000);
		//driver.findElement(By.className("react-datepicker__day react-datepicker__day--027 react-datepicker__day--selected")).click();
		
		driver.findElement(By.id("subjectsInput")).sendKeys("Sofware_Tester");
		
		driver.findElement(By.xpath("(//label[@class=\"form-check-label\"])[4]")).click();
		driver.findElement(By.xpath("(//label[@class=\"form-check-label\"])[5]")).click();
		driver.findElement(By.xpath("(//label[@class=\"form-check-label\"])[6]")).click();
		File file=new File("C:\\Users\\admin\\Pictures\\test.jpg");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[type=file]")).sendKeys(file.getAbsolutePath());
		driver.findElement(By.id("currentAddress")).sendKeys("Thane");
		driver.findElement(By.xpath("//div[@class=\"css-13cymwt-control\"]")).sendKeys("Uttar Pradesh");
		driver.findElement(By.id("city")).sendKeys("Lucknow");
		driver.findElement(By.xpath("//div[@class=\"text-right col-md-2 col-sm-12\"]")).click();
		
		driver.findElement(By.id("submit")).click();
		

	}

}
