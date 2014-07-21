package com.park.selTest;

import org.testng.annotations.Test;

public class SelTest2 extends SelTest {
	
	@Test
	public void testApp2() {
		System.out.println("Driver 2: " + driver.toString());
//		driver.get("http://www.google.com/?gws_rd=ssl");
//		driver.get("http://engadget.com");
		driver.get("http://www.google.com");
//		driver.get("http://www.youtube.com");
//		driver.get("http://www.twitter.com");
		
//        WebElement element = driver.findElement(By.name("q"));
//        element.sendKeys("Cheese!");
//        element.submit();
//        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver d) {
//            	return d.getTitle().toLowerCase().startsWith("cheese!");
//            }
//        });
		driver.quit();
	}
}