package org.dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {
	
	@Test
	private void tc1() {
		System.out.println("tc1");
	}
	@Test(retryAnalyzer= Failed.class)
	private void tc2() {
		Assert.assertTrue(false);
		System.out.println("tc2");
	}
	@Test
	private void tc3() {
		System.out.println("tc3");
	}

}
