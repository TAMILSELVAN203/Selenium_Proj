package test_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.Swiggy.com/");
		
		String url = wd.getCurrentUrl();
		System.out.println(url);
		
		String pagecode = wd.getPageSource();
		System.out.println(pagecode);
		
		Thread.sleep(8500);
		wd.close();
	}

}
