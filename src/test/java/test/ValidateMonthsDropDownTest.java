package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.ValidateMonthsDropDownPage;
import util.BrowserFactoryPage;

public class ValidateMonthsDropDownTest {
	
WebDriver driver;
	
	@Test
	public void validateTextBox()  {
	
	driver = BrowserFactoryPage.init();
	ValidateMonthsDropDownPage validateMonthsDropDownPage = PageFactory.initElements(driver, ValidateMonthsDropDownPage.class);
	validateMonthsDropDownPage.validateTextBox();
	}

}
