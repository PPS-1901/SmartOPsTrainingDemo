package com.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.StringCalculator;
public class MyFirstTest {
	@Test
	void add_emptyString_returnszero() {
		assertEquals(0,StringCalculator.add(""));
	}

}
