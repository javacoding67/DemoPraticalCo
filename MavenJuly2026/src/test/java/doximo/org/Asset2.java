package doximo.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asset2 {
	
	@Test
	private void Tc1() {
		System.out.println("tc1");
		System.out.println("tc2");
		System.out.println("tc3");

	}
	@Test(retryAnalyzer=A_Fail.class)
	private void Tc2() {
		System.out.println("tc4");
		Assert.assertTrue(false);
		System.out.println("tc5");

	}
	@Test
	private void Tc3() {
		System.out.println("tc6");
		System.out.println("tc7");

	}

}
