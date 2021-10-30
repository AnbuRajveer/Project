package org.dataprovider;

import org.testng.annotations.Test;

public class GoupingSyntax {

	@Test(groups = "frist")
	private void tc1() {
		System.out.println("hi");
	}

	@Test(groups = "second")
	private void tc2() {
		System.out.println("bye");
	}

	@Test(groups = "frist")
	private void tc3() {
		System.out.println("hi");
	}
}
