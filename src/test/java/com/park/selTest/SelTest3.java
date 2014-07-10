package com.park.selTest;

import org.testng.annotations.Test;

public class SelTest3 extends SelTest {
	@Test
	public void testApp3 () {
		System.out.println("Driver 3: " + driver.toString());
		driver.get("http://abduzeedo.com/");
		driver.quit();
	}
}
