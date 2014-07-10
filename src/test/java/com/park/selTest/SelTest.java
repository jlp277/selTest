package com.park.selTest;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.workday.fixtureclient.FixtureClient;

public abstract class SelTest {
	private int port;
	protected FixtureClient fclient;
	protected WebDriver driver;

	@BeforeClass(alwaysRun = true) 
	public void startClient() throws URISyntaxException, ClientProtocolException, IOException {
		fclient = new FixtureClient();
		port = Integer.parseInt(fclient.requestCreateFixtureServer(this.getClass().getName()));

		String PROXY = "localhost:" + port;
		Proxy proxy = new Proxy();
		proxy.setHttpProxy(PROXY);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);
		driver = new FirefoxDriver(cap);
		
		System.out.println("BeforeClass of " + (this.getClass().getName()) + ": " + fclient.toString());
	}
	
	@AfterClass(alwaysRun = true)
	public void stopServer() throws URISyntaxException, ClientProtocolException, IOException {
		fclient.requestDestroyFixtureServer(port);
		System.out.println("Closed: " + fclient + " on " + this.getClass().getName());
	}
}
