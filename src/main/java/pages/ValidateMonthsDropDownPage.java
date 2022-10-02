package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ValidateMonthsDropDownPage {

	WebDriver driver;

	public ValidateMonthsDropDownPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//select[@name='due_month']")
	WebElement DropDownMenu;

	public void validateTextBox() {
		//ask question why we can't use DropDownMenu when passing argument in select
	//	"//select[@name='due_month']"
		Select selectMonth = new Select(driver.findElement(By.xpath("//select[@name='due_month']")));
	//	selectMonth.selectByValue("Jan");

		List<WebElement> months = selectMonth.getOptions();
		int size = months.size();
		for (int i = 0; i < size; i++) {
			String options = months.get(i).getText();
			System.out.println(options);
		}
	}

}
