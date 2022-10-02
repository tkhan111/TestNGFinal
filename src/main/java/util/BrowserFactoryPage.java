package util;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactoryPage {

	static WebDriver driver;
	
	
	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static int generateRandomnumber() {
		Random random = new Random();
		int number = random.nextInt(10000);
		int newNumb = number*5;
		System.out.println(number*5);
		return newNumb;
		
	}
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
}
