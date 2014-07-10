package com.park.selTest;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestAll {
	@Test
	public void testAllTests() {
		XmlSuite suite = new XmlSuite();
		suite.setName("TestAll");
		suite.setParallel("classes");
		suite.setThreadCount(5);

		XmlTest test = new XmlTest(suite);
		test.setName("TmpTest");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("com.park.selTest.SelTest1"));
		classes.add(new XmlClass("com.park.selTest.SelTest2"));
		classes.add(new XmlClass("com.park.selTest.SelTest3"));
		test.setXmlClasses(classes) ;
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();
	}
}
