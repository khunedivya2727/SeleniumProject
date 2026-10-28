package ActionsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolleg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		
//		Actions action=new Actions(driver);
//		action.keyDown(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(2000);
//		
//		action.keyDown(Keys.PAGE_UP).build().perform();
//		Thread.sleep(2000);
//		
//		action.keyDown(Keys.END).build().perform();
//		Thread.sleep(2000);
//		
//		action.keyDown(Keys.HOME).build().perform();
//		Thread.sleep(2000);
//		
		
		//SCROLLBY USING JAVASCRIPT
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//scroll down vertically
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
		//scroll up
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
		
		
		WebElement element=driver.findElement(By.linkText("Sign in"));
		
		//scroll till visibility of web element
		js.executeScript("arguments[0].scrollIntoView();",element);
		Thread.sleep(4000);
		
		//scroll down the webpage a the bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		
		//scroll down the webpage a the top of the page
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(4000);
		
		
		
		
		
		

	}

}
