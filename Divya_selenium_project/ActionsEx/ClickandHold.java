package ActionsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		WebElement elementA=driver.findElement(By.xpath("//li[@name=\"A\"]"));
		
		WebElement elementB=driver.findElement(By.xpath("//li[@name=\"A\"]"));
		
		Actions actions=new Actions(driver);
		
		Action action=actions.clickAndHold(elementB).moveToElement(elementA).release(elementB).build();
		action.perform();
		
		WebElement elementD=driver.findElement(By.xpath("//li[@name=\"D\"]"));
		WebElement elementF=driver.findElement(By.xpath("//li[@name=\"F\"]"));
		
		action= actions.clickAndHold(elementF).moveToElement(elementD).release(elementF).build();
		action.perform();
		
		



	}

}
