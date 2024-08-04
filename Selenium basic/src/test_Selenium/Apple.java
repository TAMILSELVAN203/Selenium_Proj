package test_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apple {
	public static void main(String[] args) throws Exception {
		WebDriver wbd = new ChromeDriver();
		wbd.get("https://www.Apple.com/");

		String url = wbd.getCurrentUrl();
		System.out.println(url);

		String pagecode = wbd.getPageSource();
		System.out.println(pagecode);

		Thread.sleep(6000);
		wbd.close();

	}

}
