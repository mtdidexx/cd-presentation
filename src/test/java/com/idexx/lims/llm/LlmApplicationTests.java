package com.idexx.lims.llm;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class LlmApplicationTests {
	@Test
	public void helloTest() {
		LlmApplication app = new LlmApplication();
		assertNotNull("App should say hello", app.sayHello());
	}
}
