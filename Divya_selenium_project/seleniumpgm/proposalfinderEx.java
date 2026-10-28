package seleniumpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class proposalfinderEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://proposalfinder.com//create-wedding-profile");
		//driver.findElement(By.linkText(" Register FREE")).click();
		
		Select gender=new Select(driver.findElement(By.id("register-gender")));
		gender.selectByVisibleText("Female");
		
		driver.findElement(By.id("reg-fname")).sendKeys("Bhakti");
		driver.findElement(By.id("reg-lname")).sendKeys("huieabn");
		Thread.sleep(3000);
		Select religion=new Select(driver.findElement(By.id("cp-religion")));
		Thread.sleep(3000);
		religion.selectByVisibleText("Hindu");

		//Select caste=new Select(driver.findElement(By.id("cp-caste")));
		//religion.selectByVisibleText("Hindu");
		
		
		driver.findElement(By.id("filter-lang")).sendKeys("Marathi");
		
	}

}
