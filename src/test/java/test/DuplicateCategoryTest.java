package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCategoryPage;
import pages.DuplicateCategoryPage;
import util.BrowserFactoryPage;

public class DuplicateCategoryTest {
	
	WebDriver driver;
	
	@Test
	public void validateTextBox() throws InterruptedException  {
	
	driver = BrowserFactoryPage.init();
	DuplicateCategoryPage duplicateCategoryPage = PageFactory.initElements(driver, DuplicateCategoryPage.class);
	duplicateCategoryPage.validateCategoryName();
	
	}

}
