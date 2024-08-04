package test_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws Exception {
		WebDriver Drr = new ChromeDriver();
		Drr.get("https://www.Facebook.com/");

		String url = Drr.getCurrentUrl();
		System.out.println(url);

		String pagesource = Drr.getPageSource();
		System.out.println(pagesource);
		
		Thread.sleep(8000);
		Drr.close();
	}

}
