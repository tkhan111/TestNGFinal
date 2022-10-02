package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DuplicateCategoryPage {

	WebDriver driver;
	String text = "Hello";

	public DuplicateCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@type='text' and @name='categorydata']")
	WebElement TextBox;

	@FindBy(how = How.XPATH, using = "//input[@type='submit' and @name='submit' and @value='Add category']")
	WebElement AddCategoryButton;

	@FindBy(how = How.XPATH, using = "//a[@style='border-style: solid; border-width: 1px; border-color: ; text-decoration: none; color: black']/following-sibling::a[543]/child::span")
	WebElement CheckTextBox;

	public void validateCategoryName() throws InterruptedException {

		TextBox.sendKeys(text);
		AddCategoryButton.click();
		
		//.getPageSource() is a method of WevDriver class. it returns source code of the page which strored as string
		if (driver.getPageSource().contains("The category you want to add already exists:")) {
			System.out.println("The category you want to add already exists: " + text);
			Thread.sleep(3000);
			//navigating back 
			driver.navigate().back();
		}
	}

}
