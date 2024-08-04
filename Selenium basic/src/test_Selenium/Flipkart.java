package test_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wdr = new ChromeDriver();
		wdr.get("https://www.Flipkart.com/");
		
		String url = wdr.getCurrentUrl();
		System.out.println(url);
		
		String pagecode = wdr.getPageSource();
		System.out.println(pagecode);
		
		Thread.sleep(6000);
		wdr.close();
	}

}
