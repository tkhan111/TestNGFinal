package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCategoryPage;
import util.BrowserFactoryPage;

public class AddCategoryTest {
	
	WebDriver driver;
	
	@Test
	public void validateTextBox()  {
	
	driver = BrowserFactoryPage.init();
	AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
	addCategoryPage.sendTextKeys(BrowserFactoryPage.generateRandomnumber());
	
	
	
	}

}
