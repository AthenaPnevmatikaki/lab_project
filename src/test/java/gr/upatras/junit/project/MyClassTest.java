package gr.upatras.junit.project;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MyClassTest {
	@Test
	void testSubtrack() {
		MyClass tester = new MyClass();
		assertEquals("POSITIVE", tester.subtrack(10, 5), "10 - 5 must be POSITIVE");
	}
}

