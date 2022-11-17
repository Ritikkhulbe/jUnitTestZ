package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTestFunctions JUnit = new jUnitTestFunctions();
		String result = JUnit.AddStrings("hell","o");
		assertEquals(result,"hello");
	}

}
