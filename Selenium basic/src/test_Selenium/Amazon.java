package test_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.Amazon.com");

		String url = dr.getCurrentUrl();
		System.out.println(url);

		String pagecode = dr.getPageSource();
		System.out.println(pagecode);

		Thread.sleep(8000);
		dr.close();
	}

}
