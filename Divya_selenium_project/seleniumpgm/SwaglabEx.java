package seleniumpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwaglabEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//chrome 
		WebDriver driver=new ChromeDriver();
		Thread.sleep(6000);
		//URL
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		
		//login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		
		//products image open
		driver.findElement(By.xpath("(//img[@class=\"inventory_item_img\"])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"back-to-products\"]")).click();
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("(//img[@class=\"inventory_item_img\"])[2]")).click();
	//	Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@id=\"back-to-products\"]")).click();
		//Thread.sleep(2000);
		
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("remove-sauce-labs-bike-light")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_badge")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("continue-shopping")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_badge")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("Divya");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("Khune");
		Thread.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("400605");
		Thread.sleep(2000);
		
		driver.findElement(By.className("shopping_cart_badge")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("Divya");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("Khune");
		Thread.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("400605");
		Thread.sleep(2000);
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("generate-pdf-order")).click();
		Thread.sleep(2000);
		
		
		

		
		
		
	}

}
