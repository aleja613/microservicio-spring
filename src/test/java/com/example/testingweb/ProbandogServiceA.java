package com.example.testingweb;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
class ProbandogServiceA {
	@Test
	void testA() {
		GreetingService greetingService = new GreetingService();
		assertThat(greetingService.greet()).contains("Hello, World");
	
	}
}
