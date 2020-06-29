package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosTestPage {

	WebDriver driver;

	public TechfiosTestPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement Toggle_All;
	@FindBy(how = How.NAME, using = "todo[14]")
	WebElement Single_button;
	@FindBy(how = How.XPATH, using = " //body/div[1]")
	WebElement remove_button;

	public void checkToggleAll() {
		Toggle_All.click();

	}

	public void takeScreenshotAtEndOfTest() throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		String currentDir = System.getProperty("user.dir");
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(currentDir + "/screenshots/" + "After_clicking_Toggle_all" + ".png");
		FileUtils.copyFile(sourceFile, destinationFile);
	}

	public void singleCheckboxSelect() {
		if (Toggle_All.isSelected()) {

			Toggle_All.click();
			Single_button.click();
			remove_button.click();
		} else {
			System.out.println("Button is not selected");

		}
	}
	public void removeAllList() {
		Toggle_All.click();
		remove_button.click();
	}
}