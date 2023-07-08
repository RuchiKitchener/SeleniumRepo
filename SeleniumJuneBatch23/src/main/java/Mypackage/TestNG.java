package Mypackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test
	@Parameters({"Admin", "Subscriber"})
	public void testcase1(String a, String b) {
		System.out.println(a +" and "+ b);
	}
	@Test
	public void testcase2() {
		
	}
}
