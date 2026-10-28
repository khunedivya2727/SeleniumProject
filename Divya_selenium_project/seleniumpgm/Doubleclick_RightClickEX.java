package seleniumpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick_RightClickEX {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		
		WebElement dblbtn=driver.findElement(By.id("doubleClickBtn"));
		Thread.sleep(2000);
		
		Actions actions=new Actions(driver);
		actions.doubleClick(dblbtn).build().perform();
		Thread.sleep(2000);
		
		WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(rightClick).build().perform();
		Thread.sleep(2000);
		
		WebElement ClickMe=driver.findElement(By.id("3uixl"));
		actions.contextClick(ClickMe).build().perform();
		
		

	}

}
