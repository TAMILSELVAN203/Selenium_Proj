package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {
	public static void main(String[] args) {
		WebDriver WD = new ChromeDriver();
		WD.get("https://www.Linkedin.com/login");
		WebElement LoginId = WD.findElement(By.id("username"));
		LoginId.sendKeys("T@mil");
		WebElement Password = WD.findElement(By.id("password"));
		Password.sendKeys("T@mil@123");
		WebElement Signin = WD.findElement(By.name("Sign in"));
		Signin.click();
	}

}
