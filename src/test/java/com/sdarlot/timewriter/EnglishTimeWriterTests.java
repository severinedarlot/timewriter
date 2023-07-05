package com.sdarlot.timewriter;

import static com.sdarlot.timewriter.EnglishTimeWriter.write;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EnglishTimeWriterTests {

	@Test
	void writeNoon() {
		assertEquals("Noon", write("12:00"), 
			"12:00 should be written as Noon");
	}

	@Test
	void writeMidnight() {
		assertEquals("Midnight", write("00:00"), 
			"00:00 should be written as Midnight");
	}
}
