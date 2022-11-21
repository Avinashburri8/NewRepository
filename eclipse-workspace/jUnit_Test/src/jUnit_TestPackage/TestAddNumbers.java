package jUnit_TestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.AddNumbers(100, 200);
		assertEquals(300,result);
	}

}