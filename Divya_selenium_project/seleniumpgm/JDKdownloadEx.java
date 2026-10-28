package seleniumpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDKdownloadEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Windows")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("https://download.oracle.com/java/26/latest/jdk-26_windows-x64_bin.exe")).click();
		
		
	}

}
