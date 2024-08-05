package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Practice_1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.facebook.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		WebElement userName = driver.findElement(By.xpath("//input[@name='email' or id='email']"));
		userName.sendKeys("tamil1234");
		WebElement password = driver.findElement(By.xpath("//input[@name='pass' or id='pass']"));
		password.sendKeys("Tamil@123");
		*/
		driver.get("https://www.redbus.in/");
		WebElement sourceLocation = driver.findElement(By.id("//input[@id='src' and type='text']"));
		sourceLocation.sendKeys("Namakkal");
		
	}
}
