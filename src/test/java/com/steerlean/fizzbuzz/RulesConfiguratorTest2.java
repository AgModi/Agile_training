package com.steerlean.fizzbuzz;

import java.util.List;

import org.testng.annotations.Test;

import com.steerlean.fizzbuzz.rule.IRule;
import com.steerlean.fizzbuzz.rule.RuleFactory;
import com.steerlean.fizzbuzz.rule.RuleFactoryStub;

import junit.framework.Assert;

public class RulesConfiguratorTest2 {
	
	
	
	
	@Test
	public void Test() {

		RuleFactory stubRuleFactory = new RuleFactoryStub();
		RulesConfigurator ruleConfigurator = new RulesConfigurator(stubRuleFactory);
		List<IRule> actualList = ruleConfigurator.configure();
		Assert.assertEquals(4, actualList.size());
		Assert.assertEquals(stubRuleFactory.createDivisibilityRule(3, "Fizz"), actualList.get(0));
	}
}
