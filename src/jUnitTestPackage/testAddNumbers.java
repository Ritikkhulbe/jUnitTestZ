package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTestFunctions JUnit = new jUnitTestFunctions();
		int result = JUnit.addNumbers(100,200);
		assertEquals(result,300);
	}

}
