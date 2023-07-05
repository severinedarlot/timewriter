package com.sdarlot.timewriter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EnglishTimeWriterTests {

	@Test
	void writeNoon() {
		assertEquals("Noon", EnglishTimeWriter.write("12:00"), "12:00 should be written as Noon");
	}
}
