package jUnit_TestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddString {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		String result = junit.AddStrings("Hello", " World");
		assertEquals("Hello World",result);
	}

}