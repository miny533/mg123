package xyzaaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ssvvv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdiver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.eroomrent.in/");
		driver.manage().window().maximize();

		Actions ac=new Actions(driver);
		WebElement ele=driver.findElement(By.partialLinkText("Broker-G"));
         ac.moveToElement(ele).build().perform();


         Thread.sleep(2000);

 		Actions ac1=new Actions(driver);
 		WebElement ele1=driver.findElement(By.partialLinkText("Owner-G"));
          ac.moveToElement(ele1).build().perform();
          Thread.sleep(2000);

  		Actions ac2=new Actions(driver);
  		WebElement ele2=driver.findElement(By.partialLinkText("Rent"));
           ac.moveToElement(ele2).build().perform();

		
		
		
		
		
		
		
		
	}

}
