package com.wipro.topgear;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void before() {
		System.out.println("Before Test Case");
	}

	@Test
	public void isGreaterTest() {
		System.out.println("Test");
		HelloWorld helloWorld = new HelloWorld();
		assertTrue("JUnit Hello World", helloWorld.hello());
	}

	@After
	public void after() {
		System.out.println("After Test Case");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
