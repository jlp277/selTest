package com.park.selTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelTest1 extends SelTest {

	@Test
	public void testApp1() {
		System.out.println("Driver 1: " + driver.toString());
		driver.get("http://csb.stanford.edu/class/public/pages/sykes_webdesign/05_simple.html");
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("");
            }
        });
//		driver.quit();
	}
}