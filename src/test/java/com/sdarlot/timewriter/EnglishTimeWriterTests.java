package com.sdarlot.timewriter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EnglishTimeWriterTests {

	@Test
	void writeNoon() {
		assertEquals("Noon", EnglishTimeWriter.write("12:00"), 
			"12:00 should be written as Noon");
	}

	@Test
	void writeMidnight() {
		assertEquals("Midnight", EnglishTimeWriter.write("00:00"), 
			"00:00 should be written as Midnight");
	}
}
