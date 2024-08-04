package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {
	public static void main(String[] args) {
		WebDriver Wd = new ChromeDriver();
		Wd.get("https://login.Yahoo.com/");
		String Title = Wd.getTitle();
		System.out.println(Title);
		String url = Wd.getCurrentUrl();
		System.out.println(url);
		WebElement UserName = Wd.findElement(By.id("login-username"));
		UserName.sendKeys("Selva.123@yahoo.com");
		WebElement Nextbutton = Wd.findElement(By.name("signin"));
		Nextbutton.click();
	}

}
