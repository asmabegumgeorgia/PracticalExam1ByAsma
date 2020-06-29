package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TechfiosTestPage;
import util.Base;

public class TechfiosTest {
	WebDriver driver;
	@Test
	public void userShouldBeAbleToCheck() throws IOException, InterruptedException {
		driver = Base.launchBrowser();
		TechfiosTestPage page = PageFactory.initElements(driver, TechfiosTestPage.class);
		page.checkToggleAll();
		page.takeScreenshotAtEndOfTest();
		page.singleCheckboxSelect();
		Thread.sleep(3000);
		page.removeAllList();
		page.takeScreenshotAtEndOfTest();
		Base.tearDown();
	}
}
