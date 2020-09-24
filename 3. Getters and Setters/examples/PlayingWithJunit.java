package examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PlayingWithJunit {
	@Test
	void testName() throws Exception {
		assertEquals(16, Calculator.mul(2,8));
	}
	
}
