package com.park.selTest;
//
//import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SelTest1 extends SelTest {

	@Test
	public void testApp1() {
		System.out.println("Driver 1: " + driver.toString());
		driver.get("https://www.google.com/?gws_rd=ssl");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("adsfkljasdfkjasdkjfakjsdfhkjahsdkjfhaksjdhfkjsdhfkjshfdkjshjkdf");
        element.submit();
		driver.quit();
	}
}