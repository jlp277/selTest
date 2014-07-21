package com.park.selTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelTest3 extends SelTest {
	
	@Test
	public void testApp3 () {
		System.out.println("Driver 3: " + driver.toString());
		driver.get("http://abduzeedo.com");
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
            	return d.getTitle().toLowerCase().startsWith("");	
            }
        });
//		driver.quit();
	}
}
