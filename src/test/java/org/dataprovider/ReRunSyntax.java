package org.dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunSyntax {
	
	@Test
	private void tc1() {
		System.out.println("tc11");
	}
	@Test
	private void tc2() {
		Assert.assertTrue(false);
		System.out.println("tc2");
	}
	@Test
	private void tc3() {
		System.out.println("tc3");
	}
	
	@Test
	private void tc4() {
		System.out.println("tc4");
	}
	
	
}
