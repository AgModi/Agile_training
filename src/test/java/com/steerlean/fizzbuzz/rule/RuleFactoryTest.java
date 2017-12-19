package com.steerlean.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.steerlean.fizzbuzz.rule.DivisibilityRule;
import com.steerlean.fizzbuzz.rule.IRule;
import com.steerlean.fizzbuzz.rule.RuleFactory;

public class RuleFactoryTest {

	RuleFactory ruleFactory;
	
	@Test
	public void test1() {
		ruleFactory = new RuleFactory();
		IRule expectedRule = new DivisibilityRule(2, "HI");
		IRule actualRule = ruleFactory.createDivisibilityRule(2, "HI");
		Assert.assertEquals(expectedRule, actualRule);
	}

}
