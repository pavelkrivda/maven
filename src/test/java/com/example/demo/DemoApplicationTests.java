package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		Assertions.assertTrue(true);
	}

	@Test
	public void contextLoads2() {
		Assertions.assertTrue(false);
	}

}
