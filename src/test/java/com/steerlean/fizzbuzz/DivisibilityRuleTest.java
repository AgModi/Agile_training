package com.steerlean.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.steerlean.fizzbuzz.rule.DivisibilityRule;

public class DivisibilityRuleTest {
	private DivisibilityRule drt;
	@Test
	public void test1() {
		drt = new DivisibilityRule(3, "HI");
		
		String response = drt.parse(6);
		String expectedResult = "HI";
		
		Assert.assertEquals(response, expectedResult);
	}

}
