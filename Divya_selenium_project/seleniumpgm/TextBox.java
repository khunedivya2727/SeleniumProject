package seleniumpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		WebElement textbox=driver.findElement(By.id("userName"));
		Actions actions=new Actions(driver);
		actions.keyDown(textbox,Keys.SHIFT).sendKeys("Divya Khune").keyUp(Keys.SHIFT).build().perform();
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("Divya123@gmail.com");
		
		WebElement currentAdd=driver.findElement(By.id("currentAddress"));
		Actions address=new Actions(driver);
		address.keyDown(currentAdd,Keys.SHIFT).sendKeys("vitawa thane maharashtra").keyUp(Keys.SHIFT).build().perform();
		
		WebElement permanentAdd=driver.findElement(By.id("permanentAddress"));
		Actions peradd=new Actions(driver);
		peradd.keyDown(permanentAdd,Keys.SHIFT).sendKeys("vitawa thane maharashtra").keyUp(Keys.SHIFT).build().perform();
		
		WebElement submit=driver.findElement(By.id("submit"));
		submit.click();

	}

}
