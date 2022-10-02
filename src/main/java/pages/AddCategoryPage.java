package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCategoryPage {

	WebDriver driver;

	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@type='text' and @name='categorydata']")
	WebElement TextBox;

	@FindBy(how = How.XPATH, using = "//input[@type='submit' and @name='submit' and @value='Add category']")
	WebElement AddCategoryButton;

	@FindBy(how = How.XPATH, using = "//a[@style='border-style: solid; border-width: 1px; border-color: ; text-decoration: none; color: black']/following-sibling::a[543]/child::span")
	WebElement CheckTextBox;

	// a[@style='border-style: solid; border-width: 1px; border-color: ;
	// text-decoration: none; color: black']/following-sibling::a[543]/child::span

	public void sendTextKeys(int randomNum) {

		TextBox.sendKeys("Hello" + randomNum);
		
		Select dropDown = new Select(driver.findElement(By.name("colour")));
	//	dropDown.selectByValue("#FF00FF");
		dropDown.selectByIndex(7);
	//	dropDown.selectByVisibleText("Yellow");
		
		AddCategoryButton.click();

	}

}
