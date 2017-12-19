package com.steerlean.fizzbuzz.rule;

public class RuleFactoryStub extends RuleFactory{

	@Override
	public IRule createDivisibilityRule(int divisor, String processedString) {
		// TODO Auto-generated method stub
		return new DivisibilityRule(divisor, processedString);
	}
	
	@Override
	public IRule createSumOfDigitsDivisibility(int divisor, String processedString) {
		// TODO Auto-generated method stub
		return new SumOfDigitsDivisibility(divisor, processedString);
	}
}
