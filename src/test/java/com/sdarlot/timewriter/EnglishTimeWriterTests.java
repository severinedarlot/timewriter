package com.sdarlot.timewriter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EnglishTimeWriterTests {

	private final EnglishTimeWriter timeWriter = new EnglishTimeWriter();

	@Test
	void writeNoon() {
		assertEquals("Noon", timeWriter.write("12:00"), "12:00 should be written as Noon");
	}
}
