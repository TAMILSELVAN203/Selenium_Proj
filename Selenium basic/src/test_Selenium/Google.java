package test_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		String url = driver.getCurrentUrl();
		System.out.println(url);

		String pagecode = driver.getPageSource();
		System.out.println(pagecode);

		Thread.sleep(9000);
		driver.close();
	}

}
