package com.steerlean.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import mockit.Mocked;
import mockit.Verifications;

public class appTest {

	protected static final int String = 0;
	@Mocked
	private NumberProcessor mockedNumberProcessor;
	
	@Test
	public void test() {
		App app = new App(mockedNumberProcessor);
		
		app.start();
		
		new Verifications() {{
			mockedNumberProcessor.processRange(anyInt, anyInt, new ArrayList<String>());
			times = 1;
		}};
	}

}
