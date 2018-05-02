package com.fogtest.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiApplicationTests {

	@Before
	public void setUp() {
		// Do something before all tests
	}

	@After
	public void tearDown() {
		// Do something after all tests
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void testAdd() {
		int a = 1, b = 1;
		Assert.assertEquals(2, a + b);
	}
}
